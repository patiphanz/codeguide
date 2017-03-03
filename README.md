#Codeguide

##Inheritance

Inheritance in java is a mechanism in which one object acquires the properties and behaviors of parent object. It’s essentially creating parent-child relationship between classes. In java, you will use inheritance mainly for code re-usability and maintainability.

Keyword “extends” is used to inherit a class in java. The “extends” keyword indicates that you are making a new class that derives from an existing class. In the terminology of Java, a class that is inherited is called a super class. The new class is called a subclass.

A subclass inherits all the non-private members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.

```java
class Car
{
    public Car(){

    }

    public void drive(){
        System.out.println("drive!!");
    }

    public void stop(){
        System.out.println("Breakk!!");
    }

    //And so on
}
class Supercar extends Car {

    public Supercar(){

    }

    public void Turbo(){
        System.out.println("BOOMMM!!!");
    }
}
```
In above example, `Supercar` is specialized version of `Car` and reuses methods `drive` and `break` from `Employee` class as well as define it’s own method call `Turbo`.

We will learn more about inheritance in java in another post.

Exercise : [Supercar](https://github.com/patiphanz/codeguide/blob/master/src/codeguide/Supercar.java)

Reference : [Java OOP Concepts](http://howtodoinjava.com/object-oriented/object-oriented-principles/)

##Abstraction

Abstraction is very easy to understand when you relate it to read world scenario. For example, when you drive your car you do not have to be concerned with the exact internal working of your car. What you are concerned with is interacting with your car via its interfaces like steering wheel, brake pedal, accelerator pedal etc. Here the knowledge you have of your car is abstract.

In computer science, abstraction is the process by which data and programs are defined with a representation similar in form to its meaning (semantics), while hiding away the implementation details.

In more simple terms, abstraction is to hide information that is not relevant or rather show only relevant information and to simplify it by comparing it to something similar in the real world.

Typically abstraction can be seen in two ways:

###1.Data abstraction

Data abstraction is the way to create complex data types from multiple smaller data types – which is more close to real life entity. e.g. An Employee class can be a complex object of having various small associations.

```java
public class Employee
{
    private Department department;
    private Address address;
    private Education education;
    //So on...
}
```

So, if you want to fetch information of a employee, you ask it from Employee object – as you do in real life, ask the person itself.

###2.Control abstraction

Control abstraction is achieved by hiding the sequence of actions for a complex task – inside a simple method call, so logic to perform the task can be hidden from client and could be changed in future without impacting the client code.

```java
public class EmployeeManager
{
    public Address getPrefferedAddress(Employee e)
    {
        //Get all addresses from database
        //Apply logic to determine which address is preferred
        //Return address
    }
}
```
In above example, tomorrow if you want to change the logic so that everytime domestic address is always the preferred address, you will change the logic inside `getPrefferedAddress()` method, and client will be unaffected.

Exercise :

Reference : [Java OOP Concepts](http://howtodoinjava.com/object-oriented/object-oriented-principles/)
