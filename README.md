ejerciciosExtra
================

Proyecto de práctica en Java (SENA - ADSO) con 5 ejercicios sobre
características modernas del lenguaje: Try-with-resources, Multi-catch,
Sealed Classes, Varargs y Unnamed Variables ("_").

Paquete: ejercicios
Archivos: tryWithResources.java, multiCatch.java, sealedClasses.java,
varargs.java, unnamedVariables.java


1. tryWithResources.java
-------------------------
Qué es: try-with-resources es una forma de decirle a Java que cierre
un recurso (como un archivo) automáticamente al terminar de usarlo,
sin escribir un bloque finally a mano.

Cómo funciona: al declarar el BufferedReader dentro de los paréntesis
del try, Java se encarga de cerrarlo al salir del bloque, ya sea que
todo salga bien o que ocurra un error. Se lee la primera línea del
archivo nombre.txt con br.readLine() y se imprime en pantalla. Si el
archivo no existe o no se puede leer, se captura un IOException y se
muestra un mensaje de error, sin que el programa se caiga.

Requisito: el archivo nombre.txt debe estar en la raíz del proyecto
(mismo nivel que pom.xml), o el programa no lo va a encontrar.

Salida esperada:
Contenido leído: Hola, este es un archivo de prueba.


2. multiCatch.java
-------------------
Qué es: multi-catch permite atrapar dos o más tipos de errores
distintos en un mismo bloque catch, cuando el manejo que se les va a
dar es el mismo, evitando repetir código.

Cómo funciona: el programa pide un texto por consola con Scanner.
Intenta convertirlo a número con Integer.parseInt() y luego divide
10.0 entre ese número. Esto puede fallar de dos formas: si el texto
no es un número (NumberFormatException) o si el número es 0
(ArithmeticException). Ambos casos se atrapan juntos con el símbolo |
dentro de un mismo catch, mostrando el mismo mensaje de error. El
ciclo se repite indefinidamente hasta que el usuario escribe "salir".

Salida esperada:
> 5
10 / 5 = 2.0
> 0
Error: dato inválido o división por cero.
> salir
Programa terminado.


3. sealedClasses.java
-----------------------
Qué es: una clase o interfaz sellada (sealed) permite definir
explícitamente cuáles son las únicas clases autorizadas a
implementarla o extenderla, cerrando la jerarquía a solo esas.

Cómo funciona: la interfaz Animal se declara sealed y usa
"permits Perro, Gato" para indicar que solo esas dos clases pueden
implementarla; ninguna otra clase podría hacerlo sin agregarse a esa
lista, o el código no compilaría. Perro y Gato implementan el método
sonido() cada una a su manera. En el main se crea un arreglo con un
objeto de cada tipo y se recorre llamando sonido() en cada uno; Java
sabe internamente qué implementación usar según el tipo real del
objeto.

Nota: la interfaz Animal no lleva "public" porque en un mismo archivo
solo puede haber un elemento public, y en este caso es la clase
sealedClasses.

Salida esperada:
El perro dice: Guau
El gato dice: Miau


4. varargs.java
-----------------
Qué es: varargs permite que un método reciba una cantidad variable de
argumentos del mismo tipo, sin tener que crear una versión distinta
del método para cada cantidad posible.

Cómo funciona: el método sumar(int... numeros) usa la sintaxis "..."
después del tipo, lo que le permite recibir 0, 1, 2 o más enteros.
Internamente Java empaqueta esos argumentos en un arreglo, que se
recorre con un for-each normal para sumar todos los valores y
devolver el total. En el main se llama al mismo método con distintas
cantidades de argumentos, incluyendo ninguno.

Salida esperada:
Suma de 1,2,3 = 6
Suma de 5,10 = 15
Suma sin argumentos = 0


5. unnamedVariables.java
--------------------------
Qué es: el guion bajo (_) se usa como variable sin nombre cuando se
necesita capturar algo (como una excepción) pero no se va a usar su
valor para nada, evitando así declarar una variable innecesaria.

Cómo funciona: el programa recorre un arreglo de números {2, 0, 4} e
intenta dividir 10 entre cada uno dentro de un try. Cuando el
divisor es 0, ocurre una ArithmeticException; en vez de capturarla
con un nombre como "e", se usa catch (ArithmeticException _), porque
no se necesita ningún dato de esa excepción, solo reaccionar a que
ocurrió.

Requisito: esta característica requiere Java 22 o superior. En Java
21 hace falta compilar y ejecutar con la bandera --enable-preview.

Salida esperada:
10 / 2 = 5
No se puede dividir entre 0.
10 / 4 = 2


Cómo ejecutar
--------------
javac src/main/java/ejercicios/NombreArchivo.java -d out
java -cp out ejercicios.NombreClase

Requisitos: JDK 22 o superior, Maven.
