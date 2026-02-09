Algoritmo Invertir2Cifras
    Definir N, D, U, invertido Como Entero
    Escribir "Numero de dos cifras:"
    Leer N
	
    D <- trunc(N / 10)
    U <- N MOD 10
	
    invertido <- U * 10 + D
	
    Escribir "Numero invertido: ", invertido
FinAlgoritmo

