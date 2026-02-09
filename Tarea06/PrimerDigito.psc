Algoritmo PrimerDigito
    Definir N, primer Como Entero
    Escribir "Numero:"
    Leer N
	
    primer <- trunc(N / 100)
	
    Si primer >= 1 Y primer <= 9 Entonces
        Escribir "Primer digito: ", primer
    SiNo
        Escribir "No es valido."
    FinSi
FinAlgoritmo
