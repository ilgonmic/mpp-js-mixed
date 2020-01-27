pluginManagement {
    repositories {
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }

        mavenCentral()

        mavenLocal()

        maven { setUrl("https://plugins.gradle.org/m2/") }
    }
}
rootProject.name = "mpp-js-mixed"

include(":shared")
include(":client")