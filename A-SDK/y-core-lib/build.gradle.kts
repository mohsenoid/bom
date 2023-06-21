plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("lib-maven-publish")
}

project.ext.set("PUBLICATION_GROUP_ID", "com.mohsenoid.core")
project.ext.set("PUBLICATION_ARTIFACT_ID", "yLib")
project.ext.set("PUBLICATION_PACKAGING", "aar")
project.ext.set("PUBLICATION_COMPONENT", "release")

android {
    namespace = "com.mohsenoid.core.y"
    compileSdk = SdkVersions.compileSdk

    defaultConfig {
        minSdk = SdkVersions.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {

    implementation(Dependencies.AndroidX.core)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.Google.material)

    testImplementation(Dependencies.junit)

    androidTestImplementation(Dependencies.AndroidX.junit)
    androidTestImplementation(Dependencies.AndroidX.espresso)
}