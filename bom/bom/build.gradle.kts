plugins {
    id("io.github.gradlebom.generator-plugin") version "1.0.0.Final"
}

publishing {
    publications {
        create<MavenPublication>("release") {
            artifactId = "mohsenoid-bom"
        }
    }
}

bomGenerator {
    group = "com.mohsenoid"
    version = "3.0.0"

    includeDependency("com.mohsenoid.sdk", "aSdk", "7.0.0")
    includeDependency("com.mohsenoid.core", "xLib", "7.0.0")
    includeDependency("com.mohsenoid.core", "yLib", "7.0.0")

    includeDependency("com.mohsenoid.sdk", "bSdk", "1.0.0")
}
