### How to use

```groovy
buildscript {
    dependencies {
        repositories {
            ...
            maven {
                url 'http://nexus.howletz.com/repository/maven-public/'
            }
        }
        classpath 'com.github.howletz:git-plugin:1.1-RELEASE'
    }
}

apply plugin: 'git-plugin'

task testPrintGitInfo << {
    println project.gitCommitShortId
    println project.gitLongCommitId
    println project.gitBranchName
}

```