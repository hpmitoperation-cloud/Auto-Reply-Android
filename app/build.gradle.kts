plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.autoreply"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.autoreply"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
}
