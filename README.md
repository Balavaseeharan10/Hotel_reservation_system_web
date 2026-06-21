# Hotel Reservation Management System - Spring Boot

This version has a colorful role-based UI:

- Home page has two separate options: Customer and Manager
- Customer dashboard has registration, available rooms, booking, and payment options
- Manager dashboard has room management, resident view, booking view, and payment view options

## Run Steps

1. Open the project in IntelliJ IDEA
2. Open `src/main/resources/application.properties`
3. Change MySQL username/password if needed
4. Run `HotelReservationApplication.java`
5. Open browser: `http://localhost:8080`

## Main Flow

Browser -> Controller -> Service -> Repository -> MySQL
