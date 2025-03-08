# Assignment 6 - Java Lab

## Overview
This project is a Java-based simulation of different types of ducks using the Strategy Design Pattern. It demonstrates how behavior can be encapsulated into separate interfaces and dynamically assigned to different duck types at runtime. The program consists of various duck types, each with distinct quacking, swimming, and flying behaviors.

## Design Pattern Used
This project implements the **Strategy Design Pattern**, which allows the duck behaviors (quacking, swimming, and flying) to be defined separately and assigned dynamically.

## Classes and Structure

### Main Class
- `Main`: The entry point of the application, creating different duck objects and executing their behaviors.

### Abstract Duck Class
- `Duck`: An abstract class representing a duck, containing references to behavior interfaces (`QuackBehaviour`, `SwimBehaviour`, and `FlyBehaviour`).
  - Methods:
    - `setQuackBehaviour(QuackBehaviour qb)`: Allows changing quack behavior dynamically.
    - `setSwimBehaviour(SwimBehaviour sb)`: Allows changing swim behavior dynamically.
    - `setFlyBehaviour(FlyBehaviour fb)`: Allows changing fly behavior dynamically.
    - `performQuack()`, `performSwim()`, `performFly()`: Executes assigned behaviors.
    - `display()`: Abstract method to be implemented by subclasses.

### Duck Implementations
- `MallardDuck`: Implements a mallard duck with quacking, swimming, and flying capabilities.
- `RedheadDuck`: Similar to MallardDuck, with a different display message.
- `RubberDuck`: Implements a rubber duck that squeaks, floats, and cannot fly.
- `DecoyDuck`: Represents a non-functional duck with silent quack, sinking behavior, and no flying ability.

### Behavior Interfaces and Implementations
- **Quack Behavior (`QuackBehaviour`)**
  - `Quack`: Implements a normal quack.
  - `Silent`: Implements no quacking.
  - `Squeak`: Implements a squeaky quack (for rubber ducks).
- **Swim Behavior (`SwimBehaviour`)**
  - `SwimWithLegs`: Implements normal swimming.
  - `Floating`: Implements floating behavior.
  - `Sink`: Implements sinking behavior.
- **Fly Behavior (`FlyBehaviour`)**
  - `Fly`: Implements flying behavior.
  - `NotFly`: Implements non-flying behavior.

## How to Run
### Steps
1. Compile the Java source files:
   ```bash
   javac Main.java
   ```
2. Run the application:
   ```bash
   java Main
   ```
