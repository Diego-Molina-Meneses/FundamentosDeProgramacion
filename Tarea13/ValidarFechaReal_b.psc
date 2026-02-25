Algoritmo ValidarFechaReal_b
	
	Definir dia, mes, ano Como Entero
	Definir dias_del_mes Como Entero
	Definir fecha_correcta Como Logico
	
	fecha_correcta <- Verdadero
	dias_del_mes <- 0   // si se utiliza un mes fuera del rango 1..12
	
	Escribir "Introduzca dia: "
	Leer dia
	Escribir "Introduzca mes: "
	Leer mes
	Escribir "Introduzca año: "
	Leer ano
	
	// en este codigo dice que no existe el 0
	Si ano = 0 Entonces
		fecha_correcta <- Falso
	FinSi
	
	// un dia fuera del rango 1..31 no tiene sentido
	Si dia < 1 O dia > 31 Entonces
		fecha_correcta <- Falso
	FinSi
	
	// un mes fuera del rango 1..12 no tiene sentido
	Si mes < 1 O mes > 12 Entonces
		fecha_correcta <- Falso
	FinSi
	
	// calcular dias del mes
	Si mes = 2 Entonces
		dias_del_mes <- 28
	SiNo
		Si mes = 4 O mes = 6 O mes = 9 O mes = 11 Entonces
			dias_del_mes <- 30
		SiNo
			Si mes = 1 O mes = 3 O mes = 5 O mes = 7 O mes = 8 O mes = 10 O mes = 12 Entonces
				dias_del_mes <- 31
			FinSi
		FinSi
	FinSi
	
	Si dia > dias_del_mes Entonces
		fecha_correcta <- Falso
	FinSi
	
	Si fecha_correcta Entonces
		Escribir dia, "/", mes, "/", ano, ": Fecha correcta"
	SiNo
		Escribir "Fecha incorrecta"
	FinSi
	
FinAlgoritmo
