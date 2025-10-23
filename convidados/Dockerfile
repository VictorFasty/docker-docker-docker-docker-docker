# --- ESTÁGIO 1: O "CONSTRUTOR" (BUILDER) ---
# Usando a tag oficial mais recente do Maven com Temurin 21
FROM maven:3.9.8-eclipse-temurin-21 AS builder
WORKDIR /app

# Copia só o pom.xml e baixa dependências (para cache)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o resto do código-fonte e constrói o .jar
COPY src ./src
RUN mvn clean package -DskipTests

# --- ESTÁGIO 2: A "IMAGEM FINAL" (RUNTIME) ---
# Mantemos a imagem 'eclipse-temurin' para o runtime
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copia o .jar do estágio anterior ('builder')
COPY --from=builder /app/target/convidados-0.0.1-SNAPSHOT.jar app.jar

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]