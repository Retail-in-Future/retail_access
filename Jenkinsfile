#!/usr/bin/env groovy
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'scripts/jenkins/build.sh'
            }
        }
        stage('Assemble') {
            steps {
                sh 'scripts/jenkins/assemble.sh'
            }
        }
    }
}
