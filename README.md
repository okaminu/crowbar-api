![Alt text](logo.jpg?raw=true)
# Crowbar API
Crowbar library API defines *ConfirmationMessageGateway* interface which is used as an extension point, in order to easily swap Confirmation message provider.
* Implementation of the interface:
```
class YourGatewayAdapter() : ConfirmationMessageGateway {

    override fun send(message: String, address: String) {
        //implementation
    }
```
* Class, which implements *ConfirmationMessageGateway* can be injected during runtime:
```
class YourClass(private val confirmationMessageGateway: ConfirmationMessageGateway) {

    fun yourMethod(message: String, address: String) {
        confirmationMessageGateway.send(message, address)
    }
}
```
### Download
* Gradle
```
repositories {
    repositories {
        maven {
            url 'http://repository.boldadmin.com.s3.amazonaws.com/releases/'
        }
    }
}

dependencies {
    compile "lt.boldadmin.crowbar:crowbar-api:2.5.1"
}
```
* Maven
```
<repositories>
    <repository>
        <id>boldadmin-release-repo</id>
        <name>BoldAdmin Release Repository</name>
        <url>http://repository.boldadmin.com.s3.amazonaws.com/releases/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>lt.boldadmin.crowbar</groupId>
        <artifactId>crowbar-api</artifactId>
        <version>2.5.1</version>
    </dependency>
</dependencies>
```

### License

This library is licensed under MIT. Full license text is available in [LICENSE](https://github.com/boldadmin-com/Crowbar_API/blob/dev/LICENSE.txt).