pipeline {
        agent any
        environment{
            NEW_VERSION='1.3.0'
            SERVER_CREDENTIALS = credentials('docker-demo-pipeline-id')
        }
        stages {
            stage("build"){
                steps {
                    echo 'building the applications..';
                    echo "building version ${NEW_VERSION}";
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
                    withCredentials(
	                    [
		                    [ 
		                    	$class: 'UsernamePasswordMultiBinding',
		                        credentialsId:'docker-demo-pipeline-id',
		                        usernameVariable: 'USER',
		                        passwordVariable: 'PWD'
		                    ]
	                    ]
                    ){
                        sh 'echo my credentials username = $USER and passowrd = $PWD'
                    }
                }
            }

        }
    }