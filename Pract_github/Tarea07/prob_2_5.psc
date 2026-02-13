Algoritmo prob_2_5
	
	Definir operando1, operando2, resultado Como Real
	Definir opcion Como Entero
	
	Escribir "Introduce el valor del operando 1"
	Leer operando1
	
	Escribir "Introduce el valor del operando 2"
	Leer operando2
	
	Escribir "Menu de opciones de Operaciones Basicas"
	Escribir "1.- Suma"
	Escribir "2.- Multiplicacion"
	Escribir "3.- Division"
	Escribir "Elige una opcion [1..3]"
	Leer opcion
	
	Si opcion = 1 Entonces
		resultado <- operando1 + operando2
		Escribir "El resultado de la suma es ", resultado
	SiNo
		Si opcion = 2 Entonces
			resultado <- operando1 * operando2
			Escribir "El resultado de la multiplicacion es ", resultado
		SiNo
			Si opcion = 3 Entonces
				resultado <- operando1 / operando2
				Escribir "El resultado de la division es ", resultado
			SiNo
				Escribir "Opcion no valida"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo

