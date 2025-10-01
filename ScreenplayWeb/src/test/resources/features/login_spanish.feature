# language: es
# Autor: Sebastian Zapata
# Correo: zapatasebastian001@gmail.com
#Este es el mismo caso pero en español, las configuraciones son las mismas, se deberá adaptar a necesidad del cliente el lenguaje

Característica: : Yo como Usuario quiero validar la página de inicio de sesión

  @Test
  Escenario: Validar flujo básico de inicio de sesión
    Dado que el usuario está en la página principal
    Y el usuario hace clic en el botón de iniciar sesión
    Cuando el usuario inicia sesión con credenciales
    | usuario                      | contraseña |
    | zapatasebastian001@gmail.com | s3b4st!aN  |
    Y el usuario hace clic en el botón de enviar inicio de sesión
    Entonces el usuario puede ver el mensaje Bienvenido zapatasebastian001@gmail.com
