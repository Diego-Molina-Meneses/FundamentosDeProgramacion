Algoritmo Formador
    Definir A, B, C, numero Como Entero
    Escribir "A:"
    Leer A
    Escribir "B:"
    Leer B
    Escribir "C:"
    Leer C
	
    Si A >= 0 Y A <= 9 Entonces
        Si B >= 0 Y B <= 9 Entonces
            Si C >= 0 Y C <= 9 Entonces
                numero <- A*100 + B*10 + C
                Escribir "Numero formado: ", numero
            FinSi
        FinSi
    FinSi
FinAlgoritmo

