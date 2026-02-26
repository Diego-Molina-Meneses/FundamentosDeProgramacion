Algoritmo cicloMientras2
	
    Definir cicloP, cicloH Como Entero
    Definir numAlum, parcial, cal, promParcial Como Entero
    Definir promAlum, sumaProm, promGeneral Como Real
	
    Escribir "¿Cuantos alumnos vas a evaluar?"
    Leer numAlum
	
    Escribir "¿Cuantos parciales vas a evaluar?"
    Leer parcial
	
    cicloP <- 0
    sumaProm <- 0
	
    Mientras cicloP < numAlum Hacer
		
        cicloP <- cicloP + 1
        cicloH <- 0
        promParcial <- 0
		
        Mientras cicloH < parcial Hacer
			
            cicloH <- cicloH + 1
            Escribir "Calificacion del alumno ", cicloP, " parcial ", cicloH
            Leer cal
			
            promParcial <- promParcial + cal
			
        FinMientras
		
        promAlum <- promParcial / parcial
        Escribir "El promedio del alumno ", cicloP, " fue: ", promAlum
		
        sumaProm <- sumaProm + promAlum
		
    FinMientras
	
    promGeneral <- sumaProm / numAlum
    Escribir "El promedio general fue: ", promGeneral
	
FinAlgoritmo
