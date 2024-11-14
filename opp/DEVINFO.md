# Osnovne informacije ostatku tima

### API za backend
ZA NAŠ LOGIN:
POST http://localhost:8080/login
	U TIJELU ZAHTJEVA:
	username=user&password=pass
	
ZA NAŠU REGISTRACIJU:
POST localhost:8080/register?username=TVOJ_USERNAME&password=TVOJ_PASSWORD
	
ZA GOOGLE LOGIN:
GET http://localhost:8080/oauth2/authorization/google

Neka frontend samo šalje ove zahtjeve.

### Baza podataka

Za sada osnovna, sadrži samo "users" tablicu. Za detalje pogledati opp/src/main/java/hoodlcassics/opp/domain/CustomUser.java.
Bazu podataka generira Spring pri pokretanju aplikacije. Na trenutnim se postavkama baza podataka briše nakon gašenja
servera.

### Informacije za pokretanje

Budući da je sve hostano lokalno, za pokretanje ovog backenda potrebno je prvo namjestiti par stvari.
	1. Lokalno stvoriti bazu podataka i podesiti src/main/resources/application.properties tako da odgovara
	   stvorenoj bazi. Ovo je lakše nego izgleda, samo zamijenite URL, username i password sa vašim, što se sve
	   namjesti u PgAdmin-u.
	2. Folder "secrets", koji ću vam poslati preko discorda, treba pozicionirati u src/main/resources/ tako da je
	   puni put do .txt filea iz kojeg aplikacije vuče šifru opp/src/main/resources/secrets/google.txt.
	   Ovaj folder NIKAKO ne smije završiti na GitHubu.
	3. Sve što je na GitHubu na ovom branchu samo skinite, stavite u jedan direktorij i importajte kao Maven project
	   u Eclipse/IntelliJ. Onda kliknite Run (nije bitno iz koje klase, snać će se) i to je to, server je gore.
	
<hr>
-Vaši Bevanda i Duje							   		