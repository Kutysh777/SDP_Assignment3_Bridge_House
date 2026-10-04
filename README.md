# Assignment 3 Bridge Pattern

## About My Project

In this project, I used the Bridge pattern with houses and wall materials.

I have two house types: SmartHouse and LuxuryHouse. I also have two wall materials: BrickWalls and WoodenWalls. Both house types can use either material.

The program prints messages in the console to show how the houses use different materials.

## Project Structure

```text
SDP_Assignment3_Bridge_House
|-- README.md
|-- .gitignore
|-- src
    |-- WallMaterial.java
    |-- BrickWalls.java
    |-- WoodenWalls.java
    |-- House.java
    |-- SmartHouse.java
    |-- LuxuryHouse.java
    |-- Main.java
```

## Bridge Components

| Role | File | What It Does |
| --- | --- | --- |
| Abstraction | House.java | An abstract class. It stores a WallMaterial object and has the build() method. |
| Refined Abstraction | SmartHouse.java | Extends House and builds a smart house with the chosen material. |
| Refined Abstraction | LuxuryHouse.java | Extends House and builds a luxury house with the chosen material. |
| Implementor | WallMaterial.java | An interface with the buildWalls() method. |
| Concrete Implementor | BrickWalls.java | Implements WallMaterial for brick walls. |
| Concrete Implementor | WoodenWalls.java | Implements WallMaterial for wooden walls. |
| Client | Main.java | Creates houses, chooses materials, and shows how to change them. |

## How Bridge Works

House stores a reference to a WallMaterial object. This connection is the bridge. When a house calls build(), it uses the buildWalls() method of its material.

In Main, I first create a SmartHouse with brick walls. Then I use setWallMaterial() to change it to wooden walls. I keep the same house object. I also show this change with LuxuryHouse.

I can add a new house type or a new wall material separately. For example, I can add ConcreteWalls without changing the house classes.

## Clean Code Principles

1. **Meaningful Names:** I used clear names such as House, WallMaterial, and BrickWalls. These names help me understand what each class does.
2. **Single Responsibility:** The house classes describe the house type. The material classes build the walls. Main shows how these classes work together.
3. **Small Classes and Methods:** My classes and methods are short. For example, buildWalls() only prints a message about the wall material.
4. **Do Not Repeat Yourself:** I put the material field, constructor, and setter in House. SmartHouse and LuxuryHouse use this shared code.
5. **Open Closed Principle:** I can create a new class that implements WallMaterial. The house classes can use it through the same interface, so I do not need to change their code.

## How to Run

Use JDK 8 or later. Open a terminal in the project folder and run:

```text
javac -d out src/*.java
java -cp out Main
```

In IntelliJ IDEA, open the project folder and select a JDK. If needed, mark src as Sources Root. Then run Main.java.

## Expected Output

```text
Smart house:
Building brick walls

Switching the smart house to wooden walls:
Smart house:
Building wooden walls

Luxury house:
Building brick walls

Switching the luxury house to wooden walls:
Luxury house:
Building wooden walls
```

