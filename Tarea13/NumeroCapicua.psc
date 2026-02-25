Algoritmo NumeroCapicua
	
	Definir num, dm, um, c, d, u Como Entero
	
	Escribir "Introduzca un numero entre 0 y 99,999: "
	Leer num
	
	// unidad
	u <- num MOD 10
	num <- Trunc(num / 10)
	
	// decenas
	d <- num MOD 10
	num <- Trunc(num / 10)
	
	// centenas
	c <- num MOD 10
	num <- Trunc(num / 10)
	
	// unidades de millar
	um <- num MOD 10
	num <- Trunc(num / 10)
	
	// decenas de millar
	dm <- num
	
	Si (dm = u) Y (um = d) Entonces
		Escribir "El numero es capicua"
	SiNo
		Escribir "El numero NO es capicua"
	FinSi
	
FinAlgoritmo
