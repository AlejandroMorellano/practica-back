# Fase de construcción
FROM maven:3.8.5-openjdk-17 AS build

# Establecer el directorio de trabajo en /app
WORKDIR /app

# Copiar el archivo pom.xml y descargar dependencias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar todo el código fuente y compilar la aplicación
COPY src /app/src
RUN mvn clean package -DskipTests

# Fase de ejecución
FROM openjdk:17-slim

# Establecer el directorio de trabajo en /app
WORKDIR /app

# Copiar el archivo .jar generado de la fase de construcción al contenedor
COPY --from=build /app/target/gpds-autos-0.0.1-SNAPSHOT.jar ./app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Comando para ejecutar el .jar
ENTRYPOINT ["java", "-jar", "app.jar"]
