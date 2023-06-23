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
    version = "2.0.0"

    includeDependency(libs.)
    includeDependency("com.mohsenoid.core", "xLib", "6.0.0")
    includeDependency("com.mohsenoid.core", "yLib", "6.0.0")

    includeDependency("com.mohsenoid.sdk", "bSdk", "1.0.0")
}
