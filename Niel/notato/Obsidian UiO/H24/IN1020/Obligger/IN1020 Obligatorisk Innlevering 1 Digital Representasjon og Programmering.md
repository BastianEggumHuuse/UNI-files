


## IN1020 Obligatorisk Innlevering 1 Digital Representasjon og Programmering

#### *2 PLU Koder*
Du jobber som godt betalt assembler-konsulent for LMC Daligvare AS i 1987. På denne tiden brukte matbutikker det man kalte PLU (Price-LookUp) koder. Dette er en en tresifret kode som kunne tastes inn i et kassa-apparat (se Figur 1) for å skanne varer som ikke hadde strekkode. Eksempler er frukt og grønnsaker uten emballasje. Kassereren slo inn slike koder når hen skannet varene fra båndet, gjerne sammen med et antall, og kassa-apparatet regnet ut totalsummen av alle varene (se Tabell 1).

|    Hva     | PLU | Pris (kroner) | Antall | Totalsum |
| :--------: | :-: | :-----------: | :----: | :------: |
|    Eple    | 405 |       7       |   1    |    7     |
| Rundstykke | 307 |       4       |   2    |    15    |
|  Appelsin  | 303 |      10       |   10   |    25    |

Tabell 1: Kassereren kan slå inn PLU koder og antall, og kassen holder styr på totalsummen.


#### 3 Oppgaven 
Din oppgave som assemblerutvikler er å lage et moderne kassa-apparat. Du innser at systemet kan optimaliseres ved å bruke LMC for å løse oppgaven. 3-sifrede PLU koder passer nemlig godt for LMC, som representerer verdier i titallsystemet med tre siffere. I tillegg må hver vare ha sin egen pris (per stykk). Denne dataen må lagres i minnet til LMC. Av erfaring vet du at det kan være smart å tenke igjennom andre egenskaper matvarer kan ha, som kan være nyttig å representere digitalt. Dette kan spare deg for tid senere. Det er snart helg og du vil ikke jobbe overtid.

#### 3.1 Et register med PLU koder 
- Kom på fire ekstra egenskaper matvarer kan ha som det kan være nyttig å representere digitalt. Her er det ingen fasit, men opp til deg å reflektere over hvilke egenskaper som kan være nyttige å representere digitalt. 

– PLU (Price-LookUp)
– Pris 
– Kategori
– Farge
– Smak
– Størrelse

- Gi en kort beskrivelse av hva disse kan bli brukt til (en setning maks). Lag en tabell som vist under, hvor du også angir hvor mange celler du trenger, hvilke verdier som skal kunne representeres, og om det som ligger i cellen er et heltall eller tekst (datatype i tabellen under).

| Hva       | Beskrivelse                                     | Antall celler | Verdier   | Datatyper    |
| --------- | ----------------------------------------------- | ------------- | --------- | ------------ |
| PLU       | Koden kassereren slår opp                       | 1             | 0 til 999 | Heltall      |
| Pris      | Prisen til varen, brukt til å beregne totalpris | 1             | 0 til 999 | Desimaltall  |
| Kategori  | Type matvare (f.eks. frukt, grønnsaker)         | 1             | 65 til 90 | Streng/Ascii |
| Vekt      | Vekten av maten i gram                          | 1             | 0 til 999 | Heltall      |
| Farge     | Fargen på varen                                 | 1             | 65 til 90 | Streng/Ascii |
| Størrelse | Størrelsen på varen                             | 1             | 65 til 90 | Streng/Ascii |
#### 3.2 Minnestruktur og minnebruk 
LMC har et relativt sparsommelig minne på 100 adresserbare celler, nummerert fra 0 til 99 som vist under. Hver celle kan holde et heltall (desimaltall) mellom -999 og +999^1  . Disse brukes til både kode og data:

![[Pasted image 20240916153936.png|500]]
- Ta for deg egenskapene ved matvarer du kunne tenke deg å representere digitalt fra Seksjon 3.1, som PLU, stykkpris og de fire egenskapene du har funnet på selv. Hvor mange minneceller vil du trenge for å representere en vare? Lag en tabell som vist under.
 
| Celle |    Hva    |
| :---: | :-------: |
|   0   |    PLU    |
|   1   |   Pris    |
|   2   | Kategori  |
|   3   |   Vekt    |
|   4   |   Farge   |
|   5   | Størrelse |

Dersom alle minnecellene til LMC skulle brukes til å representere matvarer, hvor mange matvarer har du da plass til?
- Jeg tror at jeg ville ha fått plass til 16 varer om alle cellene var brukt til å representerer varene.




- Hvor ser du for deg at dataene for disse skal lagres i maskinen, samt koden din? Ta utgangspunkt i tabellen over og skissér. Du kan for eksempel bruke blå farge på cellene med registeret ditt, og rød farge på cellene som inneholder koden din, samt dataene koden jobber med. Her er det ikke noe fasitsvar, men du bør tenke litt på hvordan du skal få lagret dataene dine i maskinen før koden kjører.

![[Pasted image 20240911131208.png|500]]
##### 3.3 Implementasjon 


Du skal nå implementere et enkelt kassa-apparat i LMC som man kan bruke til å slå inn varer og beregne totalpris. Programmet skal fungere slik:

(koden står i kode.txt)