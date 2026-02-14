Algoritmo SaltoCaballo
	Definir x1, y1, x2, y2 Como Entero
	Definir dx, dy Como Entero
	
	Escribir "Ingresa x1 y1:"
	Leer x1, y1
	Escribir "Ingresa x2 y2:"
	Leer x2, y2
	
	dx <- Abs(x2 - x1)
	dy <- Abs(y2 - y1)
	
	Si ((dx = 2) Y (dy = 1)) O ((dx = 1) Y (dy = 2)) Entonces
		Escribir "Movimiento Valido"
	SiNo
		Escribir "Invalido"
	FinSi
FinAlgoritmo

