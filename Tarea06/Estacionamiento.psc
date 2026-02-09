Algoritmo Estacionamiento
    Definir minutos, horas, residuo Como Entero
    Escribir "Tiempo en minutos:"
    Leer minutos
	
    horas <- trunc(minutos / 60)
    residuo <- minutos - horas*60
	
    Si residuo > 0 Entonces
        horas <- horas + 1
    FinSi
	
    Escribir "Horas a cobrar: ", horas
FinAlgoritmo

