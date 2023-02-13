ONLINE SHOPPING APPLICATION is a project that comprises with 5 microservices built in spring boot by using java language.

Technology used for this application until now are
1.java version 17 and 19
2.intellj forr running an application
3.Postman application for testing API integration in CRUD operations
4.MySQL workbench version 8.0 for database implementation

Project built in Maven Project with the following Dependences
--MySQL driver dependences
--JPA Repository
--H2 database
--Lombok 
--Spring Web
--Spring Dev Tools
--

Service created in this project are
--Customer Service
--Product Service
--Inventory Service
--Payment Service
--Order Service

According to Our group we connect 3 services that are
Order Service, Inventory Service and Payment Service that is customer place an order, and that order check its quantity to see if it is available in a stock (calling of Inventory Service) or not, 
if the required amount is available then Paymant Service is Called to perform payment of such order

we also impliment part of front end by using 
--Node js and  Angula
