Algoritmo FilasCine
    Definir N, fila Como Entero
    Escribir "Ticket:"
    Leer N
	
    Si N > 0 Entonces
        fila <- Trunc((N - 1) / 8) + 1
        Escribir "Fila: ", fila
    SiNo
        Escribir "Ticket invalido."
    FinSi
FinAlgoritmo



