Algoritmo  ejercicio01
    Definir num, unidades, decenas Como Entero
    Definir cadena Como Cadena
    
    Escribir "Introduzca un numero (0 a 99): "
    Leer num
    
    unidades <- num MOD 10
    decenas <- trunc(num / 10)
    
    Segun decenas Hacer
        0: cadena <- ""
        1: cadena <- "diez"
        2: cadena <- "veinte"
        3: cadena <- "treinta"
        4: cadena <- "cuarenta"
        5: cadena <- "cincuenta"
        6: cadena <- "sesenta"
        7: cadena <- "setenta"
        8: cadena <- "ochenta"
        9: cadena <- "noventa"
    FinSegun
    
    Segun unidades Hacer
        0:
            cadena <- cadena + ""
        1:
            Si decenas = 1 Entonces
                cadena <- "once"
            Sino
                Si decenas > 1 Entonces
                    cadena <- cadena + " y uno"
                Sino
                    cadena <- cadena + "uno"
                FinSi
            FinSi
        2:
            Si decenas = 1 Entonces
                cadena <- "doce"
            Sino
                Si decenas > 1 Entonces
                    cadena <- cadena + " y dos"
                Sino
                    cadena <- cadena + "dos"
                FinSi
            FinSi
        3:
            Si decenas = 1 Entonces
                cadena <- "trece"
            Sino
                Si decenas > 1 Entonces
                    cadena <- cadena + " y tres"
                Sino
                    cadena <- cadena + "tres"
                FinSi
            FinSi
        4:
            Si decenas = 1 Entonces
                cadena <- "catorce"
            Sino
                Si decenas > 1 Entonces
                    cadena <- cadena + " y cuatro"
                Sino
                    cadena <- cadena + "cuatro"
                FinSi
            FinSi
        5:
            Si decenas = 1 Entonces
                cadena <- "quince"
            Sino
                Si decenas > 1 Entonces
                    cadena <- cadena + " y cinco"
                Sino
                    cadena <- cadena + "cinco"
                FinSi
            FinSi
        6:
            Si decenas > 1 Entonces
                cadena <- cadena + " y seis"
            Sino
                cadena <- cadena + "seis"
            FinSi
        7:
            Si decenas > 1 Entonces
                cadena <- cadena + " y siete"
            Sino
                cadena <- cadena + "siete"
            FinSi
        8:
            Si decenas > 1 Entonces
                cadena <- cadena + " y ocho"
            Sino
                cadena <- cadena + "ocho"
            FinSi
        9:
            Si decenas > 1 Entonces
                cadena <- cadena + " y nueve"
            Sino
                cadena <- cadena + "nueve"
            FinSi
    FinSegun
    
    Escribir cadena
FinProceso
