Algoritmo PropagacionPaquetes
    Definir D, V, tiempo Como Entero
    Escribir "Distancia (D):"
    Leer D
    Escribir "Velocidad (V):"
    Leer V
	
    tiempo <- trunc(D / V)
	
    Si trunc(D MOD V) > 0 Entonces
        tiempo <- tiempo + 1
    FinSi
	
    Escribir "Tiempo total: ", tiempo
FinAlgoritmo

