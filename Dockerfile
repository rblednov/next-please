FROM openjdk:15
COPY /dist/app.jar /app/
EXPOSE 8080
CMD java -jar /app/app.jar