﻿# MediConnectPlus

MediConnectPlus is a simple Java project designed to manage the registration and login process for patients and doctors. It allows patients to register, assign them a doctor, and provides doctors with information about their assigned patients.

## Project Structure

The project consists of three main classes:

1. **Patient**: Represents a patient and maintains their information, such as first name, last name, password, assigned doctor, and appointment timing. It provides methods to set and retrieve patient details.

2. **Doctor**: Represents a doctor and maintains their information, such as first name, last name, password, a list of assigned patients, and available appointment slots. It provides methods to set and retrieve doctor details.

3. **Main**: The main class that contains the program's logic. It provides methods for registration, login, displaying user information, and managing appointment scheduling.

## Functionality

The project offers the following functionality:

1. Registration:

   - Patients can register by providing their first name, last name, and creating a password.
   - Doctors can register by providing their first name, last name, and creating a password.
   - After registration, a patient is automatically assigned a doctor with the minimum number of appointments.

2. Login:

   - Patients can log in by entering their user ID (automatically assigned during registration) and password.
   - Doctors can log in by entering their user ID (automatically assigned during registration) and password.

3. Appointment Scheduling:

   - Patients can schedule appointments with their assigned doctor.
   - Doctors have predefined available time slots for appointments.
   - Appointment timings are displayed to patients and doctors.

4. Information Display:
   - Patients can view their profile information, including their assigned doctor's ID and name, and their appointment timing.
   - Doctors can view their profile information, including their assigned patients' names and IDs, and the appointment details.

## How to Run

To run the project, perform the following steps:

1. Open your terminal in your laptop, run this commend:

   ```
   git clone https://github.com/Swarnendu0123/Medi-Connect-Plus
   ```

2. Go to the folder `Medi-Connect-Plus`


3. Run the compiled program using the following command:

   ```
   java main
   ```

4. Follow the instructions displayed in the console to interact with the program.

## Note

This project is a simplified demonstration and does not include features such as data persistence, input validation, or a graphical user interface. It serves as a starting point and can be extended or modified to meet specific requirements.
