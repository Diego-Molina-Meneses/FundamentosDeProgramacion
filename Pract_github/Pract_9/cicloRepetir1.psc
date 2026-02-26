Algoritmo cicloRepetir1
	
    Definir ciclo, num Como Entero
	
    Escribir "introduce el numero de la tabla a desplegar"
    Leer num
	
    ciclo <- 1
	
    Repetir
        Escribir num, " * ", ciclo, " = ", (ciclo * num)
        ciclo <- ciclo + 1
    Hasta Que ciclo > 10
	
FinAlgoritmo
