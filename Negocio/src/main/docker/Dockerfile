FROM java:8
VOLUME /tmp
ADD logica.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8448
#RUN bash -c 'ping www.google.com'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
