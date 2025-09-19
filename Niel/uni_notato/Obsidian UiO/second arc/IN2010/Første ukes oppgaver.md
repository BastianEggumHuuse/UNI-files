https://pages.github.uio.no/IN2010/ukesoppgaver/oppgavesett/00_introduksjon.html

a) Hva er en algoritme? Nevn et eksempel.

- Det er en presis beskrivelse for hvordan man skal løse et problem. Dette kan være å rangere en gitt mengde tall fra minst til størst.

- fasit: En algoritme er en endelig sekvens av instruksjoner som utgjør løsningen på et spesifikt problem, og må oppfylle fire kriterier: 

- (1) den må terminere etter et endelig antall steg, 
- (2) hvert steg må defineres presist, og kontrollflyten må være entydig, 
- (3) den må ta null eller flere input
- (4) den må generere en form for output. I tillegg bør en algoritme være effektiv.

b) Hva er forskjellen på en abstrakt datatype og en datastruktur? Nevn noen eksempler.

- Datastruktur handler bare om en samling av verdier som følger en fast struktur. Strukturen skal gi oss informasjon raskt om relasjonene mellom elementene. Abstrakt datatype er en beskrivelse som sier hva som kan gjøres men ingenting om implementasjon. Eksempel kan være: ADT : Kø hvor en første element som blir lagt til blir den første som tas ut, Datastruktur: Selve lenket liste som holder kontroll på "første" og "siste" elementer i listen.

- fasit: En abstrakt datatype er en navngitt spesifikasjon med en tilhørende mengde operasjoner som kan implementeres på flere ulike måter. En datastruktur er en sammensatt datatype som lar oss lagre og organisere elementer i en bestemt struktur. Ulike strukturer gir oss mulighet til å lagre ulik type informasjon om relasjonen mellom disse elementene. Denne informasjonen danner grunnlaget for hvilke operasjoner vi kan utføre på datastrukturen, og avgjør hvor effektivt disse kan implementeres. En datastruktur er en realisering av en abstrakt datatype.

	Stacker, mengder og ordbøker er alle eksempler på abstrakte datatyper. Disse kan implementeres på flere ulike måter. Arrayer og lenkede lister er eksempler på datastrukturer som du kjenner fra før.



Gi en kort forklaring (med naturlig språk) av hvordan algoritmene fungerer. Hvilken er mest effektiv?

- Jeg mener at den andre er mer effektivt siden vi ikke ittererer gjennom alle nodene først.
  
- fasit: I den første algoritmen itererer vi over nodene i den enkeltlenkede lista til vi kommer fram til den nest siste noden. Deretter settes denne nodens neste til å peke på null.

  I den andre algoritmen utnytter vi det faktum at vi har mer informasjon om relasjonen mellom nodene i en dobbeltlenket liste (sammenlignet med en enkeltlenket liste) i form av en referanse til forrige node. Her settes simpelthen den siste noden til å peke på sin forrige, og andre referanser oppdateres per case.

  Hovedforskjellen mellom algoritmene er altså at den første itererer over (nesten) alle nodene i lista, mens den andre ikke gjør det. Den andre er dermed mest effektiv.

d) 
![[Pasted image 20250822164827.png]]



a) Hvilket element ligger i `A[i]` etter andre iterasjon dersom `x = 3`?

- `1` ligger i `A[i]` etter andre iterasjon.

b) 3

c) 
proc noe(A, x, low, high) i <-- (low + high) / 2 if A[i] = x then return true if high < low then return false else if A[i] < x then return noe(A, x, i + 1, high)  
else if A[i] > x then return noe(A, x, low, i - 1)

![[Pasted image 20250822171834.png]]
