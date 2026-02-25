Algoritmo  Ejercicio02
    Definir num Como Entero
    Definir caden Como Cadena
    
    caden <- "Menu de Opciones " 
    caden <- caden + "1.- Opcion 1 " 
    caden <- caden + "  2.- Opcion 2 " 
    caden <- caden + "  3.- Opcion 3 "
    caden <- caden + "  4.- Opcion 4 "
    caden <- caden + " Elija una opcion [1..4] --> "
    
    Escribir Sin Saltar caden
    Leer num
    
    Segun num Hacer
        1:
            caden <- "Elegiste la opcion 1"
        2:
            caden <- "Elegiste la opcion 2"
        3:
            caden <- "Elegiste la opcion 3"
        4:
            caden <- "Elegiste la opcion 4"
        De Otro Modo:
            caden <- "Elegiste una opcion que no existe"
    FinSegun
    
    Escribir ""
    Escribir caden
FinProceso
