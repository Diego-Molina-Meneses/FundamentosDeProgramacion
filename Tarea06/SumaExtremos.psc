Algoritmo SumaExtremos
    Definir N, centenas, unidades, suma Como Entero
    Escribir "Numero:"
    Leer N
	
    Si N > 0 Entonces
        centenas <- trunc(N / 100)
        unidades <- N MOD 10
        suma <- centenas + unidades
        Escribir "Suma de extremos: ", suma
    SiNo
        Escribir "El numero no es positivo."
    FinSi
FinAlgoritmo

