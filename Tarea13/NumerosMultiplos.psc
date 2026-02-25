Algoritmo NumerosMultiplos
	
	Definir n1, n2 Como Entero
	
	Escribir "Introduce un numero: "
	Leer n1
	
	Escribir "Introduce otro numero: "
	Leer n2
	
	Si n2 <> 0 Entonces
		Si n1 MOD n2 = 0 Entonces
			Escribir "Son multiplos"
		SiNo
			Escribir "No son multiplos"
		FinSi
	SiNo
		Escribir "No se puede dividir entre cero"
	FinSi
	
FinAlgoritmo
