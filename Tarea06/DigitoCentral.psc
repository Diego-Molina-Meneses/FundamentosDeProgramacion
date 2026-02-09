Algoritmo DigitoCentral
    Definir N, decenas Como Entero
    Escribir "Numero:"
    Leer N
	
    Si N >= 100 Y N <= 999 Entonces
        decenas <- trunc(N / 10) MOD 10
        Escribir "Digito central: ", decenas
    SiNo
        Escribir "No es un numero de 3 cifras."
    FinSi
FinAlgoritmo

