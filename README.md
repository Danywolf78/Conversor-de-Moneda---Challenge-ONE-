# Conversor de Monedas
Este proyecto consiste en un programa de JAVA, se trata de un conversor de monedas limitado que recibe del usuario una moneda base,
una moneda objetivo y una cantidad a cambiar.
Realiza una solicitud a la API de ExchangeRate-API para procesar los datos y generar la respuesta.

## Features

- Realizar una conversión de una moneda a otra.
## Requisitos
- Java 8 o superior.
- Acceso a internet.


## Modo de Uso
- Ejecutar el Programa Principal.java .
- Seguir las instrucciones del menú para realizar conversiones.

## Ejemplo del Funcionamiento :
A continuación se presenta un ejemplo de posibles interacciones
 entre el usuario y el programa.

### Ejecutar el programa :
- Abre una terminal o línea de comandos.
- Navega hasta el directorio donde se encuentra el archivo Principal.java.
- Compila el archivo Principal.java utilizando el comando javac Principal.java.
- Ejecuta el programa compilado utilizando el comando java Principal.

### Iniciando el programa: 

 Luego de ejecutar el programa, se mostrará el siguiente menú, en el cual el usuario deberá escoger la opción a realizar digitándo el número correspondiente.



![Captura de pantalla de la aplicacion](https://github.com/Danywolf78/Conversor-de-Moneda---Challenge-ONE-/blob/main/Conversor-de-Moneda---Challenge-ONE-/imagenes/Pantalla_inicial.jpeg)

 Si el usuario ingresa una opción diferente se mostrará un mensaje de opción inválida y deberá ingresar nuevamente una opción.


![Captura de pantalla de la aplicacion](https://github.com/Danywolf78/Conversor-de-Moneda---Challenge-ONE-/blob/main/Conversor-de-Moneda---Challenge-ONE-/imagenes/Error_1.jpeg)
 
 O en el caso de que se ingrese un simbolo o letra se mostrara un mensaje de Error.
 
![Captura de pantalla de la aplicacion](https://github.com/Danywolf78/Conversor-de-Moneda---Challenge-ONE-/blob/main/Conversor-de-Moneda---Challenge-ONE-/imagenes/Error_2.jpeg)

Eleccion de la opción de cambio:

Una vez que se selecciona la opcion de cambio,por ejemplo opcion 1, se le dará  la cotización del dia 
y se le preguntara la cantidad de moneda base que desea convertir.

![Captura de pantalla de la aplicacion](https://github.com/Danywolf78/Conversor-de-Moneda---Challenge-ONE-/blob/main/Conversor-de-Moneda---Challenge-ONE-/imagenes/Cotizacion_diaria.jpeg)

Ingresando cantidad a convertir:

Si el usuario ingresa una cantidad inválida (diferente de un número), deberá ingresar nuevamente una cantidad válida.

 ![Captura de pantalla de la aplicacion](https://github.com/Danywolf78/Conversor-de-Moneda---Challenge-ONE-/blob/main/Conversor-de-Moneda---Challenge-ONE-/imagenes/Error_3.jpeg)


 Cuando el usuario ha introducido una cantidad válida, se imprimirá el resultado y la información de la conversión solicitada.

![Captura de pantalla de la aplicacion](https://github.com/Danywolf78/Conversor-de-Moneda---Challenge-ONE-/blob/main/Conversor-de-Moneda---Challenge-ONE-/imagenes/Resultado.jpeg)

 Saliendo del programa: Finalmente, el usuario puede seleccionar la opción 3 para terminar el programa.
![Captura de pantalla de la aplicacion](https://github.com/Danywolf78/Conversor-de-Moneda---Challenge-ONE-/blob/main/Conversor-de-Moneda---Challenge-ONE-/imagenes/Salida.jpeg)

# Dependencias
- Gson: Utilizado para manejar los datos JSON obtenidos de la API.
- Java HttpClient: Para realizar las solicitudes HTTP a la API de ExchangeRate-API.
# Cómo Contribuir
  Si deseas contribuir a este proyecto, sigue estos pasos:

- Haz un fork del repositorio.
- Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
- Realiza tus cambios y haz commit (git commit -am 'Agrega nueva funcionalidad').
- Sube tus cambios (git push origin feature/nueva-funcionalidad).
- Abre un Pull Request.

  # Autor
  - Daniel Lopez  
  - [@Danywolf78](https://github.com/Danywolf78)
