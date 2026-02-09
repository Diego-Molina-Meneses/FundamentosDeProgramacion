Algoritmo RepartoCartas
    Definir J, cartas Como Entero
    Escribir "Jugadores:"
    Leer J
	
    Si J > 0 Entonces
        cartas <- trunc(52 / J)
        Escribir "Cartas por jugador: ", cartas
    SiNo
        Escribir "Numero invalido de jugadores."
    FinSi
FinAlgoritmo

