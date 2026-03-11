# Weather App (Android)

## Description
This is a simple Android weather application built using **Kotlin** and **Jetpack Compose**.
The app allows a user to log in and check the weather information of any city using the OpenWeather API.

## Features Implemented
- **Login Screen**
  - Username and password input
  - Navigation to weather screen after login

- **Weather Screen**
  - User enters city name
  - Displays temperature and humidity of the city

- **Networking**
  - Weather data fetched from the OpenWeather API using **Retrofit**

- **Secure Data Storage**
  - Username stored securely using **EncryptedSharedPreferences**

- **Broadcast Receiver**
  - Detects network connectivity changes
  - Displays a toast message when network status changes

## Features Not Implemented
Due to time constraints, I couldn't implement the following features:

- Content Provider 
- File Provider 
- Android Service 
- Deep Linking 
- Application Signing


## Technologies Used
- Kotlin
- Jetpack Compose
- Retrofit
- EncryptedSharedPreferences
- Broadcast Receiver


