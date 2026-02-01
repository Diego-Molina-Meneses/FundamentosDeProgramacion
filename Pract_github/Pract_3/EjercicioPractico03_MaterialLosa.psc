Algoritmo EjercicioPráctico03_MaterialLosa
	// VARIABLES
	Definir X, A, N Como Real
	Definir V, Vseco Como Real
	Definir Vc, Va, Vg Como Real
	Definir kgCem, bolsasReal, aguaL Como Real
	Definir bolsas Como Entero
	
	// CONSTANTES
	Definir factorSeco, densCem, pesoBolsa Como Real
	factorSeco <- 1.54
	densCem <- 1440
	pesoBolsa <- 50
	
	// ENTRADA
	Escribir "=== EJERCICIO: MATERIAL PARA LOSA ==="
	Escribir "Longitud X (m): "
	Leer X
	Escribir "Ancho Y (m): "
	Leer A
	Escribir "Espesor N (m): "
	Leer N
	
	// PROCESO
	V <- X * A * N
	Vseco <- V * factorSeco
	
	// Mezcla 1:2:3 (total = 6)
	Vc <- Vseco * (1/6)
	Va <- Vseco * (2/6)
	Vg <- Vseco * (3/6)
	
	kgCem <- Vc * densCem
	bolsasReal <- kgCem / pesoBolsa
	
	// Redondeo hacia arriba para bolsas
	Si bolsasReal = Trunc(bolsasReal) Entonces
		bolsas <- Trunc(bolsasReal)
	SiNo
		bolsas <- Trunc(bolsasReal) + 1
	FinSi
	
	aguaL <- kgCem * 0.5
	
	// SALIDA
	Escribir "-----------------------------------"
	Escribir "Volumen de concreto: ", V, " m3"
	Escribir "Volumen seco (x1.54): ", Vseco, " m3"
	Escribir "Arena (m3): ", Va
	Escribir "Grava (m3): ", Vg
	Escribir "Cemento (kg aprox): ", kgCem
	Escribir "Bolsas de 50kg (aprox): ", bolsas
	Escribir "Agua (litros aprox): ", aguaL
	
FinAlgoritmo

