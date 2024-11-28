
pipeline {
    agent {label "win-agent"}
    stages {
        stage("git"){
            steps {
                echo "kjhjkhj"
                
                bat "git url: 'https://github.com/prabunsyam/Complete-Python-Bootcamp.git',credentialsId: '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', branch: 'main'"
            }
        }
    }
    
}
