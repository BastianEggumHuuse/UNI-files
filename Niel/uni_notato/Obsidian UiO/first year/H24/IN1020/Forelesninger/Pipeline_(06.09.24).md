https://www.uio.no/studier/emner/matnat/ifi/IN1020/h24/kompendium/2024-09-05.pdf

#### Dagens forelesnings:
- Hvordan virker en pipeline
-  Hva er en BUS?
- Ulike typer av minne
- Utlesing av minne


Utførelse av addisjon (instruksjon 199)
- Hent instruksjonen og øk programtelleren (FETCH)
- Splitt instruksjonen og hent fra minne (DECODE)
- Utfør instruksjonen (EXECEUTE)
- Lagre data (WRITE-BACK)


![[Pasted image 20240906103352.png | 400]]


#### Pipeline
- Samlebåndsprinsipp
- Dele opp instruksjonen i uavhengige deler
- Neste instruksjon settes i gang før forrige
- (Skriv ferdig)



#### Pipeline med subinstruksjoner
- IF - Instruction fetch
- DE - Decode instruction
- EX - Execute
- WB - Write Back

![[Pasted image 20240906104207.png | 350]]

#### Speed-up
- Det å ha en 4 trinns pipeline betyr ikke at man får 4 ganger raskere prosessering. 
- Det går alltid noe tid bort til administrering av instruksjoner og komplikasjoner!

### BUS
- Kommunikasjonskanal (mellom registere, ALU, minne og I/O enheter)
- kan deles mellom flere enheter, men kun en som kan sende av gangen  
- Internt i en CPU er den en eller flere bus(er) som overfører data mellom interne registre

#### Én klokkesykels CPU
- Klokkeperioden må være like lang som den lengste forsinkelsen for enhver instruksjon gjennom data-path´en
- Resultat: Raskere instruksjoner tvinges til å bruke mer tid enn nødvendig
- Mulig løsning: Klokke med variabel periode 
- Vurdering: Vanskelig å implementere


## IN1020 - Minnehierarki

#### Ranger disse minneelementene etter hastighet
- Flip-flop
- Register
- Cache
- RAM
- SSD-disk
- Minnepen
- DVD

![[Pasted image 20240906113850.png|400]]


![[Pasted image 20240906114107.png]]

### Minnehierarki - Bruksområder

Register
-  Intern kladdeblokk for CPU'en med rask aksess til innholdet.
Cache
-  Hurtig mellomlager for bådestruksjoner og data for å jevne ut hastigetsforskjellen mellom CPU'en og hurtigminnet.
RAM
- Buffer mellom eksternt lagringsmedium og CPU'en med rask både lese- og skrive aksess.
SSD/Flash/Harddisk
- Høykapasitetsmedium for program/data



### Minnehierarki - Lagringskapasitet
Register
-  Integrert på CPU'en, relativt få (32 - 128 stykker).
Cache
- Mellomlager internt (L1) eller i nærheten (L2,L3) av CPU'en, typisk kapasiteter er fra 10 KiloByte (L1) til 1 MegaByte (L2) og flere MegaByte (L3).
RAM
- Internt på hovedkort i nærheten av CPU'en, størrelser opp flere GigaByte.
SSD/Flash/Harddisk
- Ekstern eller intern lagringsenhet i maskinen med kapasitet opptil flere TeraByte


![[Pasted image 20240906114356.png]]

### Ram Terminologi
- Address Space - Størrelsen på adresserbare minne enheter, oppgis enten i word eller bites
- Word Length - Antall bit som kan bli lest/skrevet i en operasjon
- Memory size - Størrelsen er gitt av address space x word length


### Hit og Miss
- Cache-hit og cache-miss  
- RAM-hit and RAM-miss

### Koherens
- Skrive til minne tar lengre tid enn å lese fra minne