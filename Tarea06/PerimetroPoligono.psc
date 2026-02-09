Algoritmo PerimetroPoligono
    Definir L, perimetro Como Real
    Escribir "Lado L:"
    Leer L
	
    Si L > 0 Entonces
        perimetro <- L + L + L + L + L + L
        Escribir "Perimetro: ", perimetro
    SiNo
        Escribir "El lado debe ser mayor que cero."
    FinSi
FinAlgoritmo

