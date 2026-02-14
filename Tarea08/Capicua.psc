Algoritmo Capicua
	Definir num,d1,d2,d3,d4 Como Entero
	
	Escribir "Ingresa un numero de 4 cifras: "
	Leer num
	
	d1 <- trunc(num / 1000)
	d2 <- trunc(num / 100) MOD 10
	d3 <- trunc(num / 10) MOD 10
	d4 <- num MOD 10
	
	Si (d1 = d4) Y (d2 = d3) Entonces
		Escribir "Es Capicua"
	SiNo
		Escribir "No lo es"
	FinSi
FinAlgoritmo
