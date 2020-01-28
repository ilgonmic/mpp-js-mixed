pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.jetbrains.kotlin.multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
            if (requested.id.id == "kotlinx-serialization") {
                useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
            }
        }
    }
    repositories {
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }

        maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")

        mavenCentral()

        mavenLocal()

        maven { setUrl("https://plugins.gradle.org/m2/") }
    }
}
rootProject.name = "mpp-js-mixed"

include(":shared")
include(":client")