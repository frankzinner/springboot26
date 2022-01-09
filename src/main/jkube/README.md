# JKube

This is the JKube plugin folder.

Add kubernetes yaml/json files to this folder.
The plugin will automatically grab the files and use them as templates.

Name the files appropriate e.g. the filename must contain the Kubernetes 'Kind'. So some-deployment.yaml will treated as deployment description and enriched with additional metadata from the plugin.

Additionally, if you name your fragment using a name prefix followed by a dash and the mapped file name, the plugin will automatically use that name for your resource. So, for example, if you name your deployment fragment myapp-deployment.yml, the plugin will name your resource myapp. In the absence of such provided name for your resource, a name will be automatically derived from your project’s metadata (in particular, its artifactId as specified in your POM).
