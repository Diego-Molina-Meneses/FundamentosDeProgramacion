Algoritmo CategoriaBoxeo
	Definir peso Como Real
	
	Escribir "Ingresa el peso en kg:"
	Leer peso
	
	Si peso < 52 Entonces
		Escribir "Mosca"
	SiNo
		Si peso <= 63 Entonces
			Escribir "Ligero"
		SiNo
			Si peso <= 75 Entonces
				Escribir "Mediano"
			SiNo
				Si peso <= 91 Entonces
					Escribir "Pesado"
				SiNo
					Escribir "Super Pesado"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

