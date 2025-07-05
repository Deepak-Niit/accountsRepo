#Start with a base image containing Java runtime
#openjdk - image name
#17-jdk-slim - tag name
FROM openjdk:17-jdk-slim

#Information around who maintains the image
MAINTAINER eazybytes.com

# Add the application's jar to the image
COPY target/accountrepo-0.0.1-SNAPSHOT.jar accountrepo-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accountrepo-0.0.1-SNAPSHOT.jar"]

EXPOSE 5000
