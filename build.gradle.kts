import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm").version(Versions.Plugins.KOTLIN)
    application
}

repositories {
    mavenCentral()
}

dependencies {
}

application {
    mainClass.set("me.madhead.akademik.AkademikKt")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = Versions.JVM
    }
}
