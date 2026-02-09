Algoritmo Reloj24Horas
    Definir minutos, horas Como Entero
    Escribir "Total de minutos:"
    Leer minutos
	
    horas <- trunc(minutos / 60)
	
    Si horas >= 24 Entonces
        horas <- horas MOD 24
    FinSi
	
    Escribir "Hora resultante: ", horas
FinAlgoritmo

