pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'docker-compose down -d'
                sh 'docker-compose up -d'
            }
        }
    }
}
