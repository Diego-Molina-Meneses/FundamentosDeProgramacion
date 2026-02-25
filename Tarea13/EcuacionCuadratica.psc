Algoritmo EcuacionCuadratica
	
	Definir a, b, c, d, x1, x2 Como Real
	
	Escribir "Introduzca primer coeficiente (a): "
	Leer a
	
	Escribir "Introduzca segundo coeficiente (b): "
	Leer b
	
	Escribir "Introduzca tercer coeficiente (c): "
	Leer c
	
	// Calculamos el determinante
	d <- (b*b) - (4*a*c)
	
	Si d < 0 Entonces
		Escribir "No existen soluciones reales"
	SiNo
		Si a = 0 Entonces
			Escribir "No se puede dividir entre cero"
		SiNo
			x1 <- (-b + Raiz(d)) / (2*a)
			x2 <- (-b - Raiz(d)) / (2*a)
			
			Escribir "Solucion: ", x1
			Escribir "Solucion: ", x2
		FinSi
	FinSi
	
FinAlgoritmo
