plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mohsenoid.example.app"
    compileSdk = SdkVersions.compileSdk

    defaultConfig {
        applicationId = "com.mohsenoid.example.app"

        minSdk = SdkVersions.minSdk
        targetSdk = SdkVersions.targetSdk

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.AndroidX.core)
    implementation(Dependencies.AndroidX.Lifecycle.runtime)
    implementation(Dependencies.AndroidX.activityCompose)

    implementation(platform(Dependencies.AndroidX.Compose.bom))
    implementation(Dependencies.AndroidX.Compose.ui)
    implementation(Dependencies.AndroidX.Compose.uiGraphics)
    implementation(Dependencies.AndroidX.Compose.uiToolingPreview)
    implementation(Dependencies.AndroidX.Compose.material3)

    testImplementation(Dependencies.junit)

    androidTestImplementation(Dependencies.AndroidX.junit)
    androidTestImplementation(Dependencies.AndroidX.espresso)

    androidTestImplementation(platform(Dependencies.AndroidX.Compose.bom))
    androidTestImplementation(Dependencies.AndroidX.Compose.uiTestJunit4)

    debugImplementation(Dependencies.AndroidX.Compose.uiTooling)
    debugImplementation(Dependencies.AndroidX.Compose.uiTestManifest)

    implementation(project(":x-core-lib"))
}
