Algoritmo QoS
	Definir tipo Como Caracter
	Definir tamMB Como Real
	
	Escribir "Tipo de trafico (V=Voz, D=Datos, G=Gaming): "
	Leer tipo
	
	Segun tipo Hacer
		"D", "d":
			Escribir "Tamaño del trafico en MB: "
			Leer tamMB
			Si tamMB > 1000 Entonces
				Escribir "Prioridad: Baja"
			SiNo
				Escribir "Prioridad: Media"
			FinSi
		"V", "v":
			Escribir "Prioridad: Critica"
		"G", "g":
			Escribir "Prioridad: Alta"
		De Otro Modo:
			Escribir "Tipo de trafico no valido"
	FinSegun
FinAlgoritmo
