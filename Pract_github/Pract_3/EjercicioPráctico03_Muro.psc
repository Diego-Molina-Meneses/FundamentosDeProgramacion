Algoritmo EjercicioPráctico03_MuroConCastillos
	// VARIABLES
	Definir X, A, P Como Real
	Definir N Como Entero
	Definir L_lad, H_lad, Jv, Jh Como Real
	Definir AreaMuro, AreaCast, AreaRell Como Real
	Definir AreaModulo, NLreal Como Real
	Definir NL Como Entero
	
	// ENTRADA
	Escribir "=== EJERCICIO: MURO CON CASTILLOS ==="
	Escribir "Longitud del muro X (m): "
	Leer X
	Escribir "Altura del muro Y (m): "
	Leer A
	
	Escribir "Numero de castillos N: "
	Leer N
	Escribir "Longitud de cada castillo P (m): "
	Leer P
	
	Escribir "Longitud del ladrillo (m): "
	Leer L_lad
	Escribir "Altura del ladrillo (m): "
	Leer H_lad
	
	Escribir "Junta vertical Jv (m): "
	Leer Jv
	Escribir "Junta horizontal Jh (m): "
	Leer Jh
	
	// PROCESO
	AreaMuro <- X * A
	AreaCast <- N * P * A
	AreaRell <- AreaMuro - AreaCast
	
	Si AreaRell <= 0 Entonces
		Escribir "ERROR: El area de castillos es mayor o igual al area del muro."
		Escribir "Revisa los datos (X, Y, N, P)."
	SiNo
		AreaModulo <- (L_lad + Jv) * (H_lad + Jh)
		
		Si AreaModulo <= 0 Entonces
			Escribir "ERROR: El area del ladrillo con juntas no puede ser 0 o negativa."
		SiNo
			NLreal <- AreaRell / AreaModulo
			
			// Redondeo hacia arriba (TECHO)
			Si NLreal = Trunc(NLreal) Entonces
				NL <- Trunc(NLreal)
			SiNo
				NL <- Trunc(NLreal) + 1
			FinSi
			
			// SALIDA
			Escribir "-----------------------------------"
			Escribir "Area del muro: ", AreaMuro, " m2"
			Escribir "Area castillos: ", AreaCast, " m2"
			Escribir "Area a rellenar: ", AreaRell, " m2"
			Escribir "Area por ladrillo (con juntas): ", AreaModulo, " m2"
			Escribir "Numero de ladrillos (aprox): ", NL
		FinSi
	FinSi
	
FinAlgoritmo

