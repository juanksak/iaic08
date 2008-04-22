;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;						   ;
; SISTEMA DE IFERENCIA DE MODELO DE TEL�FONO M�VIL ;
;						   ;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; PATR�N PARA MODELOS

(deftemplate modeloMovil "modelo movil"
	(slot modelo (type STRING)) 
	(slot marca (type STRING)) 
	(slot compania (type STRING))
	(slot precio (type FLOAT)) 
	(slot peso (type FLOAT))
	(slot alto (type FLOAT))
	(slot ancho (type FLOAT))
	(slot profundo (type FLOAT))
	(slot manosLibres (type ATOM))
	(slot camara (type FLOAT))
	(slot memoria (type FLOAT))
	(slot mp3 (type ATOM))
	(slot bandas (type FLOAT))
	(slot durBateriaEspera (type FLOAT))
	(slot durBateriaConv (type FLOAT))
	(slot calidad (type STRING))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; HECHOS PARA MODELOS

; LG KG800
(assert (modeloMovil 
	(modelo "KG800") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 83)
	(alto 92)
	(ancho 49) 
	(profundo 15) 
	(manosLibres FALSE)
	(camara 1.3)
	(memoria 128)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 200)
	(durBateriaConv 3)
	(calidad "Bueno")	
	)
)

; LG KG290
(assert (modeloMovil 
	(modelo "KG290") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 90)
	(alto 92)
	(ancho 46) 
	(profundo 18) 
	(manosLibres TRUE)
	(camara 1.3)
	(memoria 5)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 200)
	(durBateriaConv 2)
	(calidad "Regular")	
	)
)

; LG KU380
(assert (modeloMovil 
	(modelo "KU380") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 91)
	(alto 96)
	(ancho 45) 
	(profundo 18) 
	(manosLibres TRUE)
	(camara 1.3)
	(memoria 60)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 280)
	(durBateriaConv 3)
	(calidad "Pesimo")	
	)
)

; LG KU450
(assert (modeloMovil 
	(modelo "KU450") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 96)
	(alto 93)
	(ancho 49) 
	(profundo 17) 
	(manosLibres TRUE)
	(camara 1.3)
	(memoria 50)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 200)
	(durBateriaConv 3)
	(calidad "Malo")	
	)
)

; LG KU580
(assert (modeloMovil 
	(modelo "KU580") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 105)
	(alto 94)
	(ancho 52) 
	(profundo 16) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 45)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 300)
	(durBateriaConv 4.6)
	(calidad "Aceptable")	
	)
)

; LG KE850
(assert (modeloMovil 
	(modelo "KE850") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 85)
	(alto 97.8)
	(ancho 54) 
	(profundo 12) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 256)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 230)
	(durBateriaConv 2.4)
	(calidad "Excelente")	
	)
)

; LG KE970
(assert (modeloMovil 
	(modelo "KE970") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 125)
	(alto 100)
	(ancho 50) 
	(profundo 13) 
	(manosLibres FALSE)
	(camara 2)
	(memoria 70)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 250)
	(durBateriaConv 2.5)
	(calidad "Regular")	
	)
)

; LG KP100
(assert (modeloMovil 
	(modelo "KP100") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 85)
	(alto 90)
	(ancho 45) 
	(profundo 13) 
	(manosLibres FALSE)
	(camara 0)
	(memoria 0)
	(mp3 FALSE)
	(bandas 0)
	(durBateriaEspera 450)
	(durBateriaConv 4.5)
	(calidad "Pesimo")	
	)
)

; LG KU990
(assert (modeloMovil 
	(modelo "KP100") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 112)
	(alto 103.5)
	(ancho 54.4) 
	(profundo 14.8) 
	(manosLibres TRUE)
	(camara 5)
	(memoria 130)
	(mp3 TRUE)
	(bandas 4)
	(durBateriaEspera 344)
	(durBateriaConv 3.3)
	(calidad "Excelente")	
	)
)

; LG KU250
(assert (modeloMovil 
	(modelo "KU250") 
	(marca "LG")
	(compania "XXXX")
	(precio XXXX) 
	(peso 73)
	(alto 111)
	(ancho 46) 
	(profundo 15.6) 
	(manosLibres TRUE)
	(camara 1.3)
	(memoria 10)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 375)
	(durBateriaConv 3)
	(calidad "Aceptable")	
	)
)

; MOTOROLA F3
(assert (modeloMovil 
	(modelo "F3") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 70)
	(alto 117)
	(ancho 49) 
	(profundo 9) 
	(manosLibres FALSE)
	(camara 0)
	(memoria 0)
	(mp3 FALSE)
	(bandas 0)
	(durBateriaEspera 300)
	(durBateriaConv 6.6)
	(calidad "Pesimo")	
	)
)

; MOTOROLA K1
(assert (modeloMovil 
	(modelo "K1") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 102)
	(alto 103)
	(ancho 42) 
	(profundo 16) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 20)
	(mp3 TRUE)
	(bandas 4)
	(durBateriaEspera 300)
	(durBateriaConv 6)
	(calidad "Bueno")	
	)
)

; MOTOROLA U9
(assert (modeloMovil 
	(modelo "U9") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 110)
	(alto 86)
	(ancho 49) 
	(profundo 29) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 20)
	(mp3 TRUE)
	(bandas 4)
	(durBateriaEspera 250)
	(durBateriaConv 5)
	(calidad "Regular")	
	)
)

; MOTOROLA V3
(assert (modeloMovil 
	(modelo "V3") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 95)
	(alto 98)
	(ancho 53) 
	(profundo 14) 
	(manosLibres FALSE)
	(camara 1)
	(memoria 5)
	(mp3 FALSE)
	(bandas 4)
	(durBateriaEspera 290)
	(durBateriaConv 7)
	(calidad "Pesimo")	
	)
)

; MOTOROLA V3XX
(assert (modeloMovil 
	(modelo "V3XX") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 107)
	(alto 103)
	(ancho 53) 
	(profundo 15) 
	(manosLibres TRUE)
	(camara 1.3)
	(memoria 50)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 400)
	(durBateriaConv 5)
	(calidad "Pesimo")	
	)
)

; MOTOROLA V8
(assert (modeloMovil 
	(modelo "V8") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 117)
	(alto 103)
	(ancho 53) 
	(profundo 12) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 256)
	(mp3 TRUE)
	(bandas 4)
	(durBateriaEspera 330)
	(durBateriaConv 7)
	(calidad "Bueno")	
	)
)

; MOTOROLA W377
(assert (modeloMovil 
	(modelo "W377") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 95)
	(alto 99)
	(ancho 45) 
	(profundo 18) 
	(manosLibres TRUE)
	(camara 1)
	(memoria 10)
	(mp3 FALSE)
	(bandas 3)
	(durBateriaEspera 250)
	(durBateriaConv 7)
	(calidad "Regular")	
	)
)

; MOTOROLA Z3
(assert (modeloMovil 
	(modelo "Z3") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 115)
	(alto 106)
	(ancho 46) 
	(profundo 16) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 20)
	(mp3 TRUE)
	(bandas 4)
	(durBateriaEspera 230)
	(durBateriaConv 3.4)
	(calidad "Aceptable")	
	)
)

; MOTOROLA Z6
(assert (modeloMovil 
	(modelo "Z6") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 105)
	(alto 105)
	(ancho 45) 
	(profundo 16.2) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 20)
	(mp3 TRUE)
	(bandas 4)
	(durBateriaEspera 400)
	(durBateriaConv 7)
	(calidad "Bueno")	
	)
)

; MOTOROLA Z8
(assert (modeloMovil 
	(modelo "Z8") 
	(marca "Motorola")
	(compania "XXXX")
	(precio XXXX) 
	(peso 112)
	(alto 109)
	(ancho 50) 
	(profundo 15) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 90)
	(mp3 TRUE)
	(bandas 4)
	(durBateriaEspera 400)
	(durBateriaConv 5)
	(calidad "Bueno")	
	)
)

; NOKIA 2310
(assert (modeloMovil 
	(modelo "2310") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 85)
	(alto 105.4)
	(ancho 43.9) 
	(profundo 19) 
	(manosLibres TRUE)
	(camara 0)
	(memoria 0)
	(mp3 FALSE)
	(bandas 0)
	(durBateriaEspera 400)
	(durBateriaConv 6)
	(calidad "Pesimo")	
	)
)

; NOKIA 2610
(assert (modeloMovil 
	(modelo "2610") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 102)
	(alto 104)
	(ancho 43) 
	(profundo 18) 
	(manosLibres TRUE)
	(camara 0)
	(memoria 6)
	(mp3 FALSE)
	(bandas 0)
	(durBateriaEspera 380)
	(durBateriaConv 3)
	(calidad "Malo")	
	)
)

; NOKIA 2630
(assert (modeloMovil 
	(modelo "2630") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 66)
	(alto 105)
	(ancho 45) 
	(profundo 9.9) 
	(manosLibres TRUE)
	(camara 1)
	(memoria 11)
	(mp3 FALSE)
	(bandas 0)
	(durBateriaEspera 310)
	(durBateriaConv 6)
	(calidad "Regular")	
	)
)

; NOKIA 2760
(assert (modeloMovil 
	(modelo "2760") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 80.4)
	(alto 87)
	(ancho 44.8) 
	(profundo 20.7) 
	(manosLibres TRUE)
	(camara 1)
	(memoria 11)
	(mp3 FALSE)
	(bandas 0)
	(durBateriaEspera 350)
	(durBateriaConv 7)
	(calidad "Malo")	
	)
)

; NOKIA 3110
(assert (modeloMovil 
	(modelo "3110") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 87)
	(alto 108)
	(ancho 46) 
	(profundo 15) 
	(manosLibres TRUE)
	(camara 1.3)
	(memoria 9)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 370)
	(durBateriaConv 4)
	(calidad "Aceptable")	
	)
)

; NOKIA 3120
(assert (modeloMovil 
	(modelo "3120") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 85)
	(alto 111)
	(ancho 45) 
	(profundo 13) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 24)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 290)
	(durBateriaConv 3.5)
	(calidad "Aceptable")	
	)
)

; NOKIA 3500
(assert (modeloMovil 
	(modelo "3500") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 81)
	(alto 107)
	(ancho 45) 
	(profundo 13) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 8.5)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 280)
	(durBateriaConv 3)
	(calidad "Aceptable")	
	)
)

; NOKIA 5200
(assert (modeloMovil 
	(modelo "5200") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 104)
	(alto 92.4)
	(ancho 48) 
	(profundo 20.7) 
	(manosLibres TRUE)
	(camara 1)
	(memoria 5)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 263)
	(durBateriaConv 3.2)
	(calidad "Regular")	
	)
)

; NOKIA 5310
(assert (modeloMovil 
	(modelo "5310") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 71)
	(alto 103)
	(ancho 45) 
	(profundo 10) 
	(manosLibres TRUE)
	(camara 2)
	(memoria 30)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 300)
	(durBateriaConv 5)
	(calidad "Aceptable")	
	)
)

; NOKIA 5610
(assert (modeloMovil 
	(modelo "5610") 
	(marca "Nokia")
	(compania "XXXX")
	(precio XXXX) 
	(peso 111)
	(alto 98)
	(ancho 48) 
	(profundo 17) 
	(manosLibres TRUE)
	(camara 3.15)
	(memoria 20)
	(mp3 TRUE)
	(bandas 3)
	(durBateriaEspera 320)
	(durBateriaConv 6)
	(calidad "Bueno")	
	)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; REGLAS PARA MODELOS

(defrule nombreRegla (condici�n) => (acci�n))

