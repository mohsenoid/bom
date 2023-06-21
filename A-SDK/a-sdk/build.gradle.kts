plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("my-maven-publish")
}

project.ext.set("PUBLICATION_GROUP_ID", "com.mohsenoid.sdk")
project.ext.set("PUBLICATION_ARTIFACT_ID", "a")
project.ext.set("PUBLICATION_PACKAGING", "aar")
project.ext.set("PUBLICATION_COMPONENT", "release")

android {
    namespace = "com.mohsenoid.sdk.a"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    implementation(Dependencies.AndroidX.core)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.Google.material)

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.AndroidX.junit)
    androidTestImplementation(Dependencies.AndroidX.espresso)

    implementation(project(":x-core-lib"))
}