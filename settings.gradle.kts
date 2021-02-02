pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
rootProject.name = "Gramophone"

include(":androidApp")
include(":shared")
include(":desktop")