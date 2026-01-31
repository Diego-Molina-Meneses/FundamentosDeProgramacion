Algoritmo a2241330016_Ejercicio2
	Definir X, A, N Como Real
	Definir VolConcreto, VolSeco Como Real
	Definir totalPartes Como Real
	Definir VolCemento, VolArena, VolGrava Como Real
	Definir densCemento, kgCemento, bolsas Como Real
	Definir aguaLitros Como Real
	Definir bolsasEntero Como Entero
	
	Escribir "=== EJERCICIO 2: MATERIAL PARA LOSA ==="
	Escribir "Longitud X (m): "
	Leer X
	Escribir "Ancho Y (m): "
	Leer A
	Escribir "Espesor N (m): "
	Leer N
	
	VolConcreto <- X * A * N
	
	VolSeco <- VolConcreto * 1.54
	
	
	totalPartes <- 1 + 2 + 3
	
	VolCemento <- VolSeco * (1 / totalPartes)
	VolArena  <- VolSeco * (2 / totalPartes)
	VolGrava  <- VolSeco * (3 / totalPartes)
	
	
	densCemento <- 1440  
	kgCemento <- VolCemento * densCemento
	bolsas <- kgCemento / 50
	
	Si bolsas = Trunc(bolsas) Entonces
		bolsasEntero <- Trunc(bolsas)
	SiNo
		bolsasEntero <- Trunc(bolsas) + 1
	FinSi
	
	aguaLitros <- kgCemento * 0.5
	
	Escribir "-----------------------------------"
	Escribir "Volumen de concreto: ", VolConcreto, " m3"
	Escribir "Volumen seco (x1.54): ", VolSeco, " m3"
	Escribir ""
	Escribir "Cemento (vol): ", VolCemento, " m3"
	Escribir "Arena  (vol): ", VolArena, " m3"
	Escribir "Grava  (vol): ", VolGrava, " m3"
	Escribir ""
	Escribir "Cemento (kg aprox): ", kgCemento, " kg"
	Escribir "Bolsas de 50kg (redondeado arriba): ", bolsasEntero
	Escribir "Agua aprox (litros): ", aguaLitros
FinAlgoritmo

