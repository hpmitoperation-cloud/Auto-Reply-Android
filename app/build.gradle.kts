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

    kotlin {
        jvmToolchain(17)
    }

    buildFeatures {
        dataBinding = true
        buildConfig = true // ✅ penting agar BuildConfig digenerate
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
    // 🧩 Android dasar
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // 🧭 Preferences
    implementation("androidx.preference:preference-ktx:1.2.1")

    // 💰 Google Ads
    implementation("com.google.android.gms:play-services-ads:23.3.0")

    // ⚙️ Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // 🌐 Retrofit + Gson Converter (fix unresolved reference)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // 🧠 Gson (untuk SerializedName di model/ai)
    implementation("com.google.code.gson:gson:2.10.1")
}
