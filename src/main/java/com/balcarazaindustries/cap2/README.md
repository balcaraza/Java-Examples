Capitulo 2 Introduccion a las aplicaciones en Java: entrada/salida y operadores
Objetivos
En esta sección se aprendera a:

Escribir aplicaciones simples de Java.
Utilizar instrucciones de entrada y salida.
Familiarizarse como los tipos primitivos de Java.
Comprender los conceptos basicos de la memoria.
Utilizar los operadores aritmeticos
Comprender la precedencia de los operadores aritmeticos.
Escribir instrucciones para tomar desiciones.
Utilizar los operadores relacionales y de igualdad.
Introducción
En este capitulo se empezaran a desarrollar pequeñas aplicaciones en Java de menor a mayor complejidad. Se comenzara con ejemplos que imprimen mensajes posteriormente con ejemplos que muestran mensajes en pantalla, ejemplos que realizan calculos y por ultimo ejemplos que toman decisiones.

Primer programa en Java
¿Qué es una aplicaion de Java? Una aplicación de Java es un programa para computadora que se ejecuta cuando se activa el comando para iniciar la JVM de Java. Como primer programa se desarrollo el codigo de la figura 1.2 del libro.

Decripción del codigo de la figura 2.1
Declaración de una clase
La linea 4 ''' public class Bienvenido1 { ''' Comienza con la ** declaracion de clase ** para la clase Bienvenido1, ya que todo programa de Java consiste en al menos una clase que nosotros como programadores debemos definir. La palabra clave class declara la clase la cual debe ir seguida de forma inmediata por el nombre de la clase (Bienvenido1).

NOTA: Por convencion todos los nombres de clase deben comenzar con una mayuscula y contener mayuscula en en la primera letra de cada palabra (EjemploDeClase), pueden contener letras, digitos, guiones bajos y signos de moneda (
)
p
o
r
e
j
e
m
p
l
o
:
(
E
j
e
m
p
l
o
1
), simepre hay que tener cuidado al escribir los nombres ya que Java diferencia entre mayusculas y minusculas.

Nombres de clase e identificadores
Las palabras clave o palabras reservadas son para uso exclusivo de Java por lo que en ningun momento deberemos utilizarlas para asignarle un nombre a una variable o a cualquier otra cosa.

La palabra clave "public" sera definida más adelante, por ahora solo es importante colocarla antes de la palabra "class"

Cuerpo de la clase
La llave izquierda "{" de la linea 5 comienza el cuerpo de una declaracion de clase y lleva su par correspondiente la llave derecha "}" para terminar con la declaracion de la clase, los elementos internos (lineas 6-10) llevan una sangria la cual se le conoce como indentación, y sirve para diferenciar las diferentes partes del codigo.

Declaración de un método.
La linea 7 ''' public static void main(String[] args) ''' Es el punto de inicio de cualquier programa en Java, los parentesis seguidos del main indican que es un bloque de construcción o metodo de Java, en Java solo uno de los metodos del programa puede llamarse main De momento solo se explicara que la palabra void hace referencia a que el metodo main al terminar su ejecución no devolvera ningun valor o información. Las palabras String [] args son una parte que se requiere colocar en la declaracion del metodo main (se hablara de su significado mas adelante) Todos los métodos deben contener su llave de apertura y cierre {}

Operaciones de Salida
La linea 9 ''' System.out.println("Bienvenido a la programacion en Java!"); ''' indica a la computadora que debe realizar una acción, en este caso mostrar en pantalla (imprimir) el texto dentro de las comillas dobles. System.out es un metodo de llava que permite mostrar informacion en la ventana de comandos. El metodo System.out.println muestra o imprime una linea de texto en la ventana de comandos (lo que se encuentra entre parentesis se considera el argumento del metodo)

Edicion del programa en Java
Una linea de texto con varias instrucciones
En el codigo Bienvenido2.java se debera mostrar una sola linea de texto con varias instrucciones: ''' System.out.print("Bienvenido a "); System.out.println("la programacion en Java!"); ''' La diferencia entre estas dos isntrucciones es que println realiza un salto de linea para colocar el cursor o prompt en una linea nueva como si se diera un "enter", la instruccion print situa el cursor justo despues del texto al interior de las comillas.

###Como mostrar varias lineas de texto con una sola instrucción.