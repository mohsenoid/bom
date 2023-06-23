pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }

    dependencyResolutionManagement {
        versionCatalogs {
            create("libs") {
                from("com.mohsenoid:mohsenoid-catalog:1.0.0")
            }
        }
    }
}

rootProject.name = "bom"

include(":app")

include(":bom")

include(":catalog")
