#FROM java:8
#VOLUME /tmp
#ADD logica.jar app.jar
#RUN bash -c 'touch /app.jar'
#EXPOSE 8449
#ENV TZ=America/Bogota
#RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
##RUN bash -c 'ping www.google.com'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM java:8
MAINTAINER Ciberdix

VOLUME /tmp
ADD @project.build.finalName@.jar app.jar
ENV TZ=America/Bogota
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN sh -c 'touch /app.jar'
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=docker", "-jar", "/app.jar"]
