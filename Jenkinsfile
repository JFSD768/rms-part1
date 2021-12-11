pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                bat './mvnw -B clean package' 
            }
        }
    }
    post {
        always {
	        mail to: 'fsjd-b1@googlegroups.com',
	             subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}",
	             body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}"
    	}
    }
}