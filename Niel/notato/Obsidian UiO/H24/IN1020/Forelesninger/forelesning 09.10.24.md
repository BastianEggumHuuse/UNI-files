### Lag 5 - Applikasjonslaget

- Lag med tjenester for applikasjoner:
- Eksempler:
	- Nettlesere
	- E-post
	- Filoverføring
	- P2P
- Mer om dette 16 okt (tjenester i Internett)

![[Pasted image 20241009142412.png|200]]


### Lag 4 - Transportlaget

• TCP: Tilkoblingsorientert, Pålitelig, flytkontroll og metningskontroll  
• UDP: Tilkoblingsløs og «best-effort»  
• Bruker «port» som en unik identifikator.  
  – Representeres med et 16-bit heltall
  
![[Pasted image 20241009142337.png|400]]

![[Pasted image 20241009142427.png|200]]



### Lag 3 - Nettverkslaget


• Kobler sammen systemene ende-til-ende  
• Ruting  
  – Statisk, definert under tilkobling eller dynamisk  
  – En «ruter» jobber på lag 3  
• Protocol (IPv4):  
  – Bruker 32-bit adresse, (4.3×10^9).   
  – Representeres med fire 8-bit heltall: 192.168.1.101

### Lag 2 - Linklaget

• Pålitelig overføring mellom to enheter.  
  – Pakker som overføres i linklaget kalles «frames»  
  – Feildeteksjon og retting innenfor en «frame»  
• En «switch» vil kun jobbe på lag 2  
• Bruker en 6-byte adresse (48-bit) som ofte er lagret i nettverkskortet  
  – MAC-adresse, brukes både på WiFi og Ethernet.  
  – Hver byte representeres med en heksadesimal verdi: 07:01:02:01:2C:4B  

![[Pasted image 20241009142551.png|300]]

![[Pasted image 20241009142605.png|400]]

### Hva er en IP-adresse  

• Hvordan kan man sende til en annen maskin på tvers av mange små nettverk?  
  • Ved hjelp av adresser som er «unike» på hele Internett  
• Postadresse:  
  – Kristin Skar, Ole Johan Dahls hus, Gaustadalléen 23B, 0373 Oslo, Norge  
• IP-adresse  
  – Tilsvarende prinsipp, men skiller bare mellom adresser innenfor og utenfor det lokale nettverket.  
  – Er adressen på mitt lokale nett?  
    • Ja: Lever pakken rett til mottakeren  
    • Nei: Send til router, som får ansvaret for å sende videre på Internett  

### Lokalnettverk (LAN) og subnett

• Internett er et sammenkobling av mindre, separate nettverk.
• Koblet sammen med switch og/eller HUB (lag 2*)
  – Switch: Filtrerer og videresender.
  – HUB: Videresender det som kommer inn på alle porter.
• For å sende en pakke til en maskin utenfor ditt lokale nettverk, må den sendes til en router som vet hvor den skal videresendes.

![[Pasted image 20241009142757.png|200]]

![[Pasted image 20241009142743.png]]

![[Pasted image 20241009144531.png]]

![[Pasted image 20241009144753.png]]
^ kommer til å få omregnings oppgave på eksamen 100%


![[Pasted image 20241009145031.png]]

![[Pasted image 20241009145342.png]]

![[Pasted image 20241009145400.png]]

![[Pasted image 20241009145638.png]]

### Anatomien til et LAN – et typisk oppsett  

• LAN ID (CIDR): 192.168.0.0/24  
• Kringkastingsadresse: 192.168.0.255  
• Tilgjengelige adresser: 192.168.0.1-192.168.0.254  
  – 254 adresser  
  – ... men 1 av disse settes typisk av til router om du skal koble LAN til Internett  
    • f.eks. 192.168.0.1  
  – Router fungerer ofte også som DHCP-tjener og DNS-cache i hjemmenettverk



## DHCP – Utdeling av IP-adresser

![[Pasted image 20241009152751.png]]
![[Pasted image 20241009152807.png]]
![[Pasted image 20241009152818.png]]
![[Pasted image 20241009152826.png]]

## ARP – Koblingen mellom nettverk- og link-laget

ARP – Koblingen mellom nettverk og IP  
• Nettverkskortene har en 6 byte lang media access control (MAC)-adresse som brukes til å identifisere maskinen innenfor et kringkastingsdomene (broadcast domain).  
• For at IP skal fungere, må avsenderen vite hvilken MAC-adresse pakken skal sendes til.  
• Address Resolution Protocol (ARP) kobler IP (Internett) og MAC (Linklaget).


![[Pasted image 20241009153454.png]]

![[Pasted image 20241009153504.png]]
![[Pasted image 20241009153513.png]]
![[Pasted image 20241009153521.png]]
![[Pasted image 20241009153534.png]]

![[Pasted image 20241009153602.png]]

![[Pasted image 20241009153614.png]]


## Porter & NAT 

![[Pasted image 20241009153640.png]]

![[Pasted image 20241009153732.png]]
![[Pasted image 20241009153740.png]]
![[Pasted image 20241009153752.png]]
![[Pasted image 20241009153900.png]]
![[Pasted image 20241009153942.png]]
![[Pasted image 20241009153952.png]]

## Ruteren sin oppgave i nettet

Ruting i Internett (svært kort)  
• Målet for ruting: å videresende en datapakke slik at den til slutt når måladressen sin.  
• En Internet Service Provider (ISP) driver et nettverk og leverer datatransport til andre ISPer og sluttbrukere.  
• ISP Peering er når ISPer inngår avtaler om å videresende hverandres trafikk. Økonomiske prinsipper er da med på å bestemme hvor trafikken flyter.  
• Border Gateway Protocol (BGP) – Rutingprotokoll som brukes mellom ISPer. Store selskaper kan også bruke BGP.  
• OSPF – eksempel på rutingalgoritme for mindre nettverk. Bygger et kart over mulige ruter til måladressene. Skalerer ikke for store nettverk.

![[Pasted image 20241009154032.png]]


### Traceroute – viser deg hvor trafikken går  
• Kommandoen "traceroute" (tracepath på UiO Linuxmaskiner) bruker en protokoll som heter "Internet Control Message Protocol" (ICMP) til å spore hvor datapakkene er innom på veien til målet.

![[Pasted image 20241009154047.png|400]]

## Transportlaget

![[Pasted image 20241009154144.png]]
![[Pasted image 20241009154155.png]]
![[Pasted image 20241009154202.png]]
![[Pasted image 20241009154212.png]]
![[Pasted image 20241009154230.png]]

![[Pasted image 20241009154247.png]]

![[Pasted image 20241009154255.png]]
![[Pasted image 20241009154303.png]]
