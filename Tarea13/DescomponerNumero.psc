Algoritmo DescomponerNumero
	
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
	
	Escribir "dm = ", dm
	Escribir "um = ", um
	Escribir "c = ", c
	Escribir "d = ", d
	Escribir "u = ", u
	
FinAlgoritmo