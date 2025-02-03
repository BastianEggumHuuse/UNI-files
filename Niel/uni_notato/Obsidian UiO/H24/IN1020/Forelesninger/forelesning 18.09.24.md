
### Operativsystemer – Dirigenten i datamaskinen

- Sørge for at flere brukere kan dele en datamaskin
- Sørge for at flere programmer kan kjøre samtidig
- Fungere som et «mellomnivå» mellom maskinvare og programvare

![[Pasted image 20240918142547.png|200]]

### De fleste dagens operativsystemer er i «slekt»

![[Pasted image 20240918142625.png]]


### Kunne vi ha klart oss uten operativsystemer

- **Et eksempel fra «Historieboken» :**

En Nord-12 maskin fra 1972:
1. Lese inn et hullbånd med program for å redigere kode.
2. Lese inn et hullbånd med mitt program.
3. Redigere programmet.
4. Skrive ut et hullbånd med det oppdaterte programmet.
5. Lese inn et hullbånd med kompilatoren.
6. Lese inn hullbåndet med programmet mitt.
7. Kompilatoren skriver et hullbånd med ferdig maskinkode.
8. Lese inn hullbåndet med koden og kjøre programmet.

![[Pasted image 20240918142958.png|300]]

![[Pasted image 20240918143423.png]]

### Mange parallelle oppgaver

- **Bedre utnyttelse av maskinen**
  - Mange prosesser i parallell
    - Utfører forskjellige oppgaver
    - Bruker forskjellige komponenter
  - Flere samtidige brukere

- **Utfordringer**
  - “Samtidig” tilgang 
  - Beskyttelse / sikkerhet
  - Rettferdighet
  - ...

![[Pasted image 20240918143933.png|400]]

### Hva er definisjonen i litteraturen?

- **“An operating system (OS) is a collection of programs that acts as an intermediary between the hardware and its user(s), providing a high-level interface to low level hardware resources, such as the CPU, memory, and I/O devices. The operating system provides various facilities and services that make the use of the hardware convenient, efficient and safe.”
  - Lazowska, E. D.: Contemporary Issues in Operating Systems, in: Encyclopedia of Computer Science, Ralston, A., Reilly, E. D. (Editors), IEEE Press, 1993, pp. 980**

- **Det er en enkel maskin (ovenfra og ned)**
  - Skjuler kompliserte detaljer
  - Presenterer en «virtuell maskin», enkel å bruke

- **Det er en resurshåndterer (nedenfra og opp)**
  - Hvert program for sin tid/plass i resursene

![[Pasted image 20240918144237.png|250]]![[Pasted image 20240918144307.png|300]]


![[Pasted image 20240918144343.png]]

### Forskjellige typer operativsystemer (OS)

- **Enkel-bruker, enkel-oppgave:**
  - Historisk og sjelden (kun noen gamle PDA’er brukte dette)

- **Enkel-bruker, multi-oppgaver:**
  - PCer og arbeidsstasjoner kan være konfigurert slik (typisk gamle mobiltelefoner)

- **Multi-bruker, multi-oppgaver:**
  - Brukes på servere, PCer, arbeidsstasjoner, bærbare PCer og de fleste moderne maskiner.

- **Distribuert OS:**
  - Støtte for å kontrollere ressurser på flere datamaskiner. Ikke så vanlig.

- **Real-time OS:**
  - Støtte for systemer hvor sanntid er viktig som biler, robotter, fly, instrumenter, atomreaktorer, osv.

- **Embedded OS:**
  - Bygd inn i enheter for å løse et konkret problem, som for eksempel enkle mobiltelefoner, mikrobølgeovner, vaskemaskiner, dørlås, osv.


#### Hovedkomponenter i et operativsystem

- **Synlige for bruker:**
    - Brukergrensesnitt
    - Filsystem
    - Enhetskontroll

- **(Relativt) Transparent:**
    - Prosessorkontroll
    - Minnekontroll
    - Kommunikasjonstjenester

![[Pasted image 20240918144636.png|400]]


![[Pasted image 20240918144701.png]]


### Enhetskontroll

- Operativsystemet må kunne kontrollere enheter tilkoblet maskinen som for eksempel disker, tastatur, nettverkskort, skjermer, høyttalere, mus, USB-minne, kamera, DVD/Bluray, mikrofon, skrivere, joysticks, ...

**Utfordringer:**
- forskjell i enhetstyper
- Varierende hastighet på enhetene
- Forskjellige måter å hente og skrive data på

![[Pasted image 20240918144904.png|500]]


### Brukergrensesnitt

- **Koblingen mellom bruker og datamaskinen**

- **Operativsystemets logikk som støtter kobling mellom maskinvare og programmer:**
  - **Kommandolinje**: For eksempel, en terminal.
  - **Grafisk brukergrensesnitt (GUI)**: Grensesnitt med vinduer, ikoner, menyer og peker.

- **Grensesnittet ligger ikke i operativsystemkjernen**
  - Eksempel: X (i Linux ser man X)
    - Vindushåndteringssystem som kjører på de fleste ANSI C og POSIX (Portable OS Interface for UNIX) kompatible systemer.
    - Bruker kommunikasjon mellom prosesser for å få input fra, og sende output til flere programmer.
  - Andre eksempler:
    - Desktop Window Manager (Windows)
    - Wayland (Linux)


### Systemkall

- **Grensesnittet mellom operativsystemet og programmer (bruker)**
  - Definert gjennom systemkall.

- **Når operativsystemet gjør et systemkall:**
  - Ligner på å kalle en funksjon i for eksempel Python.
  - Systemkallet går inn i kjernen på operativsystemet.

![[Pasted image 20240918145021.png]]



### Eksempel på systemkall: read
##### Eksempel på systemkall i programmeringsspråket C

**Eksempel:**
```c
count = read(fd, buffer, nbyte);
```

1. **Lagrer parametere i minne**
2. **Kaller API som programmet bruker**
3. **Setter systemkall nummer i minne**

4. **Kaller kjernen (TRAP)**
   - Kjernen undersøker systemkall nummer.
   - Kjernen finner hvor kallet skal sendes.
   - Kjernen utfører operasjonen.

5. **Tilbake til API for å rydde opp**
   - Fjerner parametere fra minne.

6. **Fortsetter programmet**

![[Pasted image 20240918145204.png|400]]

### Brukernivå vs. Kjernenivå (Beskyttelse)

- **Mange OS skiller mellom brukernivå og kjernenivå:**
  - Grunnen til dette er sikkerhet og beskyttelse.

- **Operativsystemet kjører i kjernemodus:**
  - Real mode
  - Tilgang til hele minnet
  - Alle instruksjoner kan bli kjørt
  - Går forbi all sikkerhet
  - Bytte til Protected mode eller Long mode snarest mulig

- **Vanlige programmer og flere API’er kjører i brukernivå:**
  - Protected mode
  - Bruke privilegerte nivåer (x86: «ring», ARM: «mode»)
  - Ytre ringer:
    - Kan ikke kontakte maskinvare eller enheter direkte, kun gjennom et API
    - Tilgang kun til et begrenset minneområde
    - Begrenset tilgang til prosessoren

![[Pasted image 20240918145236.png]]


### Organisering av operativsystemer

Det finnes ingen bestemt standard for hvordan et operativsystem skal bygges opp (i motsetning til nettverksprotokoller, etc.), men det er to hovedmodeller:

1. **Monolittisk kjerne ("the big mess"):**
   - **Kjennetegn:**
     - All beskyttet kode kjører i samme beskyttelsesområde.
     - Alle komponenter kan kommunisere direkte (funksjonskall, skrive i minne).
   - **Fordeler:**
     - Effektiv kommunikasjon mellom komponenter.
   - **Ulemper:**
     - Feil i en komponent kan påvirke andre komponenter.
     - Store og komplekse.
   - **Eksempler:**
     - BSD UNIX, Linux, Windows 10 (++).

2. **Mikro-kjerner:**
   - **Kjennetegn:**
     - Består av små moduler med minimal funksjonalitet (avbrudd, minne, prosessor, osv.).
     - Så mange som mulig av tjenestene skrives i brukermodus.
   - **Fordeler:**
     - Liten, modulær, utvidbar, portabel.
   - **Ulemper:**
     - Mye beskjeder frem og tilbake (ineffektivt).
     - Vanskelig å utføre ting i riktig rekkefølge.
     - Vanskelig feilsøking pga. grensene mellom modulene.
   - **Eksempler:**
     - MACH, Windows NT.

![[Pasted image 20240918145406.png|250]]

![[Pasted image 20240918145400.png]]


### Oppsummering

- **Operativsystemer skjuler kompleksiteten i maskinvare:**
  - Gir en brukervennlig grensesnitt for å håndtere hardware-funksjonalitet.

- **Tillater flere brukere å bruke maskinen samtidig:**
  - Effektiv administrasjon av ressurser for multi-bruker, multi-oppgavemiljøer.

- **API for å tillate programmer å bruke ressurser i maskinen:**
  - Gir standardiserte grensesnitt for programmer for å samhandle med operativsystemet og maskinvaren.

- **Grunnleggende sikkerhetsmekanismer er bygd inn:**
  - Beskytter system og data ved å kontrollere tilgang og isolere prosesser.

- **Flere detaljer om kommunikasjonstjenestene i slutten av oktober!**
  - Mer informasjon om hvordan kommunikasjon mellom prosesser og tjenester håndteres vil bli presentert senere.



### Ekstramateriale

#### Bøker og artikler:
- **Andrew S. Tanenbaum, Herbert Bos: Modern Operating Systems (4th edition), 2015. Pearson**
  - En omfattende innføring i moderne operativsystemer, deres design og funksjonalitet.

#### Kurs om operativsystemer på IFI:
- **IN2140 – Introduksjon til operativsystemer og datakommunikasjon**
  - Gir en grunnleggende forståelse av operativsystemprinsipper, samt fundamentet innen datakommunikasjon.

- **IN3000 – Operativsystemer**
  - En mer avansert kurs som dykker dypere inn i operativsystemdesign, -implementering og -optimalisering.

