# 📌 Title
**Spring Boot Weather App**

## 📄 Description
A simple Spring Boot application that simulates weather information through RESTful endpoints. It provides current weather, tomorrow’s forecast, and a city-specific weather placeholder. The application runs on port `8085`.

## 🧱 Components
- Spring Boot  
- Spring Web  
- Maven  
- Java  

## 🧩 Design Highlights
- RESTful endpoints:
  - `/weather/today` – static current weather report
  - `/weather/tommorow` – static forecast for tomorrow
  - `/weather/city/{name}` – dynamic response using `@PathVariable`
- Modular controller structure under `weathercontroller`
- Custom server port configured to `8085`

## 🎯 Purpose
To demonstrate a beginner-level Spring Boot REST API project with dynamic URL handling and static data, suitable for learning and testing.

## 👨‍💻 Author
**Lokeshwaran M**  
Software Developer Trainee
