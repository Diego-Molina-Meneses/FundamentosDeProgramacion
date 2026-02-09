Algoritmo SubredesHosts
	Definir N, total, hosts Como Entero
	Escribir "Bits de host (N):"
	Leer N
	
	total <- 2 ^ N
	
	Si total >= 2 Entonces
			hosts <- total - 2
		SiNo
			hosts <- 0
	FinSi
	
	Escribir "Hosts disponibles: ", hosts
FinAlgoritmo


