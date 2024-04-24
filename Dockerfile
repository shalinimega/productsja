FROM eclipse-temurin:17
COPY target/products.jar products.jar
CMD ["java","-jar","products.jar"]