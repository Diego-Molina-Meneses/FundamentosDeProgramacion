Algoritmo InvertirNumero_5Digitos
	Definir numero, dm, um, c, d, u, invertido Como Entero
	
	Escribir "Introduzca un numero entre 0 y 99,999:"
	Leer numero
	
	dm <- Trunc(numero / 10000)
	numero <- numero % 10000
	
	um <- Trunc(numero / 1000)
	numero <- numero % 1000
	
	c <- Trunc(numero / 100)
	numero <- numero % 100
	
	d <- Trunc(numero / 10)
	numero <- numero % 10
	
	u <- numero
	
	Escribir "Digitos al reves: ", u, " ", d, " ", c, " ", um, " ", dm
	
	invertido <- 10000*u + 1000*d + 100*c + 10*um + dm
	Escribir "Numero invertido: ", invertido
FinAlgoritmo

