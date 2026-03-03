Algoritmo TablaMultiplicar
	Definir num, i Como Entero
	
	Repetir
		Escribir "Introduce numero (de 0 a 10): "
		Leer num
	Hasta Que num >= 0 Y num <= 10
	
	Escribir "Tabla del ", num
	
	Para i <- 1 Hasta 10 Hacer
		Escribir num, " x ", i, " = ", num * i
	FinPara
	
FinAlgoritmo
