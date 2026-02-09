Algoritmo HorarioLaboral
    Definir S, horas Como Entero
    Escribir "Segundos trabajados:"
    Leer S
	
    horas <- Trunc(S / 3600)
	
    Si horas >= 24 Entonces
        horas <- horas % 24
    FinSi
	
    Escribir "Horas completas: ", horas
FinAlgoritmo

