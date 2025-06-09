## Disease Statistics using design patterns

This application view the data from John Hopkins and Disease.io API responses but it will also filter the JSON response in such a way that it displays only the count of the people infected with a specific disease or the infected ratio when a request is made.

# This application using Spring Boot that uses five design patterns, which are as follows:
1.Singleton
2.Adapter
3.Factory
4.Facade
5.Chain of Responsibility

# Test Cases:

## Case – 1 : Enter the following URL to obtain the disease count using the DiseaseSh strategy.

http://localhost:8080/v1/disease/disease-sh-io/count

 
## Case – 2 : Enter the following URL to obtain the disease count using the JohnHopkin.
http://localhost:8080/v1/disease/john-hopkins/count

 

## Case – 3 : Enter the following URL to obtain the infected ratio.
http://localhost:8080/v1/disease/infected-ratio?sourceType=DiseaseSh

 
## Case – 4 : Enter the following URL to obtain the infected ratio.
http://localhost:8080/v1/disease/infected-ratio?sourceType=JohnHopkins

 
