Algoritmo calculopromedios2
	
    Definir ciclop, cicloh, nalum, nparcial, cal, scal Como Entero
    Definir palum, sprom, pgeneral Como Real
	
    Escribir "Cuantos alumnos vas a evaluar?"
    Leer nalum
	
    Escribir "Cuantos parciales vas a evaluar?"
    Leer nparcial
	
    ciclop <- 0
    sprom <- 0
	
    Repetir
		
        ciclop <- ciclop + 1
        cicloh <- 0
        scal <- 0
		
        Repetir
            cicloh <- cicloh + 1
            Escribir "Calificacion del alumno ", ciclop, " parcial ", cicloh
            Leer cal
            scal <- scal + cal
        Hasta Que cicloh = nparcial
		
        palum <- scal / nparcial
        Escribir "El promedio del alumno ", ciclop, " fue ", palum
		
        sprom <- sprom + palum
		
    Hasta Que ciclop = nalum
	
    pgeneral <- sprom / nalum
    Escribir "El promedio general fue ", pgeneral
	
FinAlgoritmo
