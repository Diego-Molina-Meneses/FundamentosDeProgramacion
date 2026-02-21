Algoritmo Selector_Protocolo
	Definir puerto Como Entero
	
	Escribir "Ingrese numero de puerto: "
	Leer puerto
	
	Segun puerto Hacer
		21:
			Escribir "FTP - Transferencia de archivos"
		22:
			Escribir "SSH - Acceso remoto seguro"
		25:
			Escribir "SMTP - Envio de correo"
		80, 443:
			Escribir "Web (HTTP/HTTPS)"
		De Otro Modo:
			Escribir "Puerto no estandar o desconocido"
	FinSegun
FinAlgoritmo
