Algoritmo calculopromedios3
	
    Definir i, j, nalum, nparcial, cal, scal Como Entero
    Definir palum, sprom, pgeneral Como Real
	
    Escribir "Cuantos alumnos vas a evaluar?"
    Leer nalum
	
    Escribir "Cuantos parciales vas a evaluar?"
    Leer nparcial
	
    i <- 1
    sprom <- 0
	
    Mientras i <= nalum Hacer
		
        scal <- 0
		
        Para j <- 1 Hasta nparcial Hacer
            Escribir "Calificacion del alumno ", i," parcial ", j
            Leer cal
            scal <- scal + cal
        FinPara
		
        palum <- scal / nparcial
        Escribir "El promedio del alumno ", i, " fue ", palum
		
        sprom <- sprom + palum
        i <- i + 1
		
    FinMientras
	
    pgeneral <- sprom / nalum
    Escribir "El promedio general fue ", pgeneral
	
FinAlgoritmo
