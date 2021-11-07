FROM zunchongdadui-docker.pkg.coding.net/diyigexiangmu/common/openjdk:11
LABEL maintainer=MASIJUN

ENTRYPOINT ["java", "-Xms512m", "-Xmx2048m", "-jar", "/app.jar"]

ARG JAR_FILE
ADD ${JAR_FILE} /app.jar
EXPOSE 8080