# MediConnectPlus

MediConnectPlus is a simple Java project designed to manage the registration and login process for patients and doctors. It allows patients to register, assign them a doctor, and provides doctors with information about their assigned patients.

## Project Structure

The project consists of three main classes:

1. **patient**: Represents a patient and maintains their information, such as first name, last name, password, and assigned doctor. It provides methods to set and retrieve patient details.

2. **doctor**: Represents a doctor and maintains their information, such as first name, last name, password, and a list of assigned patients. It provides methods to set and retrieve doctor details.

3. **MediConnectPlus**: The main class that contains the program's logic. It provides methods for registration, login, and displaying user information. It also includes a helper function for assigning doctors to patients based on the doctor's workload.

## Functionality

The project offers the following functionality:

1. Registration:
   - Patients can register by providing their first name, last name, and creating a password.
   - Doctors can register by providing their first name, last name, and creating a password.
   - After registration, a patient is automatically assigned a doctor with the minimum number of appointments.

2. Login:
   - Patients can log in by entering their user ID (automatically assigned during registration) and password.
   - Doctors can log in by entering their user ID (automatically assigned during registration) and password.

3. Information Display:
   - Patients can view their profile information, including their assigned doctor's ID and name.
   - Doctors can view their profile information, including their assigned patients' names and IDs.

## How to Run

To run the project, perform the following steps:

1. Save the Java code in a file named `MediConnectPlus.java`.

2. Compile the code using the following command:
   ```
   javac MediConnectPlus.java
   ```

3. Run the compiled program using the following command:
   ```
   java MediConnectPlus
   ```

4. Follow the instructions displayed in the console to interact with the program.

## Note

This project is a simplified demonstration and does not include features such as data persistence, input validation, or a graphical user interface. It serves as a starting point and can be extended or modified to meet specific requirements.