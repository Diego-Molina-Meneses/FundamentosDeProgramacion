Algoritmo CalculoPromedios
	
    Definir ciclop, cicloh, nalum, nparcial, cal, scal Como Entero
    Definir palum, sprom, pgeneral Como Real
    Definir salida Como Caracter
	
    salida <- ""
	
    Escribir "¿Cuantos alumnos vas a evaluar?"
    Leer nalum
	
    Escribir "¿Cuantos parciales vas a evaluar?"
    Leer nparcial
	
    ciclop <- 0
    sprom <- 0
	
    Mientras ciclop < nalum Hacer
		
        ciclop <- ciclop + 1
        cicloh <- 0
        scal <- 0
		
        Mientras cicloh < nparcial Hacer
			
            cicloh <- cicloh + 1
            Escribir "Calificacion del alumno ", ciclop," parcial ", cicloh
            Leer cal
			
            scal <- scal + cal
			
        FinMientras
		
        palum <- scal / nparcial
        Escribir "El promedio del alumno ", ciclop, " fue ", palum
		
        sprom <- sprom + palum
		
    FinMientras
	
    pgeneral <- sprom / nalum
    Escribir "El promedio general fue ", pgeneral
	
FinAlgoritmo