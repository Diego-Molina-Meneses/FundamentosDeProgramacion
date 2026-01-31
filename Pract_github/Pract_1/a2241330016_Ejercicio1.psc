Algoritmo a2241330016_Ejercicio1
		Definir X, A, P Como Real
		Definir N Como Entero
		Definir Lpieza, Hpieza, JuntaV, JuntaH Como Real
		Definir AreaMuro, AreaCastillos, AreaRelleno Como Real
		Definir AreaModulo, piezasNecesarias Como Real
		Definir piezasEntero Como Entero
		
		Escribir "=== EJERCICIO 1: MURO CON CASTILLOS ==="
		Escribir "Longitud del muro X (m): "
		Leer X
		Escribir "Altura del muro Y (m): "
		Leer A
		
		Escribir "Numero de castillos N: "
		Leer N
		Escribir "Ancho/longitud de cada castillo P (m): "
		Leer P
		
		Escribir "---- Datos del ladrillo/bloque ----"
		Escribir "Longitud de la pieza (m): "
		Leer Lpieza
		Escribir "Altura de la pieza (m): "
		Leer Hpieza
		Escribir "Junta VERTICAL (m): "
		Leer JuntaV
		Escribir "Junta HORIZONTAL (m): "
		Leer JuntaH
		
		AreaMuro = X * A
		AreaCastillos = N * P * A
		AreaRelleno = AreaMuro - AreaCastillos
		
		Si AreaRelleno <= 0 Entonces
			Escribir "ERROR: El area de castillos es mayor o igual al area del muro."
			Escribir "Revisa N, P, X y Y."
		SiNo
			AreaModulo <- (Lpieza + JuntaV) * (Hpieza + JuntaH)
			
			Si AreaModulo <= 0 Entonces
				Escribir "ERROR: El area del modulo de pieza no puede ser 0 o negativa."
			SiNo
				piezasNecesarias <- AreaRelleno / AreaModulo
				
				Si piezasNecesarias = Trunc(piezasNecesarias) Entonces
					piezasEntero <- Trunc(piezasNecesarias)
				SiNo
					piezasEntero <- Trunc(piezasNecesarias) + 1
				FinSi
				
				Escribir "-----------------------------------"
				Escribir "Area total del muro: ", AreaMuro, " m2"
				Escribir "Area total de castillos: ", AreaCastillos, " m2"
				Escribir "Area a rellenar con pieza: ", AreaRelleno, " m2"
				Escribir "Area por pieza (con juntas): ", AreaModulo, " m2"
				Escribir "Piezas necesarias (redondeado hacia arriba): ", piezasEntero
			FinSi
		FinSi
FinAlgoritmo
