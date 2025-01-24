
Læringsmål
ha lest dette kapittelet skal du: 
- Kjenne til de forskjellige abstraksjonsnivåene og kunne beskrive dem, inkludert maskinvare, minnehierarki, maskinkode og programmeringsspråk. 
- Forstå den spesifikke rollen og funksjonen til hvert abstraksjonsnivå og hva de bidrar med i det generelle datamaskinsystemet. 
- Forstå hvordan abstraksjonsnivåene påvirker design og implementasjon av programvare og maskinvarekomponenter. 
- Kunne vurdere hvordan sikkerheten på hvert abstraksjonsnivå påvirker den overordnede sikkerheten til et datamaskinsystem, og forstå hvordan man sikrer systemet mot trusler på forskjellige nivåer.



Hva skal vi kunne til sliutt i IN1020? (maskinvaredelen)

- ASIC - spesial lagde chipper for å gjøre spesielle oppgaver.
- IoT - Internet of things - alt skal være digitalt typ, dyppdinger som er elekotroniske som kan prate sammen.
- Trade-off - noe veldig bra, så må man ofre noe for å få det


![[Pasted image 20241025103325.png|450]]


![[Pasted image 20241025103618.png|500]]
![[Pasted image 20241025103917.png|500]]

## BUS
#begrep #BUS 
- Kommunikasjonskanal (mellom registere, ALU, minne og I/O enheter)
- kan deles mellom flere enheter, men kun en som kan sende av gangen
- Internt i en CPU er den en eller flere bus(er) som overfører data mellom interne registere.

![[Pasted image 20241025104218.png|450]]
## TRADE-off

- I informatikk blir trade-off sett på som et verktøy for handelen. Et program kan ofte kjøre raskere hvis det bruker mer minne (en avveining mellom rom og tid). Tenk på følgende eksempler: Ved å komprimere et bilde kan du redusere overføringstiden/kostnadene på bekostning av CPU-tiden for å utføre komprimering og dekomprimering.
## Hit og Miss
#begrep #hit-og-miss

- Cache-hit og cache-miss  
- RAM-hit and RAM-miss

CPU spør level 1,2,3 om de har det cpu spør for. om ikke (cache miss) må den spørre ram

## Koherens  
#begrep #Koherens
* Hvordan sikre at alle nivåene i minnehierarkiet har gyldig data?  
* Skrive til minne tar lengre tid enn å lese fra minne!

## Datamaskinarkitektur
- CPU
- ALU
- ADDER
- Logiske Porter
- Transistor