pipeline {
  agent {
    label 'agents'
  }
  stages {
    stage('BUILD') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('TEST') {
      steps {
        sh 'echo Test'
      }
    }

    stage('POST BUILD') {
      steps {
        archiveArtifacts(artifacts: '**/*.war', onlyIfSuccessful: true)
      }
    }

    stage('DEPLOY') {
      steps {
        deploy adapters: [tomcat9(credentialsId: '36f4bf41-38bf-4883-87f8-81adfe9f25ce', path: '', url: 'http://172.17.0.2:8080')], contextPath: 'spark', war: '**/*.war'
      }
    }

  }
}
