Algoritmo Refrescos
    Definir R, packs, sobrante Como Entero
    Escribir "Cantidad R:"
    Leer R
	
    packs <- trunc(R / 6)
    sobrante <- R - (packs * 6)
	
    Si sobrante > 0 Entonces
        Escribir "Sobran: ", sobrante
    SiNo
        Escribir "No sobran refrescos."
    FinSi
FinAlgoritmo

