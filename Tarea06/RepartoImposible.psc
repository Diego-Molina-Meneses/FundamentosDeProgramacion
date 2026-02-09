Algoritmo RepartoImposible
    Definir N, K, Q, sobrante Como Entero
    Escribir "Total (N):"
    Leer N
    Escribir "Por grupo (K):"
    Leer K
	
    Q <- N / K
    sobrante <- N - (Q * K)
	
    Escribir "Cociente entero Q: ", Q
	
    Si sobrante > 0 Entonces
        Escribir "El capitan se lleva: ", sobrante
    SiNo
        Escribir "El capitan se lleva: 0"
    FinSi
FinAlgoritmo

