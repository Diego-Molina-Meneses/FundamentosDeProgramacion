Algoritmo  ejercicio04
    Definir opcio Como Entero
    Definir operando1, operando2, resultado Como Real
    Definir menu, caden Como Cadena
    
    caden <- ""
    
    Escribir "Introduce el valor del operando 1: "
    Leer operando1
    Escribir "Introduce el valor del operando 2: "
    Leer operando2
    
    menu <- "Menu de Opciones de operaciones basicas " 
    menu <- menu + " 1.- Suma " 
    menu <- menu + " 2.- Multiplicacion " 
    menu <- menu + " 3.- Division " 
    menu <- menu + " Elija una opcion [1..2..3] "
    
    Escribir menu
    Leer opcio
    
    Segun opcio Hacer
        1:
            resultado <- operando1 + operando2
            caden <- "El resultado de la suma es: " + ConvertirATexto(resultado)
        2:
            resultado <- operando1 * operando2
            caden <- "El resultado de la multiplicacion es: " + ConvertirATexto(resultado)
        3:
            resultado <- operando1 / operando2
            caden <- "El resultado de la division es: " + ConvertirATexto(resultado)
        De Otro Modo:
            caden <- "Opcion no reconocida"
    FinSegun
    
    Escribir caden
FinProceso
