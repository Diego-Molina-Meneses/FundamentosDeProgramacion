Algoritmo CostoViaje
    Definir K, litros, costo Como Real
    Escribir "Distancia K:"
    Leer K
	
    litros <- K / 12
    costo <- litros * 20
	
    Si K > 500 Entonces
        costo <- costo + 100
    FinSi
	
    Escribir "Costo total: ", costo
FinAlgoritmo

