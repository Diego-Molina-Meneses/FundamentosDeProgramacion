Algoritmo CantidadCifras
	
	Definir num Como Entero
	
	Escribir "Introduzca un numero entre 0 y 99,999: "
	Leer num
	
	Si num < 10 Entonces
		Escribir "Tiene 1 cifra"
	SiNo
		Si num < 100 Entonces
			Escribir "Tiene 2 cifras"
		SiNo
			Si num < 1000 Entonces
				Escribir "Tiene 3 cifras"
			SiNo
				Si num < 10000 Entonces
					Escribir "Tiene 4 cifras"
				SiNo
					Si num < 100000 Entonces
						Escribir "Tiene 5 cifras"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
