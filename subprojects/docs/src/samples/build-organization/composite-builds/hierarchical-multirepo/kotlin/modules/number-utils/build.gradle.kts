plugins {
    `java-library`
    `maven-publish`
}

group = "org.sample"
version = "1.0"

repositories {
    ivy {
        name = "localrepo"
        url = uri(file("../../../local-repo"))
    }
}

publishing {
    repositories {
        ivy {
            setUrl(file("../../../local-repo"))
        }
    }
    publications {
        create<MavenPublication>("maven") { from(components["java"]) }
    }
}
