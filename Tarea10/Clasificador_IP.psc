Algoritmo Clasificador_IP
	Definir octeto1 Como Entero
	
	Escribir "Primer octeto (0 a 255): "
	Leer octeto1
	
	Si octeto1 >= 1 Y octeto1 <= 126 Entonces
		Escribir "Clase A"
	SiNo
		Si octeto1 >= 128 Y octeto1 <= 191 Entonces
			Escribir "Clase B"
		SiNo
			Si octeto1 >= 192 Y octeto1 <= 223 Entonces
				Escribir "Clase C"
			SiNo
				Si octeto1 = 127 Entonces
					Escribir "Direccion de Loopback"
				SiNo
					Escribir "Clase especial o reservada"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
