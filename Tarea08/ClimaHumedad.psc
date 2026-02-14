Algoritmo ClimaHumedad
	Definir temp, hum Como Real
	
	Escribir "Ingresa temperatura:"
	Leer temp
	Escribir "Ingresa humedad:"
	Leer hum
	
	Si (temp > 30) Y (hum > 80) Entonces
		Escribir "Sofocante"
	SiNo
		Si (temp < 15) Y (hum > 80) Entonces
			Escribir "Frio Humedo"
		SiNo
			Escribir "Normal"
		FinSi
	FinSi
FinAlgoritmo

