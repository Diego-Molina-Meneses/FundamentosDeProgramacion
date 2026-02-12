Algoritmo Ejercicio5
	Definir num Como Entero
	Escribir "Introduce un numero"
	Leer  num
	si (num>0) y (num MOD 2=0) Entonces
		Escribir "Es positivo y par"
	SiNo
		si (num>0) y (num MOD 2>0) Entonces
			Escribir "Es positivo y impar"
		SiNo
			si (num<0) y (num MOD 2=0) Entonces
				Escribir "Es negativo y par"
			SiNo
				Escribir "Es negativo y impar"
			FinSi
		FinSi
    FinSi
FinAlgoritmo
