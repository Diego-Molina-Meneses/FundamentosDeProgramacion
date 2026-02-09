Algoritmo SharingID
    Definir ID, r Como Entero
    Escribir "ID:"
    Leer ID
	
    r <- ID MOD 3
	
    Si r = 0 Entonces
        Escribir "Servidor 0"
    FinSi
    Si r = 1 Entonces
        Escribir "Servidor 1"
    FinSi
    Si r = 2 Entonces
        Escribir "Servidor 2"
    FinSi
FinAlgoritmo

