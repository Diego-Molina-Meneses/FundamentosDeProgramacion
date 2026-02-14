Algoritmo SistemaMedallas
	Definir n1, n2, n3, promedio Como Real
	
	Escribir "Ingresa la calificacion 1:"
	Leer n1
	Escribir "Ingresa la calificacion 2:"
	Leer n2
	Escribir "Ingresa la calificacion 3:"
	Leer n3
	
	promedio <- (n1 + n2 + n3) / 3
	
	Si promedio > 90 Entonces
		
		Si (n1 = 100) O (n2 = 100) O (n3 = 100) Entonces
			Escribir "Oro con Honores"
		SiNo
			Escribir "Oro"
		FinSi
		
	SiNo
		Si promedio >= 80 Entonces
			Escribir "Plata"
		SiNo
			Escribir "Sin Medalla"
		FinSi
	FinSi	
FinAlgoritmo

