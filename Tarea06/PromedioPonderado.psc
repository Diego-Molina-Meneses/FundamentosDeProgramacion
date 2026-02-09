Algoritmo PromedioPonderado
    Definir N1, N2, N3, promedio Como Real
    Escribir "Nota 1:"
    Leer N1
    Escribir "Nota 2:"
    Leer N2
    Escribir "Nota 3:"
    Leer N3
	
    promedio <- N1*0.2 + N2*0.3 + N3*0.5
	
    Si promedio >= 6 Entonces
        Escribir "Promedio satisfactorio: ", promedio
    SiNo
        Escribir "Promedio no satisfactorio: ", promedio
    FinSi
FinAlgoritmo

