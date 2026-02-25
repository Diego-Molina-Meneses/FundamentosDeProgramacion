Algoritmo ClasificarNota
	
	Definir nota Como Entero
	
	Escribir "Introduzca una nota: "
	Leer nota
	
	Si nota >= 0 Y nota < 5 Entonces
		Escribir "INSUFICIENTE"
	SiNo
		Si nota = 5 Entonces
			Escribir "SUFICIENTE"
		SiNo
			Si nota = 6 Entonces
				Escribir "BIEN"
			SiNo
				Si nota >= 7 Y nota <= 8 Entonces
					Escribir "NOTABLE"
				SiNo
					Si nota >= 9 Y nota <= 10 Entonces
						Escribir "SOBRESALIENTE"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
