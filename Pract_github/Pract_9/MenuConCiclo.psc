Algoritmo MenuConCiclo
	
    Definir opcio Como Caracter
	
    Repetir
		
        Escribir "Menu"
        Escribir "a.- Opción 1"
        Escribir "b.- Opción 2"
        Escribir "c.- Opción 3"
        Escribir "x.- Salir"
        Escribir "Elige una opción:"
        Leer opcio
		
        Segun opcio Hacer
			
            "a", "A":
                Escribir "Has elegido la Opción 1"
				
            "b", "B":
                Escribir "Has elegido la Opción 2"
				
            "c", "C":
                Escribir "Has elegido la Opción 3"
				
            "x", "X":
                Escribir "Adios, saliendo del menú."
				
            De Otro Modo:
                Escribir "Opción inválida"
				
        FinSegun
		
    Hasta Que opcio = "x" O opcio = "X"
	
FinAlgoritmo
