Algoritmo Ejercicio10_Reingenieria
	Definir fahrenheit, celsius, celsiusf Como Real
	Definir salida Como Cadena
	
	// Entrada (en el ejercicio original era 40)
	Escribir "Introduce temperatura en Fahrenheit:"
	Leer fahrenheit
	
	// Proceso
	celsius <- (5.0/9) * fahrenheit - 32
	celsiusf <- (5.0/9) * (fahrenheit - 32)
	
	// Salida (concatenacion)
	salida <- "5.0 / 9 * fahrenheit - 32 = " + ConvertirATexto(celsius)
	salida <- salida + " / (5.0 / 9) * (fahrenheit - 32) = " + ConvertirATexto(celsiusf)
	
	Escribir salida
FinAlgoritmo