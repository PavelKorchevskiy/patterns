***Singleton*** is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

All implementations of the Singleton have these two steps in common:

 - Make the default constructor private.
 - Create a static creation method that acts as a constructor.

In most cases Singleton is an antipattern.

Disadvantages of Singleton:
- Global state
- Breaks dependency inversion principle
- Breaks SRP
- Problems in multithreading
- Difficult to test