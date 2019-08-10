# Java 8 Features

## [Functional Interface](https://github.com/natandaniel/java_8_samples/tree/master/functional_interface/src/)

A **single abstract method interface**, with as many default and static methods, is called **a functional interface**. 
Java 8 provides a way of declaring an interface as a functional interface with the **_@FunctionalInterface_** annotation.
Coupled with **lambdas**, which provide a cleaner and more compact implementation of such interfaces, java code becomes more readable than it used to be. Such objects assimilate to functions and provide a more functional way of coding. Java 8 also provides built in functional interfaces.

  1. [_Hello_](https://github.com/natandaniel/java_8_samples/tree/master/functional_interface/src/hello) : **a custom functional interface** used to illustrate how to work with them and compare the use of lambdas to the traditional **_anonymous class_**. It provides an abstract method **sayHelloTo** that takes a name as a parameter and returns _"Hello " + name_.

  1. [_Predicate_](https://github.com/natandaniel/java_8_samples/tree/master/functional_interface/src/predicate) : a sample demonstration of Java's **Predicate** functional interface. It provides an abstract method called **test** that takes an object as a parameter and returns a boolean. 
  
  1. [_Function_](https://github.com/natandaniel/java_8_samples/tree/master/functional_interface/src/function) : a sample demonstration of Java's **Function** functional interface. It provides an abstract method called **apply** that takes an object as a parameter and returns another object.
