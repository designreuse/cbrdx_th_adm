FROM microsoft/nanoserver:latest
ADD ./Negocio/target/logica.jar app.jar
ENV JAVA_PKG=./server-jre-8u121-windows-x64.tar.gz \
    JAVA_HOME=C:\\jdk1.8.0_121
ADD $JAVA_PKG /
RUN setx /M PATH %PATH%;%JAVA_HOME%\bin
RUN powershell.exe 'touch C:\app.jar'
EXPOSE 8444
ENTRYPOINT java -jar C:\app.jar
