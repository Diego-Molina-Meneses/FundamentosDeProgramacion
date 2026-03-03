Algoritmo SueldoMaximo
	Definir sueldo, sueldo_max, n Como Entero
	Definir i Como Entero
	
	sueldo_max <- 0
	
	Escribir "Numero de sueldos: "
	Leer n
	
	Para i <- 1 Hasta n Hacer
		Escribir "Introduce sueldo: "
		Leer sueldo
		
		Si sueldo > sueldo_max Entonces
			sueldo_max <- sueldo
		FinSi
	FinPara
	
	Escribir "El sueldo maximo es: ", sueldo_max
	
FinAlgoritmo
