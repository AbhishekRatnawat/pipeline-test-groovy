/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.app

import groovy.transform.PackageScope

@PackageScope
class MessageUtils {
    
    String name = null
    def script = null
    // def awscli = new AwsCli(this.script)

    MessageUtils(String name, def script) {
        this.name = name
        this.script = script
    }
    String tryReadYaml() {
        def yamlMap = this.script.readYaml(file: '.acquia/pipeline.yaml')
        return yamlMap
    }

    String hello() {
        return "Hello, ${name}!"
    }

    def tryShCommands() {
        def output = this.script.sh(script: 'echo "hello from sh command123"', returnStdout: true)
        println output
        return output
    }

    String tryReadFile() {
        def content = this.script.readFile('README.md')
        return content
    }

    def tryClosure(Closure closure) {
        return closure.call()
    }

    def tryWithEnv() {
        return "Environment variable: ${this.script.env.HELLO}"
    }

    def tryGettingStage() {
        return {
            stage('We are testing') {
                def result = this.script.sh(script: 'echo "hello from stage"', returnStdout: true)
                println "Stage result: ${result}"
            }
        }
    }
}