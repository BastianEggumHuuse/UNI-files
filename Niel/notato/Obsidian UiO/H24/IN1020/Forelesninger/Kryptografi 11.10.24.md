
#### Kryptografi - Nøkkelen til digital samhandling

Plan for "nettverksdelen" av IN1020

- 21. september - Introduksjon til operativsystemer
- 27. september - Datanett 101 - Introduksjon
- 4. oktober - Lagdeling i datakommunikasjon
- 9. oktober - Hvordan fungerer din trådløse ruter?
- **11. oktober - Kryptografi - Nøkkelen til digital samhandling**
- 16. oktober - Tjenester i Internett


##### Introduksjon til kryptografi

- Hvorfor trenger vi kryptografi?
- Hva er kryptografi?
- Hvordan "knekke" en kryptering.
- Hemmelig nøkkelkryptering.
- Hash-algoritmer.
- Offentlig nøkkelkryptering.


##### Trenger vi kryptografi?

![[Pasted image 20241011164108.png]]


##### Brodcast-systemer:

Radio:
- WiFi (EEE 802)
- Mobiltelefoni: 3G, 4G, 5G
- Satelitt

**Egenskaper:**
- Kan bli problemer hvis to noder sender samtidig..
- Feil deteksjon er viktig
- **Når en node sender kan alle noder som er i rekkevidde lytte på kommunikasjonen!**

![[Pasted image 20241011164327.png|300]]

##### Kryptering og sikkerhet i nettverket

![[Pasted image 20241011164648.png]]
#viktig    ^

*Kryptering på flere lag gjør det vanskeligere for uvedkommende å lytte til kommunikasjonen. Adressen (avsender / mottakeren) er vanskelig å kryptere, da router må vite hvor pakken skal leveres.*

##### Kryptografi: Viktige definisjoner

Beskjeder:
- Plaintext / Klar tekst
- Ciphertext / Kryptert tekst
Ingredienser:
- Algoritmer
- Nøkler

![[Pasted image 20241011184410.png|400]]

#### Hemmelige koder

Cæsar-chiffer
- Skifte bokstaver 3 ganger fremover
	- DOZEN -> GRCHQ
Dekoderringer
 - Substituer bokstaver n bokstaver bidere (n = 1..25)
	 - HAL -> IBM (n = 1)
Monoalfabetisk chiffer
- Tilfeldig mapping (26! = 4.03291461 * 10^26)
	- 1 ms / forsøk -> 10M år... MEN, bokstavfrekevns er en svakhet..

#### Enigma

![[Pasted image 20241011184904.png]]

##### Hvordan "knekke" en kryptering

Kun Ciphertext / kryptert tekst 
- Prøve alle forskjellige nøkler (brute-force) 
- Trenger en lang nok chipertext 

Deler av plaintext / klar tekst 
- Har chipertext, sammenligne med forventede verdier 
- Brukt mot den Japanske marinen i WW2 

• Finne svakheter i krypteringsalgoritme 
• Finne svakheter i implementasjonen av algoritmen


#### Kompleksitet vs. ”Brute-force” 

Algoritmen bør være effektiv å bruke 
Sikkerheten er avhengig av hvor komplekst koder er å knekke 
Eksempel: Kombinasjonslås 
- 3 tall, mellom 1 og 40 – 10 sekunder per forsøk 
- 4 tall mellom 1 og 40 – 13 sekunder per forsøk


##### Kombinasjonslåss 
- 3 tall, mellom 1 og 40 – 10 sekunder per forsøk 
	- Antall kombinasjoner: 403 = 64.000 
	- 178 timer 
- 4 tall, 13 sekunder per forsøk 
	- 40^4 = 2,560.000 
	- 9244 timer

##### Hva er egentlig et god passord?
- De mest vanlige passordene i 2024:
	- 123456, password, 123456789, 12345678, 12345
- Passord generert med verktøy som 1Password? 
	- cdHAY2DIVrX'+3Pt
- "Passphrase":
	- laptop wrapped bow keyboard!

##### Frekvensanalyse

- Følgende passord:
	- Interdisciplinary (Knekkes på få sekunder)

- Bruke av avskjæringer:
	- Frekvensanalyse
	- Bruk av ordlister

![[Pasted image 20241011190122.png|400]]

#### Sikkerhet i trådløse nettverk?

- Svakhet i protokoller og algoritmer
	- Svakheter i implementasjoner
		- Key Reinstallation Attacks (KRACK)
- "Brute-force"
	- Teste alle mulige kombinasjoner

![[Pasted image 20241011190400.png]]

#### Forskjellige typer kryptering

Symmetrisk kryptering
- Hemmelig nøkkelkryptering
- En nøkkel: Men må deles mellom sender og mottaker

Hash-algoritmer
- Enveis identifikasjon
- Ingen nøkkel

Asymmetrisk kryptering
- Offentlig nøkkelkryptering
- To nøkler:
	- Privat
	- Offentlig

#### Symmetrisk kryptering

![[Pasted image 20241011223026.png|200]]

(vi har flere algoritmer de kan deles til to typer)

To typer: 
- Block cipher (DES, 3DES, AES) (samler opp data og krypterer det)
- Stream cipher (RC4) (Krypterer tegn for tegn)
Per dags dato er "block cipher" mest brukt, og gjerne i blokker på 18-bits (AES)

#### Symmetrisk kryptering for (økt) sikkerhet

 Anvendelse:
 - Kryptering av data
 - Krpytering av meldinger
 
Hvilke sikkerhetsmål kan ivaretas?
- Konfidensialitet? JA (Forklaring: Pga nøkkelen så blir det uleselig for andre.)
- Integritet ? I praksis JA (Forklaring: Hvis noen endrer kryptert data blir det korrupt data og da oppdager man det.)
- Autentisitet til dataopprinnelse? JA (Forklaring: om to personer deler en hemmelig nøkkel. vet da mottakeren kan vite at dette er fra andre personen med nøkkelen)
- Uavviselighet? NEI (Forklaring: Det er ikke mulig å se hvem som sendte hvem når begge har nøkkene, kanke se hvem som har kryptert dataen)
- Mottagers autentisitet JA (Forklaring: Person 1 kan være ganske sikker på at person 2 med hemmelige nøkkelen. da kan person 1 være sikker på at det er kun person 2 som kan lese)

Farer: Kan miste nøkkelen da blir dataen din tapt. Nøkkelen kanskje bli spes.



#### Kryptografiske enveisfunksjoner (hash-funksjoner)

Sjekke dataintegritet / ikke-reverserbar 
Kriterier for en god sjekksumalgoritme:
- Enkelt å regne ut sjekksum for en gitt beskjed.
- Ikke mulig (vanskelig) å finne en beskjed for en gitt sjekksum.
- Ikke mulig (vanskelig) å endre en beskjed uten at sjekksummen blir endret.
- Ikke mulig (vanskelig) å finne to forskjellige beskjeder med samme sjekksum.

![[Pasted image 20241011222557.png|300]]

#### Hash-algoritmer

![[Pasted image 20241011222627.png|500]]

#### Viktigheten av gode tilfeldige tall

![[Pasted image 20241011222652.png|500]]

- Brukes til å generere kryptografiske nøkler
- Brukes for å gjøre det vanskeligere å gjette seg frem til kryptografiske nøkler
- Kan f.eks. brukes som «salt» når man genererer nøkler

#### Kryptografisk Hashlivssykel

![[Pasted image 20241011222804.png]]

Hash-algoritmer for (økt) sikkerhet

Anvendelse:
- Sammenligning av filer (sjekk av integritet)
- Beskyttelse av passord
- Integritetssjekk, f.eks. av SW-distribusjoner
- Integritetssjekk av meldinger (dataintegritet)

Hvilke sikkerhetsmål kan ivaretas?
- Konfidensialitet? JA
- Integritet til data/melding? JA
- Autentisitet til dataopprinnelse? NEI
- Uavviselighet? NEI

Farer? De har begrensa leve tid og er utsatt for forsøk på knekke/hacke.


![[Pasted image 20241011222920.png|300]]

Også kjent som «offentlig nøkkelkryptering»

- Offentlig nøkkel: publisert, gjerne åpnet på nettet for alle 
- Privat nøkkel: hemmelig og ikke offentlig

#### Asymmetrisk kryptering

![[Pasted image 20241011223241.png|500]]

![[Pasted image 20241011223317.png]]
![[Pasted image 20241011223333.png]]

#### Utfordringer med asymmetrisk kryptering

- Effektivitet
  - Asymmetriske krypteringsalgoritmer er mange ganger tregere enn symmetriske algoritmer.

- Løsning: hybrid modell
  - Asymmetrisk kryptering brukes for å bli enige om en midlertidig nøkkel.
    - Den vanligste teknikken er kjent som Diffie-Hellman nøkkelutveksling
  - Symmetrisk kryptering brukes under resten av kommunikasjonen.

![[Pasted image 20241011223423.png]]

#### Asymmetrisk kryptering for meldingsutveksling:

- *Fremgangsmåte:* Sender benytter mottagers offentlige nøkkel for å kryptere en melding, mottager benytter sin private nøkkel til å dekryptere meldingen.
- *Anvendelse*: Trygg overføring av data/melding, autentisering

**Hvilke sikkerhetsmål kan ivaretas?**
- Konfidensialitet? JA
- Integritet? I praksis JA
- Autentisitet til dataopprinnelse? NEI
- Uavviselighet? NEI
- Mottagers autentisitet? JA

Farer: Nøkkel på avveie, falske nøkler

#### Digital signatur

![[Pasted image 20241011223821.png|400]]

*Asymmetri*:

- Signatur kan kun bli generert av eier eller noen som kjenner privat nøkkel.
- Signatur kan bli verifisert av alle som har tilgang til offentlig nøkkel.
- En korrekt verifisert signatur bekrefter avsenderens identitet, og at meldingen ikke ble endret fra sending til mottak.

![[Pasted image 20241011223850.png|300]]


Asymmetrisk kryptering for digital signering:

- Fremgangsmåte: Sender krypterer (og dermed signerer) en melding med sin private nøkkel. Mottager dekrypterer (og dermed validerer) meldingen med senders offentlige nøkkel.
- Anvendelse: Ivareta tillit til at meldinger kommer fra en hevdet avsender, autentisering.

Hvilke sikkerhetsmål kan ivaretas?
- Konfidensialitet? NEI
- Integritet? I praksis JA
- Autentisering av dataopprinnelse? JA
- Uavviselighet? JA
- Mottagers autentisitet? NEI

Farer: Nøkkel på avveie, falske nøkler


#### Nøkkelutveksling og sertifikater

- Utfordring: Hvordan stole på at en offentlig nøkkel er ekte?
  - Løsning: En identitet og tilhørende nøkkel knyttes sammen i et offentlignøkkel sertifikat.

- Neste utfordring: Hvordan stole på at sertifikatet er ekte?
  - Løsning: Sertifikatet utstedes av en betrodd virksomhet (sertifikatmyndighet - CA), som går god for at nøklene er autentiske – altså tilhører identiteten den utgir seg for å tilhøre.

#### Men hva er et offentlig-nøkkel sertifikat?

- Et sertifikat består av den offentlige nøkkelen, samt en rekke attributter knyttet til nøkkelen:
  - Eier, gyldighetsperiode, utsteder, kryptoalgoritme brukt, nøkkelstørrelse, etc.
- Attributtene pakkes sammen og signeres av sertifikatutstederen = vi har et sertifikat
- Har standarder for hva et sertifikat skal inneholde (f.eks. såkalt X.509)

#### Og hvordan distribuere offentlige nøkler?

- Man utarbeider en «Offentlig-nøkkel infrastruktur» (PKI)
  - PKI er et rammeverk for utstedelse, administrasjon og bruk av digitale sertifikater med offentlige nøkler.

- Hovedformål: Sikre ektheten av offentlige nøkler, samt trygg og forsvarlig nøkkel-distribusjon.

- En PKI må bestå av:
  - En policy for sertifikat-håndtering
  - Teknologi for å implementere policyen
  - Prosedyrer for hvordan håndtere og forvalte nøklene
  - Tillitsmodell for sertifikatene med offentlige nøkler

#### Offentlig-nøkkel infrastruktur oppsummert:

- Hver eneste offentlige nøkkel bakes inn i hvert sitt elektroniske sertifikat som knytter nøkkel og identitet sammen.
- Et sertifikat utstedes av en tiltrodd sertifikatutsteder (Certificate Authority), som går god for den offentlige nøkkelens ekthet.
- Den tilhørende private nøkkelen kan oppbevares (trygt!) på en datamaskin, på SIM-kortet i en mobil, på et smartkort, i banken (BankID), ...
- Sertifikatene med de offentlige nøklene gjøres tilgjengelig for alle mottagere som skal kunne kryptere og dekryptere meldinger.

(I praksis mer komplekst enn dette, da man opererer med hierarki av sertifikater, tillitskjeder, mm. Utenfor IN1020-pensum ☺)


![[Pasted image 20241011224316.png]]

#### Eksempel: BankID

«BankID er elektroniske sertifikater som en sertifikatholder kan benytte til å sikre elektronisk meldingsutveksling med andre sertifikatholdere ved å bekrefte rett identitet til partene (autentisering), sikre innholdet mot endring (integritet), knytte meldingen til en bestemt part (ikkebenekting) og/eller skjule innholdet for uvedkommende (kryptere)»


#### Kryptering oppsummert:

- Hovedmål:
  - Sikre konfidensialitet til data/meldinger – gjøre data uleselig for de som ikke har de riktige nøklene.
  - Sikre integritet til data – at data er korrekt og ikke endret utilsiktet.
  - Autentisering av entiteter som kommuniserer – sikre ektehet/autentisitet til den andre enheten i kommunikasjon (system-/organisasjonsautentisitet, dataautentisitet).
  - For å oppnå uavviselighet i avtaleinngåelse (digital signatur).

- Krypteringsformer:
  - Hash-algoritmer (enveis-kryptering).
  - Symmetrisk (én hemmelig delt nøkkel).
  - Asymmetrisk (nøkkelpar: offentlig + privat (hemmelig) nøkkel).

#### Krypteringsformer, læringsmål:

- Forstå hvorfor kryptering er nødvendig i digital samhandling.

- Kjennetegn og vanlige bruksområder for:
  - Hash-algoritmer
  - Symmetrisk kryptering
  - Asymmetrisk kryptering

- Hvorfor vi trenger offentlig-nøkkel sertifikater og offentlig nøkkel-infrastruktur (PKI)

![[Pasted image 20241011224441.png]]

#### Ekstramateriale:

- Bøker og artikler:
  - W. Stallings. Cryptography and Network Security: Principles and Practice (7th Edition), 2016, Pearson.

- Sikkerhetskurs på IFI og MatNat:
  - IN2120 – Informasjonssikkerhet
  - IN3210 – Network and Communications Security
  - TEK5510 – Sikkerhet i operativsystemer og programvare