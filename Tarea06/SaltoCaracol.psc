Algoritmo SaltoCaracol
    Definir H, S, R, dias Como Entero
    Escribir "Altura (H):"
    Leer H
    Escribir "Sube por dia (S):"
    Leer S
    Escribir "Resbala por noche (R):"
    Leer R
	
    Si S >= H Entonces
        dias <- 1
    SiNo
        dias <- (H - R - 1) / (S - R) + 1
    FinSi
	
    Escribir "Dias: ", dias
FinAlgoritmo

