# Programsko inženjerstvo - Projekt HoodClassics

# Opis projekta
HoodClassics je web aplikacija osmišljena za sve one koji žele dublje upoznati mjesto koje posjećuju – kroz lokalne priče, legende i skrivena značenja koja ga čine posebnim.

Omogućuje korisnicima da razgledavaju mjesto kroz interaktivnu mapu sa pinovima. Kada kliknete na pin, otvara vam se objava s informacijama i pričama vezanim za tu lokaciju, pružajući vam autentičan pogled na lokalni život i kulturu. 

Svojim doprinosima lokalni korisnici obogaćuju iskustvo svih posjetitelja, čineći HoodClassics dinamičnom zajednicom u kojoj je svaki doprinos priča s dušom.

Naša će aplikacija biti razrađena na engleskom jeziku kako bi ju jednostavije koristili i strani korisnici budući da je fokus aplikacije na turizam, te kako bi se u budućnosti jednostavnije skalirala za korištenje na većem području.

# Ciljevi projekta
Razvoj ove aplikacije ima nekoliko ključnih ciljeva. Prvenstveno, omogućit će nam praktično upoznavanje s alatima i tehnologijama za razvoj web i mobilnih aplikacija. Ovaj projekt pruža priliku da se kroz konkretan rad upoznamo s cijelim procesom razvoja, od početne ideje do završne implementacije, uključujući važno dokumentiranje svih koraka kako bismo stekli navike temeljite projektne organizacije.

Nadalje, projekt će nam pomoći u razvijanju komunikacijskih vještina, jer ćemo tijekom rada surađivati i komunicirati unutar tima, što je ključno za koordinirano i učinkovito rješavanje zadataka. Na taj način stječemo vrijedno iskustvo timskog rada i učenja u simuliranom radnom okruženju, što će nas bolje pripremiti za složenije izazove i profesionalne projekte u budućnosti.

# Ključni funkcijski zahtjevi
Za naš projekt analizirali smo i definirali niz funkcionalnih zahtjeva koji detaljno opisuju ključne funkcionalnosti aplikacije. Ovdje su izdvojeni ključni zahtjevi za lakše razumijevanje funkcionalnosti aplikacije.

*  Sustav prikazuje kartu na kojoj su prikazani pinovi.
    * Prikazuje interaktivnu kartu s pinovima koji označavaju lokacije priča i kulturnih sadržaja.
*  Sustav podržava tri različite korisničke uloge: lokalac, turist, moderator.
    * Različite korisničke uloge omogućuju pristup specifičnim funkcionalnostima, uključujući dodavanje i moderiranje sadržaja.
*  Lokalac može napraviti objavu.
    * Registrirani lokalci mogu stvarati objave o lokacijama, uključujući priče i kulturne detalje.
*  Aplikacija mora omogućiti filtriranje pinova po tagovima.
    * Korisnici mogu filtrirati lokacije po tagovima kako bi lakše pronašli sadržaje vezane za svoje interese.
*  Sustav omogućuje korisnicima kreiranje računa pomoću e-mail adrese.
    * Registracija putem e-maila omogućuje korisnicima pristup personaliziranim funkcijama i kreiranje sadržaja.
*  Sustav omogućuje korištenje aplikacije bez prijave.
    * Aplikacija je dostupna za osnovno pregledavanje i korištenje i bez registracije.

# Tehnologije
Za naš projekt odabrali smo ove alate: 

* Frontend: Koristimo React u kombinaciji s TypeScriptom za pisanje komponenata i osiguravanje sigurnih tipova podataka, što pomaže u lakšem održavanju i boljoj čitljivosti koda. Za dizajn korisničkog sučelja upotrebljavamo Material UI koji omogućava elegantan i responzivan dizajn aplikacije.
* Backend: Backend je izgrađen na Spring frameworku koji pruža snažne alate za razvoj i održavanje aplikacije, posebno u područjima vezanim za sigurnost, upravljanje podacima i rad s RESTful API-jem.
* Deployment: Aplikaciju postavljamo na platformu Render, koja nudi automatiziran i skalabilan deployment te pojednostavljuje održavanje i ažuriranje aplikacije.
* Autentifikacija: Koristimo OAuth 2.0 za autentifikaciju, osiguravajući tako sigurnost korisničkih podataka i omogućujući jednostavnu integraciju s drugim pružateljima identiteta, poput Google računa.

# Način rada

Za uspješan rad na projektu, tim je definirao jasna pravila za podjelu rada i komunikaciju. Članovi tima preuzimaju zadatke prema vlastitim interesima i područjima stručnosti. Ovaj pristup osigurava da svatko radi na aspektima projekta gdje može dati svoj najveći doprinos, čime se povećava kvaliteta i učinkovitost rada.

Za koordinaciju i razmjenu informacija koristi se kombinacija komunikacijskih alata, uključujući WhatsApp za brze poruke i Discord za strukturirane rasprave i suradnju. Također,  organizirani su sastanci uživo i online, što omogućuje dublju raspravu o ključnim točkama i donošenje zajedničkih odluka.


# Članovi tima 

Hrvoje Radoš: voditelj tima, backend 

Ivan Bevanda: backend

Duje Ćubelić: backend

Jakov Borić: frontend

Mateo Piskač: frontend

Dora Strmečki: dokumentacija


# 📝 Licenca
Važeča (1)
[![CC BY-NC-SA 4.0][cc-by-nc-sa-shield]][cc-by-nc-sa]

Ovaj repozitorij sadrži otvoreni obrazovni sadržaji (eng. Open Educational Resources)  i licenciran je prema pravilima Creative Commons licencije koja omogućava da preuzmete djelo, podijelite ga s drugima uz 
uvjet da navođenja autora, ne upotrebljavate ga u komercijalne svrhe te dijelite pod istim uvjetima [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License HR][cc-by-nc-sa].
>
> ### Napomena:
>
> Svi paketi distribuiraju se pod vlastitim licencama.
> Svi upotrijebleni materijali  (slike, modeli, animacije, ...) distribuiraju se pod vlastitim licencama.

[![CC BY-NC-SA 4.0][cc-by-nc-sa-image]][cc-by-nc-sa]

[cc-by-nc-sa]: https://creativecommons.org/licenses/by-nc/4.0/deed.hr 
[cc-by-nc-sa-image]: https://licensebuttons.net/l/by-nc-sa/4.0/88x31.png
[cc-by-nc-sa-shield]: https://img.shields.io/badge/License-CC%20BY--NC--SA%204.0-lightgrey.svg

Orginal [![cc0-1.0][cc0-1.0-shield]][cc0-1.0]
>
>COPYING: All the content within this repository is dedicated to the public domain under the CC0 1.0 Universal (CC0 1.0) Public Domain Dedication.
>
[![CC0-1.0][cc0-1.0-image]][cc0-1.0]

[cc0-1.0]: https://creativecommons.org/licenses/by/1.0/deed.en
[cc0-1.0-image]: https://licensebuttons.net/l/by/1.0/88x31.png
[cc0-1.0-shield]: https://img.shields.io/badge/License-CC0--1.0-lightgrey.svg

### Reference na licenciranje repozitorija
