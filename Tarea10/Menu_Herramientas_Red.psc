Algoritmo Menu_Herramientas_Red
	Definir opcion Como Entero
	Definir rango Como Entero
	Definir nivel Como Entero
	
	Escribir "=== MENU HERRAMIENTAS DE RED ==="
	Escribir "1. Escanear Red"
	Escribir "2. Verificar Firewall"
	Escribir "3. Cifrar Mensaje"
	Escribir "4. Salir"
	Escribir "Elige una opcion (1-4): "
	Leer opcion
	
	Segun opcion Hacer
		1:
			Escribir "Ingrese un rango (ej. > 0): "
			Leer rango
			Si rango > 0 Entonces
				Escribir "Escaneando red en rango: ", rango
			SiNo
				Escribir "Rango invalido"
			FinSi
		2:
			Escribir "Estado: Activo"
		3:
			Escribir "Nivel (1 o 2): "
			Leer nivel
			Si nivel = 2 Entonces
				Escribir "Cifrado AES"
			SiNo
				Si nivel = 1 Entonces
					Escribir "Cifrado Cesar"
				SiNo
					Escribir "Nivel invalido"
				FinSi
			FinSi
		4:
			Escribir "Cerrando sesion"
		De Otro Modo:
			Escribir "Opcion invalida"
	FinSegun
FinAlgoritmo
