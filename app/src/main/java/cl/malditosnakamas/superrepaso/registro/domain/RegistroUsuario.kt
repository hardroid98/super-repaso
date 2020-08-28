package cl.malditosnakamas.superrepaso.registro.domain

data class RegistroUsuario(
    val email: String,
    val nombre: String,
    val rut: String,
    val pass: String
)