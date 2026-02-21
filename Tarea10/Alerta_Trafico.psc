Algoritmo Alerta_Trafico
	Definir hora Como Entero
	Definir volumen Como Real
	
	Escribir "Ingrese la hora (0-23): "
	Leer hora
	
	Escribir "Ingrese el volumen de datos (GB): "
	Leer volumen
	
	Si hora >= 2 Y hora <= 5 Entonces
		Si volumen > 50 Entonces
			Escribir "Alerta: Posible exfiltracion de datos"
		SiNo
			Escribir "Trafico nocturno normal"
		FinSi
	SiNo
		Si volumen > 500 Entonces
			Escribir "Alerta: Congestion de red"
		SiNo
			Escribir "Trafico bajo control"
		FinSi
	FinSi
FinAlgoritmo
