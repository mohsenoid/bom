plugins {
    id("maven-publish")
}

afterEvaluate {

    publishing {
        publications {
            create<MavenPublication>("release") {
                configurePublication()
                configurePom()
            }
        }
    }
}

fun MavenPublication.configurePublication() {
    groupId = project.ext.properties.get("PUBLICATION_GROUP_ID").toString()
    artifactId = project.ext.properties.get("PUBLICATION_ARTIFACT_ID").toString()
    version = AppVersion.versionName

    from(components[project.ext.properties.get("PUBLICATION_COMPONENT").toString()])
}

fun MavenPublication.configurePom() {
    pom {
        name.set(project.name)
        packaging = project.ext.properties.get("PUBLICATION_PACKAGING").toString()
        description.set("${project.path}")
        url.set("https://mohsenoid.com")

        configureLicense()

        configureDeveloper()

        configureScm()
    }
}

fun MavenPom.configureLicense() {
    licenses {
        license {
            name.set("The Apache License, Version 2.0")
            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
        }
    }
}

fun MavenPom.configureDeveloper() {
    developers {
        developer {
            id.set("mohsenoid")
            name.set("Mohsen")
            email.set("contact@mohsenoid.com")
        }
    }
}

fun MavenPom.configureScm() {
    scm {
        url.set("https://github.com/mohsenoid/example")
        connection.set("scm:git:git@github.com:mohsenoid/example.git")
        developerConnection.set("scm:git:git@github.com:mohsenoid/example.git")
    }
}

// We don't want to publish modules metadata files to Maven repository
// https://docs.gradle.org/current/userguide/publishing_gradle_module_metadata.html#sec:understanding-gradle-module-md
tasks.withType<GenerateModuleMetadata> {
    enabled = false
}
