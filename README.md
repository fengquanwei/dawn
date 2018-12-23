# dawn
spring cloud micro service in action

## eureka

### start eureka server
java -jar dawn-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar dawn-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

### browser eureka server
- http://localhost:1111/
- http://localhost:1112/