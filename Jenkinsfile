pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the app'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the app'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the app  '
            }
        }
    }
    post
    {
        always
        {
            emailext body: 'Pipeline Body', subject: 'Pipeline Subject', to: 'chandanab980302@gmail.com'
        }
    }
    
}
