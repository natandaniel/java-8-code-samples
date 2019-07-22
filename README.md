# In this repository, I explore and try out Java 8 specific features.

## Functional Interface 

A **single abstract method interface**, with as many default and static methods, is called **a functional interface**. 
Java 8 provides a way of declaring an interface as a functional interface with the **_@FunctionalInterface_** annotation.
Coupled with **lambdas**, which provide a cleaner and more compact implementation of such interfaces, java code becomes more readable than it used to be. Such objects assimilate to functions and provide a more functional way of coding.

In this project, I illustrate the effectiveness of lambdas when used to implement a functional interface as opposed to the traditional **_anonymous class_**. The functional interface provides an abstract method **to say hello**.
