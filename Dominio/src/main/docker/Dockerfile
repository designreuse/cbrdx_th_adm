#FROM java:8
#VOLUME /tmp
#ADD dominio.jar app.jar
#RUN bash -c 'touch /app.jar'
#EXPOSE 8446
#ENV TZ=America/Bogota
#RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
##RUN bash -c 'ping 190.147.208.155 -c 50'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM java:8
MAINTAINER Ciberdix

ADD @project.build.finalName@.jar app.jar

RUN sh -c 'touch /app.jar'
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=docker", "-jar", "/app.jar"]