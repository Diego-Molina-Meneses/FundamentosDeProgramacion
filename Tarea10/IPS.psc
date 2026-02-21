Algoritmo IPS
	Definir intentos_fallidos Como Entero
	Definir es_ip_conocida Como Logico
	Escribir "Intentos fallidos: "
	Leer intentos_fallidos
	Escribir "¿Es IP conocida? (1=Si, 0=No): "
	Leer es_ip_conocida
	Si es_ip_conocida = Falso Entonces
		Si intentos_fallidos > 3 Entonces
			Escribir "Bloquear IP permanentemente"
		SiNo
			Si intentos_fallidos >= 1 Y intentos_fallidos <= 3 Entonces
				Escribir "Solicitar Captcha"
			SiNo
				Escribir "Permitir reintento"
			FinSi
		FinSi
	SiNo
		Si intentos_fallidos > 10 Entonces
			Escribir "Bloquear temporalmente por 15 min"
		SiNo
			Si intentos_fallidos > 5 Entonces
				Escribir "Alertar al admin"
			SiNo
				Escribir "Permitir reintento"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
