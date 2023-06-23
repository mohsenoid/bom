plugins {
    id("version-catalog")
    id("maven-publish")
}

catalog {
    versionCatalog  {
        library("androidX-core", "androidx.core:core-ktx:1.10.1")
        library("androidX-appCompat", "androidx.appcompat:appcompat:1.6.1")
        library("androidX-activityCompose", "androidx.activity:activity-compose:1.7.2")
        library("androidX-junit", "androidx.test.ext:junit:1.1.5")
        library("androidX-espresso", "androidx.test.espresso:espresso-core:3.5.1")

        library("androidX-lifecycle-runtime", "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

        library("compose-bom", "androidx.compose:compose-bom:2023.03.00")
        library("compose-ui", "androidx.compose.ui", "ui").withoutVersion()
        library("compose-uiGraphics", "androidx.compose.ui", "ui-graphics").withoutVersion()
        library("compose-uiTooling", "androidx.compose.ui", "ui-tooling").withoutVersion()
        library("compose-uiToolingPreview", "androidx.compose.ui", "ui-tooling-preview").withoutVersion()
        library("compose-material3", "androidx.compose.material3", "material3").withoutVersion()
        library("compose-uiTestJunit4", "androidx.compose.ui", "ui-test-junit4").withoutVersion()
        library("compose-uiTestManifest", "androidx.compose.ui", "ui-test-manifest").withoutVersion()

        library("google-material", "com.google.android.material:material:1.6.0")

        library("junit", "junit:junit:4.13.2")

        version("kotlin", "1.8.10")
        library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").versionRef("kotlin")

        library("bom", "com.mohsenoid:mohsenoid-bom:2.0.0")
        library("aSdk", "com.mohsenoid.sdk", "aSdk").withoutVersion()
        library("bSdk", "com.mohsenoid.sdk", "bSdk").withoutVersion()
        }
    }

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.mohsenoid"
            artifactId = "mohsenoid-catalog"
            version = "1.0.0"

            from(components["versionCatalog"])
        }
    }
}
