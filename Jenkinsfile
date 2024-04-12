pipeline {
    agent any
    stages {
        stage('Jenkins Product') {
            steps {
                echo 'Product Interface'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}