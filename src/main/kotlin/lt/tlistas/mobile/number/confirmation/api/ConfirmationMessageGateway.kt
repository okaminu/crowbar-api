package lt.tlistas.mobile.number.confirmation.api

interface ConfirmationMessageGateway {
    fun send(message: String, address: String)
}