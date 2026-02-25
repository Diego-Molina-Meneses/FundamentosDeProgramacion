Algoritmo IncrementarHora
	
	Definir h, m, s Como Entero
	
	Escribir "Introduzca hora: "
	Leer h
	Escribir "Introduzca minutos: "
	Leer m
	Escribir "Introduzca segundos: "
	Leer s
	
	// incrementamos los segundos
	s <- s + 1
	
	// si los segundos superan 59
	Si s >= 60 Entonces
		s <- 0
		m <- m + 1
		
		// si los minutos superan 59
		Si m >= 60 Entonces
			m <- 0
			h <- h + 1
			
			// si la hora supera 23
			Si h >= 24 Entonces
				h <- 0
			FinSi
		FinSi
	FinSi
	
	Escribir "Hora: ", h, ":", m, ":", s
	
FinAlgoritmo
