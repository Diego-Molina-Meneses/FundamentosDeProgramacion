Algoritmo ValidarFecha
	
	Definir dia, mes, ano Como Entero
	
	Escribir "Introduzca dia: "
	Leer dia
	
	Escribir "Introduzca mes: "
	Leer mes
	
	Escribir "Introduzca año: "
	Leer ano
	
	Si dia >= 1 Y dia <= 30 Entonces
		
		Si mes >= 1 Y mes <= 12 Entonces
			
			Si ano >= 0 Entonces
				Escribir "Fecha correcta"
			SiNo
				Escribir "Año incorrecto"
			FinSi
			
		SiNo
			Escribir "Mes incorrecto"
		FinSi
		
	SiNo
		Escribir "Dia incorrecto"
	FinSi
	
FinAlgoritmo
