pipeline{

    agent any

    stages {

        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber-preety.html",
                    jsonReportDirectory: 'target'

            }

        }

    }

}
