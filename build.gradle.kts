plugins {
    id("org.springframework.boot") version "3.5.0-RC1"
    id("io.spring.dependency-management") version "1.1.7"
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "com.lucashdez"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_21

repositories {
  mavenCentral()
  maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.openjfx:javafx-controls:21")
    implementation("org.openjfx:javafx-web:21")
}

javafx {
    version = "21"
    modules = listOf("javafx.controls", "javafx.web")
}

application {
    mainClass.set("com.lucashdez.awp.DesktopLauncher")
}
