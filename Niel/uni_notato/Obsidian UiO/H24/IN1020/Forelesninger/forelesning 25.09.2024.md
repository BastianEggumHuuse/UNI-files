
I dag: Hvem er hvem på internett?
Hvordan kunne stole på digitale aktører

Ressurser:
- Forelesning 25.09.24
- To temavideoer:
  - 04 - Autentisitet
  - 05 - Tilgangskontroll
- Ukeoppgaver og pensumlitteratur (Heide/Nätt: Kap 4, 5 (123-128) og 6 (145-157))

Nøkkelord: 
- Autentisitet 
- Autentisering 
- Tilgangskontroll

**Entiteter og identiteter**
- **Entitet?**
	- Noe som har fysisk, juridisk eller prosessuell eksistens
	- Entiteter kan gis en identitet, som gjør det mulig å referere til entiteten
- **Identitet?**
	- Et sett med atrributter som er tilordnet entiteten 
	- Kan kjenne igjen entiteter basert på identiteten
	- Som regel har man identifikator
- **Digital identitet?**
	- Digital representasjon av entitet... #skriv_ferdig


**Autentisitet**
- **Hvordan muliggjøre tillit til at identiteter (entiteter) er autentiske:**
  - Autentisk individ (bruker, person)?
  - Autentisk organisasjon?
  - Autentisk (data)system?
- **I tillegg ønske om:**
  - Autentisk opprinnelse til data (ofte kalt en melding)?

![[Pasted image 20240925143006.png]]

**Entiteter og identiteter**
- **Identitetshåndtering:** Prosessen med å registrere og autentisere identiteter.

**Autentisering**
- **Autentisering er mekanismen for å bekrefte en hevdet identitet:**
  - Brukerautentisering
  - Organisasjonsautentisering
  - Systemautentisering
  - Dataautentisering


#### **Brukerautentisering**

**Autentiseringsfaktor**
- Tre hovedkategorier bevismateriale (autentiseringsfaktor) for identitet:
  - Noe du vet
  - Noe du har
  - Noe du er

**I tillegg:**
- Andre mekanismer, som SMS eller e-post til en kanal du har kontroll over
- Kombinasjon av flere

"Always remember the three main authentication factors: What can be easily guessed, what can be left in a cab, and what can be chopped off"



#### Autentiseringsfaktor: 

Noe du vet
Eksempler: 
- Passord til IT systemer
Fordeler:
- Du har det alltid med deg
Ulemper:
- Lett å glemme
- Lett å gjette for uvedkommende
- (mer på lysark)

Noe du **har**

Eksempler: 
- Nøkkler
Fordeler:
- Slipper å huske
Ulemper:
- Kan mistes
- Kan glemmes

##### Autentiseringsfaktor: Noe du er - biometri

**Eksempler:**
- Fingeravtrykk
- Ansiktsgjenkjenning
- Iris- eller retinalskanning
- Stemmegjenkjenning

**Fordel?**
- Unik for hver person, vanskelig å dele eller kopiere
- Bekvemmelighet, ingen behov for å huske passord eller bære med seg en enhet

**Ulempe?**
- Kan være kostbart å implementere
- Kan være mindre privat, da biometriske data er sensitive
- Muligheter for falske positive/negative resultater, spesielt med dårligere teknologi
- Ikke reversibelt; hvis biometriske data først blir stjålet, kan man ikke endre dem som man kan med et passord

#### Flerfaktor-autentisering

**Utfordring:** Passord kan gjettes, objekter kan mistes/stjeles

**Løsning:** Autentisering med flere faktorer
- Kombinasjon av to eller flere ulike faktorer
- Øker sikkerheten betydelig, men autentisering blir mer tungvint for den som skal autentisere seg
- Økende antall tjenester tilbyr to-faktor-autentisering (2FA), mens svært kritiske systemer også benytter seg av kombinasjoner med ennå flere faktorer


### Autentiseringsløsning som tjeneste

Aktører tilbyr elektronisk identitet og autentisering som en tjeneste.
- **Eksempler:** Feide, Google, Facebook, BankID

**Fordeler:**
- God kompetanse, ekspertise og dermed økt sikkerhet i tjenesten som tilbys
- Brukerne må forholde seg til færre brukeridentiteter/passord

**Ulemper:**
- Knekkes autentiseringsfaktoren(e), vil hackere ha tilgang til flere tjenester som deg
- Vane å logge inn gjør oss til et enkelt mål for svindel


#### Kan koder/passord knekkes?

- **Passord lagres kryptert**

- **Likevel kan de «knekkes»:**
  - Intelligent søk: Kunnskap om deg?
  - Systematisk gjetting (brute-force) og «ordlisteangrep»
  - Utnytte svakheter i datasystemene



Elektronisk identitet - eID
«E-postkontoen er navet i ditt digitale liv»




##### Tilgangskontroll = autentisering + autorisasjon



#### Tilgang, logging og sporbarhet

- ✓ **Loggføring av hendelser** er et bidrag til sikkerhetsmålet sporbarhet.
- ✓ **Kan loggføring av hendelser ha flere funksjoner?**
- ✓ **Kan vi stole på hendelsesloggene?**


**Øktas læringsmål**

- Forstå sikkerhetsmålet autentisitet, kjenne til de ulike formene for autentisering, samt styrker og svakheter ved ulike autentiseringsfaktorer.
- Tilgangskontroll: Forstå hvordan tilgangskontroll fungerer, og hva som oppnås.