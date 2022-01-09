package com.example.demo;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTag;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import java.net.URL;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.plantuml.PlantUmlArchCondition.Configurations.consideringAllDependencies;
import static com.tngtech.archunit.library.plantuml.PlantUmlArchCondition.Configurations.consideringOnlyDependenciesInDiagram;
import static com.tngtech.archunit.library.plantuml.PlantUmlArchCondition.adhereToPlantUmlDiagram;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo
 * <p>
 * User: frankzinner
 * Date: 22.12.21
 */
@ArchTag("PlantUMLTest")
@AnalyzeClasses(packages = "com.example.demo")
public class PlantUMLArchitectureTest {

    private static final URL plantUMLDiagram = PlantUMLArchitectureTest.class.getResource("/onion-rules.puml");

    @ArchTest
    static final ArchRule onionUml = classes()
//            .should(adhereToPlantUmlDiagram(plantUMLDiagram, consideringAllDependencies()));
            .should(adhereToPlantUmlDiagram(plantUMLDiagram, consideringOnlyDependenciesInDiagram()));


}
