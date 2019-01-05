# dawn
spring cloud micro service in action

## 1 eureka

### 1.1 start eureka server
java -jar dawn-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1  
java -jar dawn-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

### 1.2 browser eureka
http://localhost:1111/  
http://localhost:1112/

### 1.3 start eureka client provider
java -jar dawn-eureka-client-provider-0.0.1-SNAPSHOT.jar --server.port=8081  
java -jar dawn-eureka-client-provider-0.0.1-SNAPSHOT.jar --server.port=8082

### 1.4 start eureka client consumer
java -jar dawn-eureka-client-consumer-0.0.1-SNAPSHOT.jar --server.port=8181  
java -jar dawn-eureka-client-consumer-0.0.1-SNAPSHOT.jar --server.port=8182

### 1.5 test
http://localhost:8181/hello  
http://localhost:8182/hello