Funcion opc <- MostrarMenu
    Definir opc Como Caracter
    Escribir "Menu:"
    Escribir "1.- Calcular area del circulo"
    Escribir "2.- Calcular area del triangulo"
    Escribir "S.- Salir"
    Escribir "Elige una opcion: "
    Leer opc
FinFuncion

Funcion num <- PedirDato(mensaje)
    Definir num Como Real
    Escribir mensaje
    Leer num
FinFuncion

Funcion area <- CalcularAreaCirculo(radio)
    Definir area Como Real
    area <- PI * radio ^ 2
FinFuncion

Funcion area <- CalcularAreaTriangulo(base, altura)
    Definir area Como Real
    area <- (base * altura) / 2
FinFuncion

Algoritmo CalculoAreasPSeInt
    Definir opcio Como Caracter
    Definir radio, base, altura Como Real
	
    Repetir
        opcio <- MostrarMenu
		
        Segun opcio Hacer
            "1":
                radio <- PedirDato("Ingresa el radio del circulo: ")
                Escribir "El area del circulo es: ", CalcularAreaCirculo(radio)
				
            "2":
                base <- PedirDato("Ingresa la base del triangulo: ")
                altura <- PedirDato("Ingresa la altura del triangulo: ")
                Escribir "El area del triangulo es: ", CalcularAreaTriangulo(base, altura)
				
            "S", "s":
                Escribir "Saliendo del programa..."
				
            De Otro Modo:
                Escribir "Opcion invalida."
        FinSegun
    Hasta Que opcio = "S" O opcio = "s"
FinAlgoritmo