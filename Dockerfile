FROM eclipse-temurin:18-jdk

WORKDIR /app

COPY ../src ./src

RUN mkdir -p out && javac -d out $(find src -name "*.java")

CMD ["java", "-cp", "out", "com.yourcompany.calculator.Main"]
