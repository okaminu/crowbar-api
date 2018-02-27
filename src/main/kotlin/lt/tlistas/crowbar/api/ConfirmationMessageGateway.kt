package lt.tlistas.crowbar.api

interface ConfirmationMessageGateway {
    fun send(message: String, address: String)
}