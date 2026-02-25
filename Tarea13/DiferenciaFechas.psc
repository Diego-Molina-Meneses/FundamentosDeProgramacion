Algoritmo DiferenciaFechas
	
	Definir dia1, mes1, ano1 Como Entero
	Definir dia2, mes2, ano2 Como Entero
	Definir total_dias Como Entero
	
	Escribir "Fecha 1:"
	Escribir "Introduzca dia: "
	Leer dia1
	Escribir "Introduzca mes: "
	Leer mes1
	Escribir "Introduzca año: "
	Leer ano1
	
	Escribir "Fecha 2:"
	Escribir "Introduzca dia: "
	Leer dia2
	Escribir "Introduzca mes: "
	Leer mes2
	Escribir "Introduzca año: "
	Leer ano2
	
	// convertimos las dos fechas a dias y calculamos la diferencia
	total_dias <- dia2 - dia1 + 30*(mes2 - mes1) + 365*(ano2 - ano1)
	
	Escribir "Dias de diferencia: ", total_dias
	
FinAlgoritmo
