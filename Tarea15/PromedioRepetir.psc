Algoritmo PromedioRepetir
    Definir suma, calif, resultado Como Real
    Definir ciclo Como Entero
    
    suma <- 0
    ciclo <- 0
    
    Repetir
        ciclo <- ciclo + 1
        Escribir "Ingresa la calificacion ", ciclo, ": "
        Leer calif
        suma <- suma + calif
    Hasta Que ciclo = 3
    
    resultado <- suma / 3
    
    Si resultado >= 7 Entonces
        Escribir "ALUMNO ACREDITADO"
    SiNo
        Escribir "ALUMNO NO ACREDITADO"
    FinSi
FinAlgoritmo