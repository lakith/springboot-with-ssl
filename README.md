# springboot-with-ssl
Enable HTTPS with self-signed certificate in Spring Boot 2.0



#generate our PKCS12 keystore format
 keytool -genkeypair -alias lakith -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore lakith.p12 -validity 3650
#For generating our keystore in a JKS format
 keytool -genkeypair -alias lakith -keyalg RSA -keysize 2048 -keystore lakith.jks -validity 3650
#convert it to PKCS12 format
 keytool -importkeystore -srckeystore lakith.jks -destkeystore lakith.p12 -deststoretype pkcs12
 
 
#optional
  keytool -genkey -alias lakith -storetype jks -keyalg RSA -keysize 2048 -validity 365 -keystore lakith.jks



