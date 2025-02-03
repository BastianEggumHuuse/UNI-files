


### 1. generasjon: Radiorør

| År        | Teknologi | Størrelse | Instr/sek | Pris(2019kr) |
| --------- | --------- | --------- | --------- | ------------ |
| 1945 - 60 | Radiorør  | 10m^3     | 2000      | 60 mil       |
![[Pasted image 20240911142348.png|]]

### 2. generasjon: Transistorer

| År      | Teknologi    | Størrelse | Instr/sek | Pris(2019kr) |
| ------- | ------------ | --------- | --------- | ------------ |
| 1960-68 | Transistorer | 500dm^3   | 500 000   | 50 mil       |
![[Pasted image 20240911142715.png]]



## Little Man Computer blir født (1965).

![[Pasted image 20240911142734.png]]

3. generasjon: Integrerte kretser

| År      | Teknologi          | Størrelse | Instr/sek | Pris(2019kr) |
| ------- | ------------------ | --------- | --------- | ------------ |
| 1970-80 | Integrerte kretser | 80dm^3    | 300 000   | 200 000      |
![[Pasted image 20240911142907.png]]




### The Voyager Probes (1977)

![[Pasted image 20240911142926.png]]

### From Voyager CPU Reference Manual

![[Pasted image 20240911142956.png]]

##### «Computers in Spaceflight: The NASA Experience» https://ntrs.nasa.gov/citations/19880069935

![[Pasted image 20240911143110.png|]]


### 4. Generasjon: Mikroprosessorer

| År      | Teknologi        | Størrelse  | Instr/sek | Pris(2019kr) |
| ------- | ---------------- | ---------- | --------- | ------------ |
| 1980-?? | Mikroprosessorer | 0,1-20dm^3 | 10^9      | 1-10 000     |

## Klokkefrekvens

Sier noe om hvor fort en CPU arbeider.
Desto høyere klokkefrekvens, jo raskere CPU.


Eks. 10 Hz :
Klokka slår 10 ganger i sekundet.

![[Pasted image 20240911143601.png|500]]


### Prosessoren x86
Intel’s x86 har gått fra å være én av mange prosessorer til å bli den dominerende.

Noen årsaker:
- Tidlig ute med nyvinninger
- Bakoverkompatibel

Utfordres av ARM.


![[Pasted image 20240911143802.png|500]]

#### **Moore's "lov"**

Antall transistorer i en krets
dobler seg annethvert år.

Ble observert av Gordon Moore ved Intel allerede i 1965.

![[Pasted image 20240911144357.png|450]]

### **Prosessoren x86-64**

x86 - 64 fra Intel og AMD finnes i de aller fleste "vanlige" datamaskiner i dag.

![[Pasted image 20240911144636.png]]

## **Cache**

- Gjør minneoppslag i RAM - raskere.

- Er relativt liten.
	- I moderne prosessorer, noen MB.
	- Vs. Flere titalls GB i RAM.
- Finnes både data- og instruksjons-cacher.


## **Eksekveringsløkken**

Både LMC og x86-64 har samme eksekveringsløkke:

1. Hent instruksjonen i minnet; programtelleren angir hvor.
2. Dekod instruksjonen i f.eks. operasjon og adresse.
3. Utfør instruksjonen.
4. Om aktuelt, skriv svaret i minnet/register.

x86-64 har i tillegg pipeline for å kunne jobbe raskere.


![[Pasted image 20240911145035.png|500]]


## **Pipelining**

![[Pasted image 20240911145219.png]]


### **Registre**

- **LMC** har ett register som programmereren kan bruke (akkumulator-registeret). Det kan lagre verdier fra –999 til +999.
- **x86-64** har 16 registre. De kan brukes som 1-, 2-, 4- og 8-bytes registre.


![[Pasted image 20240911152553.png]]

![[Pasted image 20240911152601.png]]

![[Pasted image 20240911152612.png]]

![[Pasted image 20240911152623.png]]

##### **Hva hvis vi går tom for minne?**

Med virtuelt minne (x86_64) kan vi flytte data fra RAM til en harddisk.

- Og motsatt! Celle 80 til 99 blir i dette tilfellet gjort tilgjengelig for nye data.

![[Pasted image 20240911152849.png]]


##### **Hva med sensitiv informasjon?**

Med virtuelt minne (x86_64) bruker hvert program «sitt eget virtuelle minne» med 100 celler. Disse ligger egentlig på helt andre, fysisk isolerte celler. Håkon kan ikke lenger hente passordet til Omid.

![[Pasted image 20240911153008.png|550]]


##### **Virtuelt Minne (x86_64)**

- Vi kan bruke mer minne (RAM) enn vi egentlig har.
- Et program kan ikke stjele data fra et annet program.

![[Pasted image 20240911153049.png]]

##### **CPU-arkitektur**

- **LMC (og ARM)** er RISC-maskiner mens **x86-64** er en CISC-maskin.
- **CISC** («Complex instruction set computer») har noen enkle og noen ganske kompliserte instruksjoner, som:
    - `REP MOVSB` kan flytte et vilkårlig antall byte fra ett sted i minnet til et annet.
    - `FYL2XP1` beregner ( x \cdot (\log_2 y + 1) ).
- **RISC** («Reduced instruction set computer») har et begrenset antall enkle instruksjoner, men kan utføre disse ekstremt raskt og effektivt.


##### **CISC vs RISC, et eksempel**

Anta at vi skal lage kode tilsvarende Python-setningen:

![[Pasted image 20240911153452.png|250]]
##### **x86-64:**
![[Pasted image 20240911153502.png|300]]

##### **LMC:**
![[Pasted image 20240911153515.png|300]]

##### Prosessorene vi har vært gjennom:
![[Pasted image 20240911153751.png]]


##### **Sikker programmering**

Som programmerere er det viktig å skrive programmer som er:

- **trygge** («safe»), dvs. vil alltid oppføre seg fornuftig
- **sikre** («secure»), dvs. tåler bevisste angrep



##### **De første datamaskinene (1945 – 1955)**

De første datamaskinene ble programmert med numeriske koder (som LMC); dette kalles gjerne  *1. generasjonsspråk*.

- :) Effektivt (for maskinen)
- :( Veldig lett å gjøre ulike feil:
    - bruke gal instruksjonskode
    - skrive gal adresse
    - ødelegge instruksjoner ved å overskrive med data
    - prøve å utføre data som instruksjoner
- :( Veldig vanskelig å feilsøke



##### **Assemblerkode**

Programmeringen ble enklere med assemblerkode, ofte kalt 2. generasjonsspråk:

- :) Man slipper å huske numeriske koder.
- :) Adresser håndteres stort sett automatisk.
- :( Stadig ingen feilsjekking og ingen begrensninger på hva man får lov til.
- :( Vanskelig å feilsøke

![[Pasted image 20240911154133.png|400]]


##### **De første programmeringsspråkene (1955 – 1965)**

Man ønsket å:
- programmere raskere
- gjøre programmene mer lesbare
- gjøre færre feil

Resultatet ble 3. generasjonsspråk, som f.eks. FORTRAN, COBOL, BASIC.

Bra:
- Vi fikk array-er, setninger og funksjoner; mer strukturert programmering

Dårlig:
- Stadig ingen sjekk av grenser, antall parametre etc.
- Ingen krav om å deklarere variabler
- Noen i ettertid «dumme» eller «rare» ideer



##### **Dårlige Idéer**

- **Sikkerhet**
    - Bedre enn for assembler, men stadig en lang vei å gå
###### FORTRAN:

![[Pasted image 20240911154644.png|300]]

###### COBOL:

![[Pasted image 20240911154703.png|350]]


##### **Nye programmeringsparadigmer (1965–1980)**

Nå er datamaskinene blitt større og raskere, og tiden er moden for mer avanserte programmeringsspråk.

Bra:
- Vi får nye paradigmer som objektorientert programmering, funksjonell programmering, logisk programmering etc.
- Vi får spesialiserte språk for systemprogrammering, databasespørring etc.
- Man finner ut at `goto` ikke er så lurt.
- De fleste språkene får i det minste noe sjekking av grenser.

Eksempler: C, C++, Scheme, Pascal, Simula, SQL



##### **Interpreterte programmeringsspråk (1980–1990)**

Mikromaskinene kommer, og det blir laget mange typisk interpreterte språk: 4. generasjonsspråk.

- Interpreterte språk som Eiffel, Perl, Python, Ruby, …


- Mer fleksible, krever mindre av programmereren
- Kjapt å lage småprogrammer
- Veldig god sjekking av ulovligheter (under kjøring)
- Enda tregere eksekvering




![[Pasted image 20240911155312.png]]

![[Pasted image 20240911155330.png]]


![[Pasted image 20240911155340.png]]

##### **Programmeringsspråk for Internettet (1990–)**

- Noen har gode mekanismer for distribuert eksekvering
- Noen er laget for integrering i nettlesere
- Eksempler: Emerald, Java, Javascript, PHP, …

![[Pasted image 20240911155412.png]]

![[Pasted image 20240911155432.png]]