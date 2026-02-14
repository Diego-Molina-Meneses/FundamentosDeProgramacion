Algoritmo ValidarFecha
	Definir dia, mes Como Entero
	Definir bisiesto Como Logico
	
	Escribir "Dia:"
	Leer dia
	Escribir "Mes:"
	Leer mes
	Escribir "Es bisiesto? (1=Si, 0=No):"
	Definir aux Como Entero
	Leer aux
	Si aux = 1 Entonces
		bisiesto <- Verdadero
	SiNo
		bisiesto <- Falso
	FinSi
	
	Si mes < 1 O mes > 12 Entonces
		Escribir "Fecha Invalida"
	SiNo
		Si dia < 1 Entonces
			Escribir "Fecha Invalida"
		SiNo
			// Meses de 31
			Si (mes = 1) O (mes = 3) O (mes = 5) O (mes = 7) O (mes = 8) O (mes = 10) O (mes = 12) Entonces
				Si dia <= 31 Entonces
					Escribir "Fecha Valida"
				SiNo
					Escribir "Fecha Invalida"
				FinSi
				
			SiNo
				// Meses de 30
				Si (mes = 4) O (mes = 6) O (mes = 9) O (mes = 11) Entonces
					Si dia <= 30 Entonces
						Escribir "Fecha Valida"
					SiNo
						Escribir "Fecha Invalida"
					FinSi
				SiNo
					// Febrero
					Si bisiesto Entonces
						Si dia <= 29 Entonces
							Escribir "Fecha Valida"
						SiNo
							Escribir "Fecha Invalida"
						FinSi
					SiNo
						Si dia <= 28 Entonces
							Escribir "Fecha Valida"
						SiNo
							Escribir "Fecha Invalida"
						FinSi
					FinSi
				FinSi
			FinSi
			
		FinSi
	FinSi
FinAlgoritmo

