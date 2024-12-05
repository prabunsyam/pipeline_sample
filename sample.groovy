
pipeline {
    agent {label "sru_node"}
    stages {
        stage("git"){
            steps {
                echo "kjhjkhj"
                
                bat "git clone https://github.com/prabunsyam/Complete-Python-Bootcamp.git"
            }
        }
    }
    
}
