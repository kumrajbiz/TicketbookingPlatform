# OnlineTicketbookingPlatform : OMTB


User requests for movie information or booking will be sent to the API gateway using Spring Cloud Gateway. This
gateway acts as a single entry point for all requests coming from different sources.

The API gateway will then communicate with the Edureka server, which acts as a client in this architecture. The
server is responsible for handling authentication and authorization of the incoming requests
.
The request will then be routed to the appropriate microservice based on the specific request. The microservices
are small, independently deployable services that are responsible for handling specific business functions. These
microservices are developed using Spring Boot and can communicate with each other using REST APIs.

To handle any potential failures or network issues, the system uses the Spring Cloud Circuit Breaker using
Resilience4j. This component monitors the status of the microservices and can fallback to a backup plan if there
are any issues.

For payment processing, the system relies on a third-party payment gateway. The payment gateway is
responsible for handling all payment-related requests and transactions.

Notification related data will be sent to the Kafka message broker, which acts as a distributed messaging system.
Workers later on can process these messages asynchronously, allowing for more efficient processing.

Finally, to ensure consistent configuration across different environments, the system uses Spring Cloud Config.
