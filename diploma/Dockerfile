ARG BUILD_IMG
ARG BUILD_IMG_DEV

FROM $BUILD_IMG_DEV
ARG CWD
WORKDIR $CWD
COPY . .
COPY m2 /root/.m2
RUN mvn -DskipTests package

FROM $BUILD_IMG
ARG CWD
WORKDIR /
COPY --from=0 $CWD/target/quizConsole-1.0-SNAPSHOT.jar ./app.jar
CMD ["java", "-jar", "app.jar"]
