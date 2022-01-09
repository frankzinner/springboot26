package com.example.demo;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTag;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;
import com.tngtech.archunit.library.GeneralCodingRules;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo
 * <p>
 * User: frankzinner
 * Date: 21.12.21
 */
@ArchTag("OnionArchitectureTest")
@AnalyzeClasses(packages = "com.example.demo")
public class OnionArchitectureTest {

/*
    @ArchTest
    static final ArchRule rule1 = classes()
            .that().resideInAnyPackage("..domain.service..")
            .should().beInterfaces();

    @ArchTest
    static final ArchRule rule2 = classes()
            .that().resideInAPackage("..domain.service..")
            .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..");
*/

    @ArchTest
    static final ArchRule onion = onionArchitecture()
            // ignore dependencies in test classes
            .ignoreDependency("com.example.demo.DemoApplicationTests", "com.example.demo.application.ApplicationConfiguration")
            .domainModels("com.example.demo.domain.model..")
            .domainServices("com.example.demo.domain.service..")
            .applicationServices("com.example.demo.application..")
            .adapter("cli", "com.example.demo.adapter.cli..")
            .adapter("persistence", "com.example.demo.adapter.persistence..")
            .adapter("rest", "com.example.demo.adapter.rest..");

    @ArchTest
    static final ArchRule cycles = SlicesRuleDefinition.slices()
            .matching("com.example.demo.(*)..").should().beFreeOfCycles();

    // checks all subpackages of 'adapter' for cycles
    @ArchTest
    static final ArchRule adapterSubCycles = SlicesRuleDefinition.slices()
            .matching("..adapter.(**)").should().notDependOnEachOther();

    @ArchTest
    static final ArchRule generalCodingRules1 = GeneralCodingRules.NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS;

    @ArchTest
    static final ArchRule generalCodingRules2 = GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS;

    @ArchTest
    static final ArchRule generalCodingRules3 = GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION;

    @ArchTest
    static final ArchRule generalCodingRules4 = GeneralCodingRules.NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING;

    @ArchTest
    static final ArchRule generalCodingRules5 = GeneralCodingRules.NO_CLASSES_SHOULD_USE_JODATIME;

}
