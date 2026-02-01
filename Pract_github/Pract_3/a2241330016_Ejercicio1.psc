Algoritmo a2241330016_Ejercicio1
	
	Definir Labrado, Abarado, NL Como Real
	Definir Ladrillo1, Ladrillo2, Ajuntav, Ajuntah Como Real
	
	Escribir "Introduce el largo del muro:"
	Leer Labrado
	
	Escribir "Introduce el alto del muro:"
	Leer Abarado
	
	Escribir "Introduce el alto del ladrillo:"
	Leer Ladrillo1
	
	Escribir "Introduce el largo del ladrillo:"
	Leer Ladrillo2
	
	Escribir "Introduce el ancho de la junta vertical:"
	Leer Ajuntav
	
	Escribir "Introduce el alto de la junta horizontal:"
	Leer Ajuntah
	
	NL <- (Labrado * Abarado) / ((Ladrillo1 + Ajuntav) * (Ladrillo2 + Ajuntah))
	
	Escribir "El numero de ladrillos obtenido es: ", NL
	
FinAlgoritmo

