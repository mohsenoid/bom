@file:Suppress("TopLevelPropertyNaming", "MemberVisibilityCanBePrivate")

object Dependencies {

    const val junit = "junit:junit:4.13.2"

    object AndroidX {
        const val core = "androidx.core:core-ktx:1.10.1"
        const val activityCompose = "androidx.activity:activity-compose:1.7.2"
        const val junit = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"

        object Lifecycle {
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"
        }

        object Compose {
            const val bom = "androidx.compose:compose-bom:2023.03.00"

            const val ui = "androidx.compose.ui:ui"
            const val uiGraphics = "androidx.compose.ui:ui-graphics"
            const val uiTooling = "androidx.compose.ui:ui-tooling"
            const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
            const val material3 = "androidx.compose.material3:material3"
            const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
            const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
        }
    }

    object Kotlin {
        const val version = "1.8.10"
        const val bom = "org.jetbrains.kotlin:kotlin-bom:$version"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
        const val test = "org.jetbrains.kotlin:kotlin-test"
    }
}
