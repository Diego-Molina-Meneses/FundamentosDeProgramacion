Algoritmo Ejercicio1_
	Definir numero, sumaPar, sumaImpar, contador Como Entero
	
	sumaPar <- 0
	sumaImpar <- 0
	
	Para contador <- 1 Hasta 10 Con Paso 1 Hacer
		
		Escribir "Ingrese un número:"
		Leer numero
		
		Si numero % 2 = 0 Entonces
			sumaPar <- sumaPar + numero
		SiNo
			sumaImpar <- sumaImpar + numero
		FinSi
		
	FinPara
	
	sumaImpar <- trunc(sumaImpar / 10)
	sumaPar <- trunc(sumaPar / 10)
	
	Escribir "La media de los números pares ingresados es:"
	Escribir sumaPar
	
	Escribir "La media de los números impares ingresados es:"
	Escribir sumaImpar
FinAlgoritmo