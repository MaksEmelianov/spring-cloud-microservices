FROM amazoncorretto:11
EXPOSE 8081
COPY build/libs/gateway-1.0-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "gateway-service-1.0-SNAPSHOT.jar"]
#RUN apk add --no-cache bash
#COPY wait-for.sh /wait-for.sh
#RUN chmod +x /wait-for.sh
#ENTRYPOINT ["/wait-for.sh", "registry:8761", "--timeout=70", "--", "java", "-jar", "gateway-1.0-SNAPSHOT.jar"]