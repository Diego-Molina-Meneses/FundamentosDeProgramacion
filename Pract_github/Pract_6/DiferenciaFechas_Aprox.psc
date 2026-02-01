Algoritmo DiferenciaFechas_Aprox
	Definir d1, m1, a1, d2, m2, a2, dias Como Entero
	
	Escribir "Fecha 1: Introduzca dia:"
	Leer d1
	Escribir "Fecha 1: Introduzca mes:"
	Leer m1
	Escribir "Fecha 1: Introduzca ano:"
	Leer a1
	
	Escribir "Fecha 2: Introduzca dia:"
	Leer d2
	Escribir "Fecha 2: Introduzca mes:"
	Leer m2
	Escribir "Fecha 2: Introduzca ano:"
	Leer a2
	
	dias <- (d2 - d1) + 30*(m2 - m1) + 365*(a2 - a1)
	
	Escribir "Dias de diferencia: ", dias
FinAlgoritmo

