# Converter App

A simple console-based Java application that converts values between different units. The user can choose between converter types and perform conversions through a text-based menu.

## Overview

This project was created as part of a workshop to practice:

- Console menus

- Classes and methods

- User input handling

- Validation

- Formatted output (date/time)

- Maven project structure

- The app displays a menu, allows the user to choose a converter, enter a value, and view the converted result.
  

## Objective

Choose different converter types from the list below and implement them in your application:

- Currency Converter – SEK ↔ USD, SEK ↔ EUR

- Temperature Converter – Celsius ↔ Fahrenheit

- Length Converter – Meters ↔ Kilometers

- Weight Converter – Kilograms ↔ Grams

- Time Converter – Hours ↔ Minutes

- Speed Converter – km/h ↔ m/s

- Fuel Consumption Converter – L/100km ↔ km/L

- Data Storage Converter – KB ↔ MB ↔ GB

- BMI Calculator

- Grade Converter – Percentage → Letter grade

## Steps for the Solution

Below are the main steps followed to design and implement the Converter App:

### Project Setup

- Create a new Maven project named ConverterApp.

- Use the standard Maven folder structure.

- Add a main class (e.g., App.java) as the program entry point.

### Build the Application Structure

- Create classes such as:

- CurrencyConverter

- TemperatureConverter

- LengthConverter

- Each class contains methods for performing the necessary conversions.

- The App.java file manages the main menu and routing.

### Implement the Console Menu

- Display a clear text-based menu with options for each converter plus "Exit".

- Read user choices using Scanner.

- Use a loop to repeat the menu until the user chooses to exit.

#### Example:
```
=== Converter App ===
1. Currency Converter
2. Temperature Converter
3. Length Converter
4. Exit
Choose an option:
```

### Handle User Input

- Ask the user for the value to convert.

- Pass the value to the appropriate converter method.

- Optionally handle invalid inputs such as:

  - non-numeric entries

  - negative values

  - menu choices outside the valid range

### Add Conversion Logic

- Implement formulas and conversion rates for each converter.

- Keep logic reusable and contained inside methods.

#### For example:

- Celsius → Fahrenheit: F = C × 1.8 + 32

- SEK → USD (example rate): USD = SEK × 0.092

### Formatted Output

- Include:

  - The converted value

  - Current date and time using LocalDateTime

  - Clear output formatting

#### Example:

- Result: 100 SEK = 9.20 USD
- Converted at: 2025-12-02 10:35

###  Test the Application

- Verify all menu options work correctly.

- Test multiple inputs for each converter.

- Ensure the application loops properly until Exit.

- Confirm validation behaves as expected (if implemented).

### Finalize the Project

- Clean up code, structure, and comments.

- Push the Maven project to GitHub.

- Update the README with examples and instructions.

### How to Run the Application

```
Clone the repository:
git clone <your-repository-url>
Open the project in your IDE.
Run the App.java class from:
src/main/java/com.example/app/App.java
Follow the on-screen instructions.

```text
📂 Project Structure (Example)
src
 └── main
     └── java
         ├── App.java
         ├── converters
         │    ├── CurrencyConverter.java
         │    ├── TemperatureConverter.java
         │    └── LengthConverter.java
         └── utils
              └── InputValidator.java
   ```

#### Example Output

```
=== Converter App ===
1. Currency Converter
2. Temperature Converter
3. Length Converter
4. Exit
Choose an option: 1

Enter amount in SEK: 100
Result: 100 SEK = 9.20 USD
Converted at: 2025-12-02 10:35
```
