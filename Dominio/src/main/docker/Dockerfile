FROM java:8
VOLUME /tmp
ADD dominio-0.0.2-TH.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8444
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
