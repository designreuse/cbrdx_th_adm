FROM java:8
VOLUME /tmp
ADD dominio.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8446
#RUN bash -c 'ping 190.147.208.155 -c 50'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]