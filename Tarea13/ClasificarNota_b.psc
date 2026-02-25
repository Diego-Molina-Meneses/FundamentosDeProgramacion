Algoritmo ClasificarNota
	
	Definir nota Como Entero
	
	Escribir "Introduzca una nota: "
	Leer nota
	
	Segun nota Hacer
		
		0,1,2,3,4:
			Escribir "INSUFICIENTE"
			
		5:
			Escribir "SUFICIENTE"
			
		6:
			Escribir "BIEN"
			
		7,8:
			Escribir "NOTABLE"
			
		9,10:
			Escribir "SOBRESALIENTE"
			
		De Otro Modo:
			Escribir "Nota fuera de rango"
			
	FinSegun
	
FinAlgoritmo