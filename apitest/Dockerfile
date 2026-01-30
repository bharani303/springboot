FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

# Use shell so wildcard works
CMD ["sh", "-c", "java -jar target/*.jar"]
