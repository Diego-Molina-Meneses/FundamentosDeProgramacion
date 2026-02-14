Algoritmo TriangulosPorAngulos
	Definir A, B, C Como Entero
	Escribir "Ingresa A, B, C:"
	Leer A, B, C
	
	Si (A > 0) Y (B > 0) Y (C > 0) Y (A + B + C = 180) Entonces
		Si (A = 90) O (B = 90) O (C = 90) Entonces
			Escribir "Rectangulo"
		SiNo
			Si (A > 90) O (B > 90) O (C > 90) Entonces
				Escribir "Obtusangulo"
			SiNo
				Escribir "Acutangulo"
			FinSi
		FinSi
	SiNo
		Escribir "Angulos Invalidos"
	FinSi
FinAlgoritmo

