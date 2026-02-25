Algoritmo IncrementarFecha
	
	Definir dia, mes, ano Como Entero
	
	Escribir "Introduzca dia: "
	Leer dia
	Escribir "Introduzca mes: "
	Leer mes
	Escribir "Introduzca año: "
	Leer ano
	
	// suponemos que la fecha introducida es correcta
	
	// incrementamos el dia
	dia <- dia + 1
	
	// si el dia supera 30, lo reiniciamos a 1 e incrementamos el mes
	Si dia > 30 Entonces
		dia <- 1
		mes <- mes + 1
		
		// si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
		Si mes > 12 Entonces
			mes <- 1
			ano <- ano + 1
		FinSi
	FinSi
	
	// corregimos si el año queda en 0
	Si ano = 0 Entonces
		ano <- 1
	FinSi
	
	Escribir dia, "/", mes, "/", ano
	
FinAlgoritmo
