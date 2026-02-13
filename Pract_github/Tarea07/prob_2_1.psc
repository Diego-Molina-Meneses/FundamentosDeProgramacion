Algoritmo prob_2_1
	
	Definir num, resultado Como Entero
	
	Escribir "Introduce el numero a evaluar"
	Leer num
	
	resultado <- num MOD 2
	
	Si resultado = 0 Entonces
		Escribir "El ", num, " es par"
	SiNo
		Escribir "El ", num, " es impar"
	FinSi
	
FinAlgoritmo
