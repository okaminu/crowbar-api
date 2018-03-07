![Alt text](logo.jpg?raw=true)
# Crowbar API
Crowbar library API defines *ConfirmationMessageGateway* interface which is used as an extension point, in order to easily swap Confirmation message provider.
* Implementation of the interface:
```
class YourGatewayAdapter() : ConfirmationMessageGateway {

    override fun send(message: String, mobileNumber: String) {
        //implementation
    }
```
* Class, which implements *ConfirmationMessageGateway* can be injected during runtime:
```
class YourClass(private val confirmationMessageGateway: ConfirmationMessageGateway) {

    fun yourMethod(address: String, message: String) {
        confirmationMessageGateway.send(address, message)
    }
}
```
### License

