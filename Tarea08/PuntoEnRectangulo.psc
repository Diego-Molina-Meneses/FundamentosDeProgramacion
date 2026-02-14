Algoritmo PuntoEnRectangulo
	Definir x1,y1,x2,y2,px,py Como Real
	
	Escribir "Ingresa x1: "
	Leer x1
	Escribir "Ingresa y1: "
	Leer y1
	Escribir "Ingresa x2: "
	Leer x2
	Escribir "Ingresa y2: "
	Leer y2
	Escribir "Ingresa px: "
	Leer px
	Escribir "Ingresa py: "
	Leer py
	
	Si (px > x1 Y px < x2) Y (py > y1 Y py < y2) Entonces
		Escribir "Dentro"
	SiNo
		Si (px >= x1 Y px <= x2) Y (py >= y1 Y py <= y2) Entonces
			Escribir "Borde"
		SiNo
			Escribir "Fuera"
		FinSi
	FinSi
FinAlgoritmo
