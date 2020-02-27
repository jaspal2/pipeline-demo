pipeline {
    agent node
    stages {
        stage('Test') {
            steps {
                sh 'docker-compose up'
            }
        }
    }
}
