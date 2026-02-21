Algoritmo Filtro_ICMP
	Definir tam Como Entero
	Definir protocolo Como Entero
	
	Escribir "Tamaño del paquete (bytes): "
	Leer tam
	Escribir "Protocolo (1=ICMP, 2=TCP): "
	Leer protocolo
	
	Si protocolo = 1 Entonces
		Si tam > 65535 Entonces
			Escribir "Ataque Ping de la Muerte detectado"
		SiNo
			Escribir "Paquete ICMP normal"
		FinSi
	SiNo
		Si protocolo = 2 Entonces
			Escribir "Ignorar, no es ICMP"
		SiNo
			Escribir "Protocolo no valido"
		FinSi
	FinSi
FinAlgoritmo
