En el contexto de la ingeniería informática, el manejo eficiente de las operaciones en segundo plano y la 
multitarea es crucial, especialmente en situaciones que emulan eventos críticos en tiempo real, como el 
lanzamiento de un cohete. Este ejercicio está inspirado en el histórico lanzamiento del Apollo 11 el 16 de 
julio de 1969, el cual llevó al primer hombre a la Luna. Los estudiantes deben crear una simulación de la 
cuenta regresiva para el lanzamiento, enfocándose en la sincronización de hilos y la comunicación en 
tiempo real con la interfaz de usuario.

Enunciado del Ejercicio:

1. Desarrolla una aplicación que simule la cuenta regresiva para el lanzamiento del Apollo 11. 
La interfaz debe permitir al usuario ingresar una cantidad de segundos y mostrar una barra de progreso y 
una etiqueta de texto que reflejen la cuenta atrás en tiempo real.

	-La cuenta atrás debe iniciarse cuando el usuario pulse un botón.
	-La aplicación debe permitir al usuario cancelar la cuenta atrás en cualquier momento.
	-Al finalizar la cuenta, se debe mostrar un mensaje en una ventana emergente que indique si el 
	lanzamiento ha sido exitoso o cancelado.

2. Amplía la aplicación para que lance dos hilos concurrentes: el primero corresponde a la cuenta atrás, 
mientras que el segundo monitorea y registra el estado del primero (activo, cancelado, completado), 
posiblemente simulando un registro de las condiciones del lanzamiento.

3. Escala la aplicación para ejecutar cuatro hilos secuencialmente, donde cada hilo representa una fase 
crítica del lanzamiento. Cada hilo debe iniciar solo después de que el anterior haya concluido, simulando
la naturaleza secuencial y dependiente de cada fase del lanzamiento del cohete.

Funcionalidades

1. Funcionalidad de la Cuenta Regresiva 

	-Inicio y fin correctos de la cuenta atrás: 
	-Visualización precisa mediante barra de progreso y etiqueta de texto: .
	Funcionalidad de cancelación en tiempo real: 
2. Implementación de Hilos Concurrentes 

	-Ejecución correcta de dos hilos de forma concurrente: 
	-Monitoreo y registro adecuado del estado del hilo de cuenta atrás: 

3. Control de Flujo con Múltiples Hilos

	-Ejecución secuencial correcta de los cuatro hilos: 
	-Sincronización adecuada y manejo de dependencias entre hilos: 

4. Diseño de la Interfaz de Usuario y Experiencia del Usuario 
	-Claridad y estética de la interfaz de usuario: 
	-Mensajes de estado claros y precisos (ventana emergente, etiquetas): 

5. Calidad del Código 

	-Legibilidad y mantenimiento del código: 
	-Comentarios y documentación adecuados: 

Bonus: Creatividad y Funcionalidad Extra 

	-Inclusión de características avanzadas, como simulaciones gráficas, sonidos de cuenta regresiva, 
	información histórica del Apollo 11, etc.
	-Mejoras en la experiencia del usuario, como mensajes de error personalizados, opciones de reinicio, 
	entre otros.
