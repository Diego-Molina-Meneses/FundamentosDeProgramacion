Algoritmo IncrementarFechaReal
	
	Definir dia, mes, ano Como Entero
	Definir dias_del_mes Como Entero
	
	Escribir "Introduzca dia: "
	Leer dia
	Escribir "Introduzca mes: "
	Leer mes
	Escribir "Introduzca año: "
	Leer ano
	
	// calcular dias del mes
	Si mes = 2 Entonces
		dias_del_mes <- 28
	SiNo
		Si mes = 4 O mes = 6 O mes = 9 O mes = 11 Entonces
			dias_del_mes <- 30
		SiNo
			dias_del_mes <- 31
		FinSi
	FinSi
	
	// incrementamos el dia
	dia <- dia + 1
	
	// si el dia supera los dias del mes
	Si dia > dias_del_mes Entonces
		dia <- 1
		mes <- mes + 1
	FinSi
	
	// si el mes supera 12
	Si mes > 12 Entonces
		mes <- 1
		ano <- ano + 1
	FinSi
	
	// corregir año 0
	Si ano = 0 Entonces
		ano <- 1
	FinSi
	
	Escribir dia, "/", mes, "/", ano
	
FinAlgoritmo
