# 🏥 Hospital Patient & Clinic Appointment Scheduler

A Java-based **Object-Oriented Programming (OOP) console application** that simulates a hospital management system. The system models real-world hospital operations such as patient registration, doctor–nurse coordination, and appointment-related interactions using core OOP principles.

---

## 📌 Project Overview

This project demonstrates a structured OOP design using Java SE (Tier 1 Console Application). It focuses on clean architecture, class relationships, and real-world modeling of a hospital environment.

The system includes:
- Patients
- Doctors
- Nurses
- Hospital (central system)

It applies all four OOP pillars:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

## 🎯 Features

- 👨‍⚕️ Doctor management with specialization and ID
- 👩‍⚕️ Nurse assignment and coordination under doctors
- 🧑 Patient registration and doctor interaction
- 🏥 Hospital system using composition (HAS-A relationship)
- 🔁 Runtime polymorphism using overridden methods
- 🍽️ Interface-based behavior using `Daily` (eat/sleep contract)
- 📋 Console-based simulation of hospital workflows
- 🔗 Aggregation and association between classes

---

## 🧱 Project Structure
HospitalSystem/
│
├── README.md
├── build.xml
│
├── docs/
│ └── HospitalSystem_ProjectDocumentation.pdf
│
├── src/
│ └── hospitalsystem/
│ ├── Person.java
│ ├── Doctor.java
│ ├── Nurse.java
│ ├── Patient.java
│ ├── Hospital.java
│ ├── Daily.java
│ └── HospitalSystem.java
│
└── dist/
└── HospitalSystem.jar


---

## 🧠 OOP Concepts Used

### 1. Encapsulation
All sensitive fields (e.g., IDs, personal data) are private and accessed via getters/setters.

### 2. Inheritance
`Doctor`, `Nurse`, and `Patient` inherit from the abstract class `Person`.

### 3. Polymorphism
- Runtime polymorphism via method overriding (`vision()` method)
- Compile-time polymorphism via method overloading (`eat()` methods in Doctor class)

### 4. Abstraction
- `Person` is an abstract class
- `Daily` is an interface enforcing `eat()` and `sleep()` behavior

---

## 🔗 Class Relationships

- **IS-A Relationship:**  
  Doctor, Nurse, Patient → Person

- **HAS-A Relationship (Composition):**  
  Hospital → Doctor, Nurse

- **Aggregation:**  
  Doctor → List of Nurses

- **Association:**  
  Doctor ↔ Patient interaction

---

## ⚙️ Technologies Used

- Java SE (JDK 8+)
- NetBeans IDE 8.2
- Apache Ant (build system)
- JVM (runtime environment)
- Git & GitHub (version control)

---

## 🚀 How to Run the Project

### Option 1: Using IDE (NetBeans)
1. Open NetBeans IDE
2. Import the project folder
3. Run `HospitalSystem.java`

### Option 2: Using Terminal
```bash
cd HospitalSystem/dist
java -jar HospitalSystem.jar

ant clean
ant build
ant run

👥 Team Members
Meklit Kiros — Lead Architect & Logic Developer
Mebatsion Yoseph — UI/UX Designer
HayleMariyam Agergzat — Backend Developer
Hewan Kifle — QA Tester & Documentation
Beka Assefa — Version Control & Integration Manager
