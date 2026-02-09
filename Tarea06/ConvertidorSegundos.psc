Algoritmo ConvertidorSegundos
    Definir segund, horas, minutos, segundosFinal, resto Como Entero
    Escribir "Segundos totales:"
    Leer segund
	
    horas <- trunc(segund / 3600)
    resto <- segund - horas*3600
	
    minutos <- resto / 60
    segundosFinal <- resto - minutos*60
	
    Si minutos >= 60 Entonces
        minutos <- 59
    FinSi
	
    Si segundosFinal >= 60 Entonces
        segundosFinal <- 59
    FinSi
	
    Escribir "Horas: ", horas
    Escribir "Minutos: ", minutos
    Escribir "Segundos: ", segundosFinal
FinAlgoritmo

