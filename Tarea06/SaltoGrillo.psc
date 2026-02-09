Algoritmo SaltoGrillo
    Definir D, K, saltos Como Entero
    Escribir "Distancia D:"
    Leer D
    Escribir "Salto K:"
    Leer K
	
    Si (D % K) = 0 Entonces
        saltos <- D / K
        Escribir "Saltos: ", saltos
    SiNo
        Escribir "D no es multiplo de K."
    FinSi
FinAlgoritmo

