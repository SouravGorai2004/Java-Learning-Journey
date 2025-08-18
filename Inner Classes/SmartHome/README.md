# Problem Statement: SmartHome Controller

You are tasked with designing a **SmartHome Controller** system in Java that demonstrates the use of **all four types of Inner Classes** (Member Inner Class, Static Nested Class, Local Inner Class, and Anonymous Inner Class).  

The SmartHome Controller should provide functionalities to manage and interact with smart devices like Lights, Thermostat, Security System, and Energy Monitor.

---

## Requirements

### 1. **Member Inner Class** – `Light`
- Represents a **smart light** in the home.
- Functions:
  - `turnOn()` → Print a message indicating the light is turned on.
  - `turnOff()` → Print a message indicating the light is turned off.

---

### 2. **Static Nested Class** – `Thermostat`
- Represents a **thermostat** that controls the temperature.
- Functions:
  - `setTemperature(int temp)` → Print the current temperature being set.
  - `showTemperature()` → Display the last set temperature.

---

### 3. **Local Inner Class** – `SecuritySystem`
- Declared inside a method `activateSecurity()`.
- Represents the **home’s security system**.
- Functions:
  - `arm()` → Print that the security system is armed.
  - `disarm()` → Print that the security system is disarmed.
- Scope is restricted to the method where it is defined.

---

### 4. **Anonymous Inner Class** – `EnergyMonitor`
- Implemented inside a method `startMonitoring()`.
- Should implement a functional interface `Monitor` with one method `checkUsage()`.
- Functionality:
  - `checkUsage()` → Print a message showing simulated power usage data.

---

## Expected Behavior
- Create an object of the SmartHome Controller.
- Demonstrate calling and using each of the above classes/functions in the main method.
- Ensure proper separation of responsibilities between the four types of inner classes.

---

## Constraints
- You **must use all four types of inner classes** in your implementation.
- Keep the code modular and easy to understand.
- Follow proper naming conventions for clarity.
