package lt.tlistas.mobile.number.confirmation

interface SmsGateway {
    fun send(message: String, mobileNumber: String)
}