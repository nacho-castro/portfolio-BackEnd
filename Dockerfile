
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:17

COPY target/AuthApp-0.0.1-SNAPSHOT.jar AuthApp-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/AuthApp-0.0.1-SNAPSHOT.jar"]

