pipeline {
	agent any
	tools {
		maven 'Maven'
	}
	stages {
		stage("build"){
			steps {
				echo 'building the applications using maven..';
				sh "mvn install"
			}
		}
		stage("test"){
			steps {
				echo 'testing the applications..'; 
			}
		}
		stage("deploy"){
			steps {
				echo 'deploying the applications..';
			}
        }
    }
}