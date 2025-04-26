📐 Calculadora Geométrica POO
Este proyecto es una calculadora geométrica desarrollada en Java, utilizando los principios de la Programación Orientada a Objetos (POO).
Permite calcular áreas, perímetros de figuras geométricas y también realizar el cálculo de potencias.

🚀 Funcionalidades
Cálculo de área y perímetro de:

Círculo

Cuadrado

Triángulo

Rectángulo

Pentágono

Cálculo de potencias usando recursividad.

📦 Estructura del proyecto
cpp
Copy
Edit
CalculadoraGeometricaPOO/
│
├── Operacion.java              // Interfaz base para todas las operaciones
├── FiguraGeometrica.java        // Clase abstracta para las figuras
├── Circulo.java                 // Clase para círculo
├── Cuadrado.java                // Clase para cuadrado
├── Triangulo.java               // Clase para triángulo
├── Rectangulo.java              // Clase para rectángulo
├── Pentagono.java               // Clase para pentágono
├── Potencia.java                // Clase para cálculo de potencias
└── CalculadoraGeometrica.java   // Clase principal con el menú
⚙️ Cómo ejecutar
Compilar todos los archivos:

bash
Copy
Edit
javac *.java
Ejecutar el programa:

bash
Copy
Edit
java CalculadoraGeometrica
📚 Requerimientos
Java 8 o superior instalado.

✨ Características del diseño
Uso de Interfaces (Operacion) para promover flexibilidad.

Uso de Herencia para reutilizar código entre figuras.

Recursividad aplicada en el cálculo de potencias.

Manejo de excepciones para entradas inválidas.

🛠 Mejoras futuras (opcional)
Agregar más figuras geométricas (hexágono, heptágono, etc).

Crear interfaz gráfica usando JavaFX o Swing.

Implementar patrones de diseño como Factory para crear operaciones.

🔗 Autor
Romario Ramirez

