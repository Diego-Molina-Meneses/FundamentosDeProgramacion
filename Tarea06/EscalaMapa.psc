Algoritmo EscalaMapa
    Definir C, metros, km Como Real
    Escribir "Centimetros en el mapa:"
    Leer C
	
    metros <- C * 500
    km <- metros / 1000
	
    Si km < 1 Entonces
        Escribir "Distancia real: ", metros, " metros"
    SiNo
        Escribir "Distancia real: ", km, " km"
    FinSi
FinAlgoritmo

