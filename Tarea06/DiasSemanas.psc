Algoritmo DiasSemanas
    Definir X, semanas, resto Como Entero
    Escribir "Cantidad de dias:"
    Leer X
	
    semanas <- Trunc(X / 7)
    resto <- X % 7
	
    Si semanas = 1 Entonces
        Escribir semanas, " semana y ", resto, " dias"
    SiNo
        Escribir semanas, " semanas y ", resto, " dias"
    FinSi
FinAlgoritmo
