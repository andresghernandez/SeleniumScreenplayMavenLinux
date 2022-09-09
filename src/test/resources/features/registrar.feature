# language: en

Feature: Validar el registro de una persona en la plataforma 
	Yo como usuario de guru
	deseo realizar el registro de la pagina
	para poder acceder a sus funcionalidades
	
  @registro
  Scenario Outline: Validar el registro de una persona en la plataforma
    Given ingreso a la url de la pagina guru 
    When ingreso a la opcion crear cuenta <primerNombre> <apellido> <correo> <password> 
    Then puedo finalizar el registro

   Examples:  
      | primerNombre | apellido   | correo                       | password | 
      | "Prueba"     | "Internet" | "pruebachrome@yopmail.com"   | "123465" |
