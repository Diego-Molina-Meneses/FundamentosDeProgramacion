Algoritmo EliminarExtremos
    Definir N, centrales Como Entero
    Escribir "Numero:"
    Leer N
	
    Si N >= 1000 Y N <= 9999 Entonces
        centrales <- trunc(N / 10) MOD 100
        Escribir "Cifras centrales: ", centrales
    SiNo
        Escribir "No es de 4 cifras."
    FinSi
FinAlgoritmo

