Algoritmo Circulos
	Definir x1,y1,x2,y2,r1,r2,dist2 Como Real
	
	Escribir "Ingresa x1: "
	Leer x1
	Escribir "Ingresa y1: "
	Leer y1
	Escribir "Ingresa x2: "
	Leer x2
	Escribir "Ingresa y2: "
	Leer y2
	Escribir "Ingresa r1: "
	Leer r1
	Escribir "Ingresa r2: "
	Leer r2
	
	dist2 <- (x2-x1)^2 + (y2-y1)^2
	
	Si dist2 = (r1+r2)^2 Entonces
		Escribir "Tangentes"
	SiNo
		Si dist2 < (r1+r2)^2 Entonces
			Escribir "Traslapan"
		SiNo
			Escribir "No se tocan"
		FinSi
	FinSi
FinAlgoritmo

