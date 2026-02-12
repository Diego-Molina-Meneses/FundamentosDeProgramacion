Algoritmo Ejercicio3
	Definir num Como Entero
	Escribir "Introduce un numero"
	Leer  num
	si (num>0) y (num MOD 2=0) Entonces
		Escribir "Es positivo y par"
    FinSi
	si (num>0) y (num MOD 2>0) Entonces
		Escribir "Es positivo y impar"
	FinSi
	si (num<0) y (num MOD 2=0) Entonces
		Escribir "Es negativo y par"
	FinSi
	si (num<0) y (num MOD 2<>0) Entonces
		Escribir "Es negativo y impar"
	FinSi
FinAlgoritmo
