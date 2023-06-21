plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("my-maven-publish")
}

project.ext.set("PUBLICATION_GROUP_ID", "com.mohsenoid.core")
project.ext.set("PUBLICATION_ARTIFACT_ID", "xLib")
project.ext.set("PUBLICATION_PACKAGING", "jar")
project.ext.set("PUBLICATION_COMPONENT", "java")

java {
    targetCompatibility = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17
}