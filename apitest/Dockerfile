FROM eclipse-temurin:21-jdk

WORKDIR /app

# copy entire repo (pom.xml, mvnw, apitest/)
COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]
