How to write a Spring Web Service
=================================

1. construct wsdl;
2. write endpoint class and annotated it with @Endpoint;
3. config Spring Web Service servlet in web.xml;
4. config spring-ws-servlet.xml to generate the wsdl file.

```
It seems that the client can send request and get a response
without wsdl. The wsdl just let developers know what to send.
And even you can specify a valid xml file as the contract,
spring dose not check if it is a real wsdl file or if it
convince to the logic of your endpoint service.
```