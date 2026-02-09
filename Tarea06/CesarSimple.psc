Algoritmo CesarSimple
    Definir secreto, llave, cifra Como Entero
    Escribir "Secreto (0-9):"
    Leer secreto
    Escribir "Llave (0-9):"
    Leer llave
	
    cifra <- secreto + llave
	
    Si cifra >= 10 Entonces
        cifra <- cifra - 10
    FinSi
	
    Escribir "Cifrado: ", cifra
FinAlgoritmo

