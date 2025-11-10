# 🧠 Evaluación Final Transversal – Desarrollo Orientado a Objetos I

👤 **Autor del proyecto**

- **Nombre completo: María Florencia Burgos**
- **Sección:002**
- **Carrera: Analista Programador**
- **Sede:Online**
---

## 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación Final Transversal de la asignatura Desarrollo Orientado a Objetos I.  
El sistema fue desarrollado en Java y modela la estructura organizacional de la empresa salmonera "Salmontt", aplicando los principios de **encapsulamiento, herencia y composición**.

El objetivo principal es representar de manera estructurada las personas vinculadas a la empresa como empleados y direcciones mediante clases organizadas en paquetes.  
Este modelo sirve como base para futuros módulos de gestión y digitalización interna de la compañía.

---

## 🧱 Estructura general del proyecto

📁 **src/**   

**app** / # Clase principal con el método main

 + *Main.java*

**model** / # Clases de dominio
 
+ *Persona.java*

 + *Direccion.java*

 + *Empleado.java*


Cada clase aplica principios de Programación Orientada a Objetos:
- **Encapsulamiento:** atributos privados y métodos públicos `get` y `set`.
- **Composición:** `Persona` contiene un objeto `Direccion`.
- **Herencia:** `Empleado` hereda de `Persona`.
- **toString():** sobreescrito para mostrar información legible en consola.

---

Repositorio GitHub: https://github.com/florenciaa-bit/SalmonttSistemaPersonas.git

Fecha de entrega: [10/11/2025]
