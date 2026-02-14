Algoritmo AnioDeOro
		Definir anio Como Entero
		
		Escribir "Ingresa el año:"
		Leer anio
		
		Si (anio >= 2000) Y (anio <= 3000) Entonces
			
			Si (anio MOD 10 = 1) Entonces
				
				Si (anio MOD 4 = 2) Entonces
					
					// Verificar que NO sea bisiesto
					Si NO ((anio MOD 400 = 0) O ((anio MOD 4 = 0) Y (anio MOD 100 <> 0))) Entonces
						
						// Verificación simple de primo 
						Si (anio > 1) Y (anio MOD 2 <> 0) Y (anio MOD 3 <> 0) Y (anio MOD 5 <> 0) Y (anio MOD 7 <> 0) Entonces
							
							Escribir "Año de Oro"
							
						SiNo
							Escribir "Año Ordinario"
						FinSi
						
					SiNo
						Escribir "Año Ordinario"
					FinSi
					
				SiNo
					Escribir "Año Ordinario"
				FinSi
				
			SiNo
				Escribir "Año Ordinario"
			FinSi
			
		SiNo
			Escribir "Año Ordinario"
		FinSi
		
FinAlgoritmo


