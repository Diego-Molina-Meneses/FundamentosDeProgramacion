Algoritmo NumeroEnTexto0a99
	
	Definir num, decenas, unidades Como Entero
	
	Escribir "Introduzca un numero (0 a 99): "
	Leer num
	
	Si num < 0 O num > 99 Entonces
		Escribir "Numero fuera de rango"
	SiNo
		
		// Casos directos
		Segun num Hacer
			0: Escribir "cero"
			1: Escribir "uno"
			2: Escribir "dos"
			3: Escribir "tres"
			4: Escribir "cuatro"
			5: Escribir "cinco"
			6: Escribir "seis"
			7: Escribir "siete"
			8: Escribir "ocho"
			9: Escribir "nueve"
			10: Escribir "diez"
			11: Escribir "once"
			12: Escribir "doce"
			13: Escribir "trece"
			14: Escribir "catorce"
			15: Escribir "quince"
			20: Escribir "veinte"
				
				De Otro Modo
				
				Si num >= 16 Y num <= 19 Entonces
					unidades <- num - 10
					Escribir Sin Saltar "dieci"
					
					Segun unidades Hacer
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
					
				SiNo
					
					Si num >= 21 Y num <= 29 Entonces
						unidades <- num - 20
						Escribir Sin Saltar "veinti"
						
						Segun unidades Hacer
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
						
					SiNo
						
						decenas <- Trunc(num / 10)
						unidades <- num MOD 10
						
						Segun decenas Hacer
							3: Escribir Sin Saltar "treinta"
							4: Escribir Sin Saltar "cuarenta"
							5: Escribir Sin Saltar "cincuenta"
							6: Escribir Sin Saltar "sesenta"
							7: Escribir Sin Saltar "setenta"
							8: Escribir Sin Saltar "ochenta"
							9: Escribir Sin Saltar "noventa"
						FinSegun
						
						Si unidades <> 0 Entonces
							Escribir Sin Saltar " y "
							
							Segun unidades Hacer
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
						SiNo
							Escribir ""
						FinSi
						
					FinSi
					
				FinSi
		FinSegun
		
	FinSi
	
FinAlgoritmo
