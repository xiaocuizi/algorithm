FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD spring-boot-algorithm-0.0.1-SNAPSHOT.jar app.jar
ENV TIMEZONE=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TIMEZONE /etc/localtime && echo $TIMEZONE > /etc/timezone
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-Dserver.port=9999"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]