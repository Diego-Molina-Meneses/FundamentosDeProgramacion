Proceso Ejercicio_4
	Definir trabajadores, sueldo, sueldoNuevo, nomina Como Real
	
	Escribir "¿Cuántos trabajadores tiene el grupo?"
	Leer trabajadores
	
	Mientras trabajadores > 0 Hacer
		Escribir "¿Cuál es el sueldo actual?"
		Leer sueldo
		
		Si sueldo < 1000 Entonces
			sueldoNuevo <- sueldo * 1.15
		SiNo
			Si sueldo >= 1000 Entonces
				sueldoNuevo <- sueldo * 1.12
			FinSi
		FinSi
		
		Escribir "El nuevo sueldo del grupo de trabajadores es:"
		Escribir sueldoNuevo
		
		nomina <- sueldoNuevo * trabajadores
		
		Escribir "El total de nómina es:"
		Escribir nomina
		
		Escribir "¿Cuántos trabajadores tiene el nuevo grupo?"
		Leer trabajadores
		
	FinMientras	
FinProceso
