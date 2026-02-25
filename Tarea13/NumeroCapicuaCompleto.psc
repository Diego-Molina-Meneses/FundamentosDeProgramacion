Algoritmo NumeroCapicuaCompleto
	
	Definir num, dm, um, c, d, u Como Entero
	Definir capicua Como Logico
	
	capicua <- Falso
	
	Escribir "Introduzca un numero entre 0 y 99,999: "
	Leer num
	
	u <- num MOD 10
	num <- Trunc(num / 10)
	
	d <- num MOD 10
	num <- Trunc(num / 10)
	
	c <- num MOD 10
	num <- Trunc(num / 10)
	
	um <- num MOD 10
	num <- Trunc(num / 10)
	
	dm <- num
	
	// 5 cifras
	Si (dm <> 0) Y (dm = u) Y (um = d) Entonces
		capicua <- Verdadero
	FinSi
	
	// 4 cifras
	Si (dm = 0) Y (um <> 0) Y (um = u) Y (c = d) Entonces
		capicua <- Verdadero
	FinSi
	
	// 3 cifras
	Si (dm = 0) Y (um = 0) Y (c <> 0) Y (c = u) Entonces
		capicua <- Verdadero
	FinSi
	
	// 2 cifras
	Si (dm = 0) Y (um = 0) Y (c = 0) Y (d <> 0) Y (d = u) Entonces
		capicua <- Verdadero
	FinSi
	
	Si capicua Entonces
		Escribir "El numero es capicua"
	SiNo
		Escribir "El numero NO es capicua"
	FinSi
	
FinAlgoritmo
