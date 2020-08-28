package cl.malditosnakamas.superrepaso.registro.domain

interface RegistroRepository {
    suspend fun registrarUsuario(registroUsuario: RegistroUsuario): Boolean
}