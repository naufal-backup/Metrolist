plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose)
    application
}

dependencies {
    implementation(project(":shared"))
    implementation(libs.cmp.runtime)
    implementation(libs.cmp.foundation)
    implementation(libs.cmp.ui)
    implementation(libs.cmp.material3)
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "com.metrolist.desktop.MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Deb, TargetFormat.AppImage)
            packageName = "metrolist"
        }
    }
}

application {
    mainClass.set("com.metrolist.desktop.MainKt")
}
