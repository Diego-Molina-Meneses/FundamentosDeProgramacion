Algoritmo Detector_Extensiones
	Definir codigo Como Entero
	Definir es_admin Como Logico
	
	Escribir "Codigo de extension (1=.exe, 2=.docx, 3=.sh): "
	Leer codigo
	
	Segun codigo Hacer
		1, 3:
			Escribir "¿Tiene permisos de admin? (1=Si, 0=No): "
			Leer es_admin
			Escribir "Archivo potencialmente ejecutable. ¿Tiene permisos de admin?"
			Si es_admin = Verdadero Entonces
				Escribir "ALERTA: Ejecutable con permisos de admin"
			SiNo
				Escribir "Ejecutable detectado sin permisos de admin"
			FinSi
		2:
			Escribir "Documento de texto seguro"
		De Otro Modo:
			Escribir "Extension no reconocida"
	FinSegun
FinAlgoritmo
