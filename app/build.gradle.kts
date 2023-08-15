plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //Step2:
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    //ksp
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.abdul.notesapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.abdul.notesapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        jvmTarget = "17"
    }

    //Step4: viewBinding
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Step3: Add required dependencies

    //hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

    //lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0-beta01")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.0-beta01")

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    //for interceptor
    implementation("com.squareup.okhttp3:okhttp:4.9.3")

    //room
    implementation("androidx.room:room-runtime:2.4.2")
    implementation("androidx.room:room-ktx:2.4.2")
    //kapt ("androidx.room:room-compiler:2.5.2")
    ksp("androidx.room:room-compiler:2.4.2")

    //coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")

    //navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.2")

    //loader
    implementation("com.github.ybq:Android-SpinKit:1.4.0")
}