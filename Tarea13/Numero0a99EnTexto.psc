Algoritmo Numero0a99EnTexto
	
	Definir num, unidades, decenas Como Entero
	
	Escribir "Introduzca un numero (0 a 99): "
	Leer num
	
	unidades <- num MOD 10
	decenas <- Trunc(num / 10)
	
	Segun decenas Hacer
		0:
			// nada
		1:
			Escribir Sin Saltar "diez "
		2:
			Escribir Sin Saltar "veinte "
		3:
			Escribir Sin Saltar "treinta "
		4:
			Escribir Sin Saltar "cuarenta "
		5:
			Escribir Sin Saltar "cincuenta "
		6:
			Escribir Sin Saltar "sesenta "
		7:
			Escribir Sin Saltar "setenta "
		8:
			Escribir Sin Saltar "ochenta "
		9:
			Escribir Sin Saltar "noventa "
	FinSegun
	
	Si decenas > 1 Y unidades > 0 Entonces
		Escribir Sin Saltar "y "
	FinSi
	
	Segun unidades Hacer
		0: Escribir ""
		1: Escribir "uno"
		2: Escribir "dos"
		3: Escribir "tres"
		4: Escribir "cuatro"
		5: Escribir "cinco"
		6: Escribir "seis"
		7: Escribir "siete"
		8: Escribir "ocho"
		9: Escribir "nueve"
	FinSegun
	
FinAlgoritmo
