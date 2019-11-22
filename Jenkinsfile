pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
        sh '''export MAVEN_HOME=/usr/local/apache-maven-3.6.0
export PATH=$PATH:$MAVEN_HOME/bin
mvn -v
java -version
docker --version
docker-compose -version
pwd
cd com-microservice-plat-eureka/
mvn clean package docker:build
cd ../com-microservice-plat-zuul/
mvn clean package docker:build
cd ../com-microservice-busi-sso/
mvn clean package docker:build 
cd ../com-microservice-busi-lttsv8/
mvn clean package docker:build
'''
      }
    }

    stage('docker-compose') {
      steps {
        sh '''cd docker
docker-compose up -d'''
      }
    }

  }
}