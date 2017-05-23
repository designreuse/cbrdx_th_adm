FROM java:8
VOLUME /tmp
ADD logica.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8449
ENV TZ=America/Bogota
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#RUN bash -c 'ping www.google.com'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
