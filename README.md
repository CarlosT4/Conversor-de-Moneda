# Conversor de Moneda

Aplicación de consola en Java que permite convertir montos entre distintas monedas utilizando tasas de cambio en tiempo real obtenidas desde una API externa.

---

## 📁 Estructura del Proyecto

```
conversorMoneda/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── org/example/
│   │   │   │       ├── App.java
│   │   │   │       ├── Moneda.java
│   │   │   │       ├── ConversorMoneda.java
│   │   │   │       └── ConsultaMoneda.java
│   │   └── resources/
│   ├── test/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       └── AppTest.java
│   └── resources/
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── gradle/
└── README.md
```

---

## ✨ Características

- Conversión de monedas en tiempo real.
- Soporte para múltiples divisas:
  - USD – Dólar Estadounidense  
  - EUR – Euro  
  - GBP – Libra Esterlina  
  - JPY – Yen Japonés  
  - CHF – Franco Suizo  
  - BOB – Boliviano  
  - PEN – Sol Peruano  
  - ARS – Peso Argentino  
  - MXN – Peso Mexicano  
  - BRL – Real Brasileño
- Consulta de tasas de cambio desde [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## ⚙️ Requisitos

- Java 17 o superior  
- Gradle 8.1.3 o superior

---

## 📦 Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/conversorMoneda.git
   cd conversorMoneda
   ```

2. Compila el proyecto con Gradle:

   ```bash
   ./gradlew build
   ```

---

## ▶️ Ejecución

Para ejecutar la aplicación:

```bash
./gradlew run --console=plain
```

---

## 🧭 Uso

1. La aplicación mostrará una lista de monedas disponibles.
2. Elige la moneda de origen ingresando el número correspondiente.
3. Elige la moneda de destino de la misma forma.
4. Introduce el monto a convertir.
5. Se mostrará el resultado de la conversión.

---

---

## 📚 Dependencias

- [Gson](https://github.com/google/gson): procesamiento de JSON  

---
