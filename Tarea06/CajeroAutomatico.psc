Algoritmo CajeroAutomatico
    Definir Cantidad, entrega, perdida Como Entero
    Escribir "Cantidad a retirar:"
    Leer Cantidad
	
    entrega <- (Cantidad / 100) * 100
    perdida <- Cantidad - entrega
	
    Escribir "Entrega del cajero: ", entrega
	
    Si perdida > 0 Entonces
        Escribir "Perdida del usuario: ", perdida
    SiNo
        Escribir "Perdida del usuario: 0"
    FinSi
FinAlgoritmo

