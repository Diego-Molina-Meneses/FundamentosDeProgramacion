Algoritmo Analizador_Firewall
	Definir codigo Como Entero
	Definir nivel_riesgo Como Entero
	
	Escribir "Codigo de accion (1=Permitir, 2=Bloquear, 3=Cuarentena): "
	Leer codigo
	
	Escribir "Nivel de riesgo (1-10): "
	Leer nivel_riesgo
	
	Segun codigo Hacer
		1:
			Si nivel_riesgo > 7 Entonces
				Escribir "Advertencia: Trafico riesgoso permitido"
			SiNo
				Escribir "Trafico seguro"
			FinSi
		2:
			Escribir "Paquete descartado"
		3:
			Escribir "Paquete aislado para analisis"
		De Otro Modo:
			Escribir "Codigo invalido"
	FinSegun
FinAlgoritmo
