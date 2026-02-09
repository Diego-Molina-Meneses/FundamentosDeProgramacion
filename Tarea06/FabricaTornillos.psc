Algoritmo FabricaTornillos
    Definir X, cajas, sueltos Como Entero
    Escribir "Tornillos totales (X):"
    Leer X
	
    cajas <- trunc(X / 12)
    sueltos <- X - (cajas * 12)
	
    Escribir "Cajas completas: ", cajas
	
    Si sueltos > 0 Entonces
        Escribir "Tornillos sueltos: ", sueltos
    SiNo
        Escribir "Tornillos sueltos: 0"
    FinSi
FinAlgoritmo

