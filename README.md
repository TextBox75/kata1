# IS2 Kata 1

### Objetivo
El objetivo de esta kata es el de aprender el manejo de git e IntelliJ IDEa mediante la creación de 3 microproyectos con
pequeñas variaciones entre sí.

### Como compilar y ejecutar
Clonar el repositorio con `git clone https://github.com/TextBox75/kata1.git` y abrir la carpeta con IntelliJ IDEa y OpenJDK 25.
Finalmente ejecutar la clase Main. El repositorio no tiene ninguna dependencia.

### Estructura de la entrega
El proyecto se divide en 3 branches principales:

- Master branch: El primer microproyectom con una clase Person y una clase Main. La clase Person contiene dos atributos
que son firstName y birthday. También tiene un método age() que calcula la edad de la persona.

- Student branch: El segundo microproyecto con una clase Student y una clase Main. La clase Student contiene dos atributos
firstName y lastName y un método gradePercentage que calcula el porcentaje de nota en una tarea arbitraria entre los 
argumentos grade y gradeMax.

- Rectangle branch: El tercer microproyecto con una clase Rectangle y una clase Main. La clase Rectangle contiene dos atributos
width y height y un método que calcula el área del rectángulo.

### Flujo git usado
Todos avance en el proyecto se sube como commits a la branch develop. Una vez finalizado los cambios se hace un merge entre
susodicho branch y un branch nuevo que albergará la versión final de los cambios programados.

### Enlace al vídeo


### Verificación
La clase Main de cada branch contiene pruebas básicas. Si en la consola se imprime "Tests success" o similar es que los tests
se han realizado exitosamente. En caso contrario se imprime un error y se aborta la ejecución del programa.
