Algoritmo TieBreakTenis
	Definir A, B Como Entero
	
	Escribir "Puntos Jugador A:"
	Leer A
	Escribir "Puntos Jugador B:"
	Leer B
	
	Si (A >= 6 O B >= 6) Entonces
		
		// Ganar si tiene 6 y el otro 0-4
		Si (A = 6) Y (B <= 4) Entonces
			Escribir "Gana A"
		SiNo
			Si (B = 6) Y (A <= 4) Entonces
				Escribir "Gana B"
			SiNo
				// Si están 5-5, deben llegar a 7 (ganar por 2)
				// Si están 6-6, muerte súbita: el que llegue a 7 gana
				Si (A = 7) Y (B = 6) Entonces
					Escribir "Gana A"
				SiNo
					Si (B = 7) Y (A = 6) Entonces
						Escribir "Gana B"
					SiNo
						Si (A = 7) Y (B = 5) Entonces
							Escribir "Gana A"
						SiNo
							Si (B = 7) Y (A = 5) Entonces
								Escribir "Gana B"
							SiNo
								Escribir "En juego"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		
	SiNo
		Escribir "En juego"
	FinSi
FinAlgoritmo

