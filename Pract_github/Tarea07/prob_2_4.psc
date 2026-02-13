Algoritmo prob_2_4
	
	Definir parcial1, parcial2, parcial3 Como Entero
	Definir resultado Como Real
	
	Escribir "Introduce la calificacion del Parcial 1"
	Leer parcial1
	
	Escribir "Introduce la calificacion del Parcial 2"
	Leer parcial2
	
	Escribir "Introduce la calificacion del Parcial 3"
	Leer parcial3
	
	resultado <- (parcial1 + parcial2 + parcial3) / 3
	
	Si resultado >= 7 Entonces
		Escribir "ALUMNO ACREDITADO"
	SiNo
		Escribir "ALUMNO NO ACREDITADO"
	FinSi
	
FinAlgoritmo

