Algoritmo Validacion_Red
	Definir octeto2, octeto3 Como Entero
	
	Escribir "Segundo octeto: "
	Leer octeto2
	Escribir "Tercer octeto: "
	Leer octeto3
	
	Si octeto2 = 0 Entonces
		Si octeto3 = 5 Entonces
			Escribir "Acceso concedido a Contabilidad"
		SiNo
			Escribir "Acceso denegado: Subred incorrecta"
		FinSi
	SiNo
		Escribir "Acceso denegado: Red externa"
	FinSi
FinAlgoritmo
