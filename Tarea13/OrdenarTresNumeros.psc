Algoritmo OrdenarTresNumeros
	
	Definir a, b, c Como Entero
	
	Escribir "Introduzca primer numero: "
	Leer a
	
	Escribir "Introduzca segundo numero: "
	Leer b
	
	Escribir "Introduzca tercer numero: "
	Leer c
	
	Si a > b Y b > c Entonces
		Escribir a, ", ", b, ", ", c
	SiNo
		Si a > c Y c > b Entonces
			Escribir a, ", ", c, ", ", b
		SiNo
			Si b > a Y a > c Entonces
				Escribir b, ", ", a, ", ", c
			SiNo
				Si b > c Y c > a Entonces
					Escribir b, ", ", c, ", ", a
				SiNo
					Si c > a Y a > b Entonces
						Escribir c, ", ", a, ", ", b
					SiNo
						Escribir c, ", ", b, ", ", a
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
