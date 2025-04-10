#transportlaget

![[Pasted image 20241016142342.png]]


#### Metningskontroll

En ruter er i utgangspunktet bare en FIFO (first-in-first-out) kø.

Om det blir for mye trafikk over en gitt kø, vil det føre til stopp i trafikken. Dette kalles ”congestion”. Om det er så mye traffikk at det blir full stopp for alle, kalles det “congestion collapse”. 

For å unngå dette bygde man inn mekanismer i TCP for å tilpasse senderaten til nettverksforholdene.

![[Pasted image 20241016143017.png]]

![[Pasted image 20241016143030.png]]

![[Pasted image 20241016143048.png]]


### ... stadig metningskontrol

- Ressursene deles teoretisk sett likt mellom forbindelser
- For å kapre mer av kapasiteten: åpne flere forbindelser i parallell. 
- Ingen god metode for å fordele ressurser i Internett rettferdig pr. maskin eller pr. bruker i dag.


### Aksessmodeller i Applikasjonslaget

Aksessmodeller: Klient-tjener 
- Tradisjonell kommunikasjonsmodell, lettfattelig abstraksjon 
	- Klienter ber om en tjeneste (oppretter en forbindelse) 
	- Tjenere leverer tjenesten (svarer på forespørselen)

- Eksempler: Webklient (nettleser)/Webtjener, Mailklient/tjener, FTP

![[Pasted image 20241016143455.png|500]]


#### Forbindelsesstrategier (push og pull)

Pull
- Klienten ber tjeneren om en tjeneste (f.eks et dokument)
- Tradisjonelt den vanligste metoden

Push
- Tjeneren ”dytter” en tjeneste (f.eks en beskjed) til klienten. 
- Krever at det er en forbindelse fra før, eller at klienten lytter. 

Publish-subscribe 
- Variant av ”Push” der tjeneren dytter ut beskjeder til en gruppe av abonnenter (subscribers)


![[Pasted image 20241016143807.png]]

#### Fysisk plassering av innholdet

- Dere husker cachierarkiet fra Omids forelesning?

Content Delivery Network

Hierarkiske systemet for å distribuere innhold
- Vanlig å "cache" populært innhold.

Populære videoer blir lagret nærmere sluttbrukerne
Videoer som ikke er så populære lagres enten på eller nærme kjerneserveren
Spesielt viktig hvis båndbredden er begrenset.
-  For eksempel: WiFi på fly

### Distribusjon med CDN

![[Pasted image 20241016144125.png|350]]

### Fysisk plassering av innholdet

![[Pasted image 20241016144433.png]]


![[Pasted image 20241016144449.png]]

![[Pasted image 20241016144831.png]]

#Peer-to-Peer
### Peer to Peer

- På flere måter likt CDN:
	- Endesystemer kan være både klient og tjenere
	- Distribuert lagring
	- Innholdet nærmere sluttbruker
	- Begrenset lagring per endesystem
	
- Men ulikt på noen punkter:
	- Ingen klare rollet på endesystemene
	- Ikke noe hierarkisk forhold
	- Klienter vet nødvendigvis ikke hvor innholdet er 
		- Trenger protokoller for å "oppdage innhold"
	- Endesystemer i et P2P nettverk kommer og går


#### P2P - Styrker og svakheter

- Ideelt til å dele ressurser mellom enheter (peers)
- Ressurser som dele kan være:
  - CPU (SETI@home, Folding@home osv.)
  - Lagring/harddiskplass (distribuerte databaser, distribuerte hashtabeller)
  - Nettverk/lagring (bittorrent)
  - CPU/lagring/nettverk (Bitcoin)
  - Eller nesten hva som helst…
- Tilgangen/fordelingen av ressurser styres av algoritmer.
- Robust mot endringer i nettverket av peers

#### P2P - Styrker og svakheter

- Egner seg dårlig til applikasjoner som er avhengig av lav forsinkelse.
  - Onlinespill med høyt tempo (som First Person Shooters, f.eks. "Battlefield")
- Om man er avhengig av en viss grad av sentral kontroll.
  - P2P er vanskelig å temme når "katta først er sluppet ut av sekken"
- Peers kommer og går
  - Mye redundans og ressurser kreves for å sikre kontinuitet
- Kan være vanskelig å effektivt indeksere og finne igjen elementer

#### Eksempel: Napster

- Program for deling av filer (musikk) over Internett
- Arkitektur:
  - Sentralisert index (katalog)
  - Distribuert lagring og nedlastning
  - Alle filer lastet ned blir delt
  - Lansert i 1999
- P2P aspekter:
  - Endesystemene var også filtjenere

https://www.uio.no/studier/emner/matnat/ifi/IN1020/h24/undervisningsmateriell/09-tjenester-i-internett.pdf

### (Se eksempler på napser side 25^)



#### Napster: Evaluering

- Skalerbart:
  - Replikasjon av filer:
    - Antall kopier av populære filer stiger.
    - Liten tilgjengelighet for filer som ikke er populære.
  - Ignorerer fullstendig nettverkstopologien.
- Innholdslokasjon:
  - Enkel og sentral søkemekanisme.
- Pålitelighet:
  - Ingen avhengighet mellom normale brukere.
  - Sentralisert server er en "single-point-of-failure".
- Ikke "advokat-sikkert", Napster ble stengt i 2001…


#### Varianter av P2P-baserte topologier

- Ren P2P:
  - Alle peers er likeverdige.

- Hybrid P2P:
  - Noen sentrale noder har mer funksjonalitet enn andre.
    - Sentrale tjenere eller
    - "Superpeers"
  - Kan være valgt fordi:
    - De ikke står bak brannmur og/eller NAT.
    - De har mye av en ressurs, f.eks. båndbredde, harddiskplass, CPU-regnekraft.
  - Slike løsninger kan hjelpe til f.eks. å få ned forsinkelsen i en P2P-løsning.

![[Pasted image 20241016145659.png|300]]

## DNS - Domain Name System

##### Hvordan koble til en annen maskin?
#skriv_ferdig 


![[Pasted image 20241016153428.png]]
![[Pasted image 20241016153444.png]]

## HTTPS example (cont.)

![[Pasted image 20241016153513.png]]


## Persistente og ikkepersistente forbindelser

![[Pasted image 20241016153545.png]]

### HTTP/1.x meldingsformat: request


![[Pasted image 20241016153718.png]]


## HTTPS /1.x meldingsformat: response

![[Pasted image 20241016153753.png]]


HTTP/1.x response statuskoder (eksempler)

- **200 OK**
  - Forespørselen var vellykket, objektet kommer senere i meldingen.
  
- **301 Moved Permanently**
  - Objektet har byttet plassering. Referanse til ny plassering kommer senere i meldingen.
  
- **400 Bad Request**
  - Forespørselen var uforståelig for tjeneren.
  
- **404 Not Found**
  - Dokumentet ble ikke funnet på tjeneren.
  
- **505 HTTP Version Not Supported**
  - HTTP-versjonen som ble brukt i forespørselen støttes ikke av tjeneren.

![[Pasted image 20241016154024.png]]

![[Pasted image 20241016154034.png]]

#### Sikrere HTTP: HTTPS (HyperText Transfer Protocol Secure)

- **Ønske:**
  - Sikre kryptert kommunikasjon mellom klient og tjener (konfidensialitet + integritet).
  - Sikre tillit til at web-tjeneren er ekte (autentisitet).
  
- **Løsning: HTTPS (HTTP over SSL)**
  - Bruker en offentlig-nøkkel infrastruktur (Internett-PKI) med offentlig-nøkkel sertifikater.
  - En webtjener har et kryptografisk nøkkelpar (offentlig + privat nøkkel), hvor den offentlige nøkkelen er distribuert i tilhørende sertifikat, utstedt og signert av en tiltrodd sertifikatmyndighet (CA):
  
    1. Nettlesere (klienter) kan verifisere at en nettside (webtjener) er autentisk ved å sjekke at webtjenerens sertifikat er ekte og gyldig, og at det er samsvar mellom sertifikatets domenenavn og nettsidens domenenavn.
    2. Webtjeners offentlige nøkkel kan så benyttes til kryptert kommunikasjon fra klient til webtjener.

![[Pasted image 20241016154112.png]]

## Video Streaming
#video-streaming

![[Pasted image 20241016154149.png]]


### Videostreaming - utfordringer

**Multimedia**

- **Video**: 57% av trafikken på Internett
  - Netflix alene utgjør 30% i USA

- **Nedlasting**:
  - Hele innholdet lastet ned til lokal maskin.

- **Streaming**:
  - En konstant strøm av data (til avspilling slutter)
  - Lettere å ta vare på opphavsrett
  - Lite lokal lagring
  - Sparer nettverksressurser
    - Brukes bare for det av innholdet som blir sett
  - UDP eller TCP?

- **Nettverksutfordringer**:
  - Forsinkelse, tap, variasjoner i leveringstid ("jitter")
  - Jitter kompensasjon
  - Tapskompensasjon
  
![[Pasted image 20241016160029.png|400]]

![[Pasted image 20241016160050.png]]

# IoT Internet of Things

#internet-of-things

- Enheter i daglig bruk / husholdningen / arbeidsprosesser som leverer ekstra tjenester ved hjelp av Internett
- Kan være med på å revolusjonere hverdagen:
  - Automatiske strømmålere
  - Helseapplikasjoner
  - Smarthus / Smartbyer
  - Logistikk
- Snakker med tjenere i "skyen"
- Leverer data som brukes til analyse og tjenestelevering

![[Pasted image 20241016160223.png]]

![[Pasted image 20241016160251.png]]
