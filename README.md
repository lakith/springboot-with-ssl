# springboot-with-ssl
Enable HTTPS with self-signed certificate in Spring Boot 2.0



# generate our PKCS12 keystore format <br/>
 &nbsp;&nbsp; keytool -genkeypair -alias lakith -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore lakith.p12 -validity 3650<br/><br/>
# For generating our keystore in a JKS format<br/>
 &nbsp;&nbsp; keytool -genkeypair -alias lakith -keyalg RSA -keysize 2048 -keystore lakith.jks -validity 3650<br/><br/>
# convert it to PKCS12 format<br/>
 &nbsp;&nbsp; keytool -importkeystore -srckeystore lakith.jks -destkeystore lakith.p12 -deststoretype pkcs12<br/><br/><br/><br/>
 
 
# optional<br/>
  &nbsp;&nbsp; keytool -genkey -alias lakith -storetype jks -keyalg RSA -keysize 2048 -validity 365 -keystore lakith.jks



