# 🏥 Hospital Patient & Clinic Appointment Scheduler

A Java-based **Object-Oriented Programming (OOP)** console application that simulates a real-world hospital management system. This project models core hospital operations including patient registration, doctor–nurse coordination, and appointment management using fundamental OOP principles.

---

## 📌 Project Overview

This application demonstrates structured OOP design using **Java SE (Tier 1 Console Application)**. It emphasizes clean architecture, well-defined class relationships, and realistic modeling of a hospital ecosystem.

### Key Entities:
- 👤 **Patients** – Register and interact with doctors
- 👨‍⚕️ **Doctors** – Specialized medical professionals with unique IDs
- 👩‍⚕️ **Nurses** – Assigned to doctors for coordinated care
- 🏥 **Hospital** – Central system managing all operations

### OOP Principles Applied:
- ✅ **Encapsulation** – Data hiding with controlled access
- ✅ **Inheritance** – Hierarchical class structures
- ✅ **Polymorphism** – Runtime and compile-time flexibility
- ✅ **Abstraction** – Abstract classes and interface implementation

---

## 🎯 Features

- 👨‍⚕️ **Doctor Management** – Specialization tracking and unique identification
- 👩‍⚕️ **Nurse Coordination** – Assignment and management under doctors
- 🧑 **Patient Registration** – Seamless patient onboarding and doctor linkage
- 🏥 **Hospital Composition** – HAS-A relationships for robust system architecture
- 🔁 **Runtime Polymorphism** – Overridden methods for dynamic behavior
- 🍽️ **Interface Implementation** – `Daily` contract enforcing `eat()` and `sleep()` methods
- 📋 **Console Simulation** – Interactive workflow demonstration
- 🔗 **Association & Aggregation** – Realistic entity relationships

---

## 🧠 OOP Concepts in Detail

### 1. Encapsulation
All sensitive fields (IDs, personal information) are declared `private` and accessed through getters/setters, ensuring data integrity and controlled modification.

### 2. Inheritance
- `Doctor`, `Nurse`, and `Patient` inherit from the abstract class `Person`
- Promotes code reuse and establishes clear hierarchical relationships

### 3. Polymorphism
- **Runtime Polymorphism** – Method overriding (`vision()` method)
- **Compile-time Polymorphism** – Method overloading (`eat()` methods in Doctor class)

### 4. Abstraction
- `Person` is an abstract class defining common attributes and behaviors
- `Daily` interface enforces `eat()` and `sleep()` implementation across classes

---

## 🔗 Class Relationships

| Relationship | Implementation |
|--------------|----------------|
| **IS-A** | Doctor, Nurse, Patient → Person (Inheritance) |
| **HAS-A** | Hospital → Doctor, Nurse (Composition) |
| **Aggregation** | Doctor → List of Nurses (Collection) |
| **Association** | Doctor ↔ Patient (Bidirectional interaction) |

---

## ⚙️ Technologies Used

- **Java SE** (JDK 8+)
- **NetBeans IDE** 8.2
- **Apache Ant** – Build automation
- **JVM** – Runtime environment
- **Git & GitHub** – Version control

---

## 🚀 How to Run the Project

### Option 1: Using NetBeans IDE
1. Open NetBeans IDE
2. Import the project folder
3. Navigate to `HospitalSystem.java`
4. Run the file (Right-click → Run File)

### Option 2: Using Terminal (JAR)
```bash
cd HospitalSystem/dist
java -jar HospitalSystem.jar
```
```bash
ant clean    # Clean previous builds
ant build    # Compile the project
ant run      # Execute the application
```
## 👥 Team Members

| Name | Role |
|------|------|
| Meklit Kiros | Lead Architect & Logic Developer |
| Mebatsion Yoseph | UI/UX Designer |
| HayleMariyam Agergzat | Backend Developer |
| Hewan Kifle | QA Tester & Documentation |
| Beka Assefa | Version Control & Integration Manager |
```
