package lt.boldadmin.crowbar.api

interface ConfirmationMessageGateway {
    fun send(message: String, address: String)
}