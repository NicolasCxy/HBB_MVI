plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    id("com.google.devtools.ksp")

}

android {
    namespace = "com.hbb.mvi"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.hbb.mvi"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        ndk {
            // 设置支持的SO库架构
            //abiFilters 'armeabi', 'x86', 'armeabi-v7a', 'x86_64', 'arm64-v8a'
            abiFilters += listOf("armeabi-v7a", "arm64-v8a")
        }
    }

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("Boolean", "DEBUG", "false")
        }
        getByName("debug") {
            isDebuggable = true
            buildConfigField("Boolean", "DEBUG", "true")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    dataBinding {
        enable = true
    }

}

val rxhttpVersion = "3.2.6"

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.google.code.gson:gson:2.10")
    implementation ("io.insert-koin:koin-android:3.3.1")

    // 网络
    implementation ("com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.github.liujingxing.rxhttp:rxhttp:$rxhttpVersion")
    ksp("com.github.liujingxing.rxhttp:rxhttp-compiler:$rxhttpVersion") // 用 KSP 代替 annotationProcessor

    //第三方
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("jp.wasabeef:glide-transformations:4.3.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation ("io.github.lucksiege:pictureselector:v3.11.2")    //图片选择器
    implementation ("com.github.JessYanCoding:AndroidAutoSize:v1.2.1")
    implementation ("org.javassist:javassist:3.30.0-GA")


    //常用工具
    implementation("com.tencent:mmkv:1.3.5")
    implementation("com.tencent.bugly:crashreport:latest.release")
    implementation("org.greenrobot:eventbus:3.3.1")
    implementation("io.reactivex.rxjava3:rxjava:3.1.6")
    implementation("io.reactivex.rxjava3:rxandroid:3.0.2")
    implementation("com.github.liujingxing.rxlife:rxlife-rxjava3:2.2.2") //管理RxJava3生命周期，页面销毁，关闭请求


}

// Allow references to generated code
//kapt {
//    correctErrorTypes = true
//}