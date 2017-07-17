FROM java:8
MAINTAINER Ciberdix

ADD @project.build.finalName@.jar app.jar
ENV TZ=America/Bogota
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN sh -c 'touch /app.jar'
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=docker", "-jar", "/app.jar"]
