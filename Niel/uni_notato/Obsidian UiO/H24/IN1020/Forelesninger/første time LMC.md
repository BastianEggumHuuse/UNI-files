---
Class: IN1020
Created: 2024-08-28T13:17
---
  

  

## LMC - Little Man Computer

En meget enkel, men teoretisk korrekt, datamaskin

  

Minnet til LMC består av  
100 nummererte «celler»  
på hver sin adresse. Hver  
celle kan inneholde et  
(desimalt) tall med tre sifre.  

  

CPU’en er en sentral  
del av LMC (og ekte  
maskiner generelt).  

  

(Vi skal bruke en  
simulator laget av  
Peter Higginson,  
  
[https://peterhigginson.co.uk/lmc/](https://peterhigginson.co.uk/lmc/))

  

## Central Processing Unit

• Arithmetic-Logic Unit (ALU)  
• Registre  
• Kontrollogikk for å utføre instruksjoner  

### CPU: ALU

- ALU’en i LMC kan:  
    – Addere heltall  
    – Subtrahere heltall  
    
- I en ekte datamaskin:  
    – Jobbe med flyttall  
    – Gange, dele, modulo, potenser, osv  
    – Betydelig mer funksjonalitet  
    

![[image.png]]


![[image 1.png]]

  

## CPU: Registre

- Programteller  
    - Inneholder adressen (0-99) til neste  
    instruksjon som skal hentes  
    
- Instruksjonsregister
- Adresseregister

– «Akkumulator-registeret»  
– Er til beregninger  
– Svaret kommer hit  
– Det er dette registeret dere vil tenke  
mest på når dere kommer i gang  


### CPU: Kontroll-logikk

• Kontroll-logikken henter og dekoder  
én og én instruksjon.  
• Kontroll-logikken utfører  
instruksjonen.  

**LMC støtter 9 forskjellige  
instruksjoner.  



### Instruksjoner i LMC

Hver instruksjon består av tre siffere

→ fra 000 til 999

Det første sifferet (gult) er instruksjonskoden.

Det grønne er adressedelen.

  

- Instruksjonskoden  
    – Viser hvilken instruksjon kontroll-logikken skal utføre.  
    
- Adressedelen  
    – Viser typisk hvilken adresse instruksjonen skal bruke.  
    – Med et par unntak..  
    

![[image 2.png | 400]]

Instruksjons sykelen

Alt som skjer i det prosessoren henter,  
dekoder og utfører en instruksjon, skjer i  
noe som heter instruksjons-sykelen.  

Instruksjons-sykelen

  

Kontrollogikken utfører instruksjons-sykelen slik:

1. Bruk verdien i programtelleren som adresse til minnet og  
    hent neste instruksjon der.  
    
2. Splitt (dekod) instruksjonen i instruksjonskode og  
    adressedel, og legg disse i instruksjonsregisteret og  
    adresseregisteret.  
    
3. Utfør det som instruksjonsregisteret angir.
4. Øk programtelleren med èn.
5. Gjenta fra punkt 1

  

![[image 3.png]]

![[image 4.png]]
  

![[image 5.png]]

![[image 6.png]]
 

![[image 7.png]]

Legg merke til hvordan dette skjer.

- Programtelleren blir sendt til ALU’en og økt med èn.  
    – Programteller = 1  
    
- Instruksjonen 000 blir delt opp i kodedelen 0 og  
    adressedelen 00.  
    
- Neste instruksjonssykel vil dermed kontrollogikken hente  
    instruksjonen fra adresse 1 i minnet.  
    – Med mindre vi har stoppet.  
    

  

![[image 8.png]]

![[image 9.png]]

![[image 10.png]]

  

  

![[image 11.png]]

![[image 12.png]]

![[image 13.png]]

![[image 14.png]]

![[image 15.png]]

![[image 16.png]]

![[image 17.png]]

![[image 18.png]]

![[image 19.png]]

  

  

### Instruksjonen 6xx

  
• Kalles for en «unconditional branch».  
• Bryter den sekvensielle kjøringen (adresse 0, 1, 0, 1, 0, 1)  
• Effekten: LMC gjør et «ubetinget hopp»..  
• ..og neste instruksjon LMC henter fra minnet, hentes fra  
verdien i adressedelen.  

![[image 20.png]]

![[image 21.png]]

![[image 22.png]]

  

Instruksjon 7xx


- Kalles «branch if zero».  
    • Hvis akkumulator er lik “0” (NULL):  
    – Sett programtelleren til innholdet av adressedelen  
    – Effekten er helt lik en “branch” i dette tilfellet.  
    • Hvis akkumulator ikke ikke er lik “0” (NULL):  
    – Ikke gjør noe.