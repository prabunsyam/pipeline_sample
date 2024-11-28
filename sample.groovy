
pipeline {
    agent {label "win-agent"}
    stages {
        stage("git"){
            steps {
                echo "kjhjkhj"
                git url: 'https://github.com/prabunsyam/Complete-Python-Bootcamp.git',credentialsId: 'GitPat', branch: 'master'
            }
        }
    }
    
}