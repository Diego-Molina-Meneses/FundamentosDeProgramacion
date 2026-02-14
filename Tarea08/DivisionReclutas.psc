Algoritmo DivisionReclutas
	Definir edad Como Entero
	Definir fuerza, vision Como Real
	
	Escribir "Ingresa edad:"
	Leer edad
	Escribir "Ingresa fuerza (0-100):"
	Leer fuerza
	Escribir "Ingresa vision (0.0-1.0):"
	Leer vision
	
	Si (edad >= 18) Y (edad <= 25) Entonces
		Si (fuerza > 80) Y (vision >= 0.8) Entonces
			Escribir "Fuerzas Especiales"
		SiNo
			Si (fuerza > 50) Entonces
				Escribir "Estratega"
			SiNo
				Escribir "Infanteria"
			FinSi
		FinSi
	SiNo
		Si (edad > 25) Entonces
			Escribir "No apto"
		SiNo
			Escribir "No apto"
		FinSi
	FinSi
FinAlgoritmo
