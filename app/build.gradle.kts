plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.matrix.autoreply"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.matrix.autoreply"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // ✅ Tambahkan ini juga
    kotlin {
        jvmToolchain(17)

    buildFeatures {
        dataBinding = true // ✅ penting! agar <layout> di XML bisa dipakai
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
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // ✅ Tambahan untuk <PreferenceScreen> dan settings
    implementation("androidx.preference:preference-ktx:1.2.1")

    // ✅ Tambahan untuk Google Ads (<AdView>, adSize, adUnitId)
    implementation("com.google.android.gms:play-services-ads:23.3.0")

    // ✅ Tambahan umum (kalau ada coroutine)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
}
