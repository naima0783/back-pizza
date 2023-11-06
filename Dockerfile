# Utilisez une image de base Java officielle avec la version souhaitée
FROM openjdk:17-jdk-slim

# Définissez le répertoire de travail dans le conteneur
WORKDIR /app

# Copiez le fichier .jar construit à partir de votre projet Maven/Gradle dans le conteneur
# Assurez-vous que le chemin et le nom du fichier .jar correspondent à ceux générés par votre build
COPY target/marriopizza-0.0.1-SNAPSHOT.jar marriopizza.jar

# Exposez le port sur lequel votre application s'exécute
EXPOSE 8080

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "marriopizza.jar"]
