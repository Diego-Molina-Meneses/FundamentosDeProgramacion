Algoritmo ValidarFechaReal
	
	Definir dia, mes, ano Como Entero
	
	Escribir "Introduzca dia: "
	Leer dia
	Escribir "Introduzca mes: "
	Leer mes
	Escribir "Introduzca año: "
	Leer ano
	
	// en este codigo dice que no existe el 0
	Si ano = 0 Entonces
		Escribir "Fecha incorrecta"
	SiNo
		Si mes = 2 Entonces
			Si dia >= 1 Y dia <= 28 Entonces
				Escribir dia, "/", mes, "/", ano, ": Fecha correcta"
			SiNo
				Escribir "Fecha incorrecta"
			FinSi
		SiNo
			Si (mes=1 O mes=3 O mes=5 O mes=7 O mes=8 O mes=10 O mes=12) Entonces
				Si dia >= 1 Y dia <= 30 Entonces
					Escribir dia, "/", mes, "/", ano, ": Fecha correcta"
				SiNo
					Escribir "Fecha incorrecta"
				FinSi
			SiNo
				Si (mes=4 O mes=6 O mes=9 O mes=11) Entonces
					Si dia >= 1 Y dia <= 31 Entonces
						Escribir dia, "/", mes, "/", ano, ": Fecha correcta"
					SiNo
						Escribir "Fecha incorrecta"
					FinSi
				SiNo
					Escribir "Fecha incorrecta"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
