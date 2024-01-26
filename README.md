# phc-world-config
마이크로 서비스 아키텍처에서 구성 정보를 관리하기 위한 Spring Cloud Config Server입니다.
Spring Cloud Bus와 함께 사용되어 구성 정보를 중앙 집중식으로 관리하고, 변경된 구성을 동적으로 RabbitMQ 메시지 브로커로 애플리케이션에 전파하는 데 사용됩니다.
로컬 환경에서는 지정 폴더에서 정보를 불러오고 배포 시에는 private git repository에 있는 yaml파일의 정보를 가져옵니다.
keytool로 jks 생성 후 비밀번호와 같은 민감 정보는 yaml파일에서 암호화하여 사용하였습니다.
*** 
#### Spring Cloud Config 간단 설명
애플리케이션의 설정 정보를 중앙 집중식으로 저장하고 관리합니다. 이를 통해 여러 서비스 간에 공통된 구성을 갖도록 하고, 구성 정보의 중앙 집중화로 유지보수 및 변경 관리를 용이하게 합니다.
#### Spring Cloud Bus 간단 설명
이벤트 기반 아키텍처를 사용하여 애플리케이션 간의 통신을 지원합니다. RabbitMQ 또는 Apache Kafka와 같은 메시지 브로커를 통해 이벤트가 전파되며, 이를 통해 여러 서비스 간에 메시지를 전송하고 통신할 수 있습니다.
*** 
### Stack
> * JAVA 17
> * Spring-Boot 3.2.1
> * Gradle 8.5
> * Spring Cloud Bus
> * RabbitMQ
> * key-store
*** 
### MSA
![PHC-WORL_MSA_Architecture_Config](https://github.com/javamogi/phc-world-config/assets/40781237/e0e153c8-7534-4c8d-b1a5-1cd92b0c2de0)
*** 
#### [PHC-WORLD Eureka Server](https://github.com/javamogi/phcworld-discovery)
#### [PHC-WORLD Config File Repository(private)](https://github.com/javamogi/phc-world-git-repo)
#### [PHC-WORLD Gateway](https://github.com/javamogi/phc-world-gateway)
#### [PHC-WORLD User-Service](https://github.com/javamogi/phc-world-user-service)
#### [PHC-WORLD Board-Service](https://github.com/javamogi/phc-world-board-service)
#### [PHC-WORLD Answer-Service](https://github.com/javamogi/phc-world-board-answer-service)
