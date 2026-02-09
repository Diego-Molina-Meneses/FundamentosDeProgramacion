Algoritmo HashPobre
    Definir N, a, b, c, d, checksum Como Entero
    Escribir "Numero de 4 cifras:"
    Leer N
	
    a <- trunc(N / 1000)
    b <- trunc(N / 100) MOD 10
    c <- trunc(N / 10) MOD 10
    d <- N MOD 10
	
    checksum <- a + b + c + d
	
    Escribir "Checksum: ", checksum
FinAlgoritmo

