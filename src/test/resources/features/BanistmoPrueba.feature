# Autor: Jahaziel De Salas
# language: es
@stories
Característica:  BanistmoPrueba
  Un usuario necesita entrar al portal de Banistmo para descargar un PDF

  @scenario
  Escenario: Descargar PDF
    Dado que Yo necesito entrar al portal de Banistmo
    Cuando este dentro buscar el PDF deseado
    Y poder descargarlo
    Entonces validar que la descarga sea valida

