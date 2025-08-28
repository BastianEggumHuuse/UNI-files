
![[Pasted image 20241004102110.png]]
![[Pasted image 20241004102058.png]]![[Pasted image 20241004102122.png]]

**Nettverksstrukturer**

**Punkt-til-punkt nettverk:**

- Flere forskjellige kabler, kabeltyper eller radiolinker som kommuniserer fra punkt til punkt.
- Kabel eller radiolink kobler alltid sammen to noder.
- En-til-en overføring.

**Topologieksempler:**
- Punkt-til-punkt-forbindelser danner basisen for flere nettverkstopologier, som stjerne-, mesh- og ringnettverk.

(Viktigst: Tree-topologie)
![[Pasted image 20241004102147.png]]


#### Nettverksstrukturer

**Broadcast-nettverk**

- **Definisjon:**
  - Nettverk som deler kommunikasjonsmedium.
  - En sender, alle lytter (en-til-mange).

- **Bruk:**
  - **Trådløs:** Eneste mulighet (mobiltelefoni (4G, 5G), satellitter, radio, WiFi, ...)
  - **Kablet:** Gamle nettverk (Coax, Token ring)

- **Topologieksempler:**
  - Buss-topologi
  - Trådlaus LAN (WiFi-nettverk)
  - Satellittkommunikasjon



### Protokoller og lagdeling

**Hva er en protokoll, og hvorfor trenger vi det?**

- **Definisjon:**
  - En protokoll definerer strukturen på beskjeder som sendes over et nettverk.

- **Behov for protokoller:**
  - Adresserer mange kompleksiteter, for eksempel:
    - Hvordan skal maskinvaren oppføre seg?
    - Hvordan skal beskjeden finne frem?
    - Er det noen garantier for levering?
    - Hvordan håndtere kø, tap og andre problemer?


![[Pasted image 20241004104042.png]]

![[Pasted image 20241004104545.png]]

![[Pasted image 20241004104717.png]]
![[Pasted image 20241004104731.png]]
![[Pasted image 20241004104749.png]]

### Fem-lags referansemodellen – TCP/IP modellen

**Forskjell på TCP/IP modellen og ISO-OSI**

- **Sammenslåing av lag:**
  - Presentasjon-, sesjon- og applikasjonslagene i ISO-OSI-modellen slås sammen til ett lag i TCP/IP-modellen (kalt applikasjonslaget).

- **Nettverksgrensesnitt:**
  - Avhengig av hvem du spør, slås også linklaget og det fysiske laget sammen til ett lag i TCP/IP-modellen, ofte kalt nettverksgrensesnittet eller nettverktilgangslaget.

![[Pasted image 20241004111816.png]]

### Dataenheter i TCP/IP-modellen

**Data Units og Lagnavn**

- **"Beskjeder" fra applikasjonslaget defineres som "data units".**
- **Data units har forskjellige navn, avhengig av hvilket lag vi befinner oss i:**
  - **Segments:** Brukes på transportlaget (kan inneholde fragmenter)
  - **Packets:** Brukes på nettverkslaget
  - **Frames:** Brukes på linklaget
  - **Bits:** Brukes på det fysiske laget

![[Pasted image 20241004112524.png]]
![[Pasted image 20241004112542.png]]
![[Pasted image 20241004112555.png]]


### Lagene i TCP/IP-modellen

![[Pasted image 20241004112645.png]]
![[Pasted image 20241004112657.png]]
![[Pasted image 20241004112705.png]]
![[Pasted image 20241004112718.png]]
![[Pasted image 20241004112730.png]]
![[Pasted image 20241004112739.png]]
![[Pasted image 20241004112747.png]]
![[Pasted image 20241004112755.png]]
![[Pasted image 20241004112814.png]]
![[Pasted image 20241004112831.png]]
![[Pasted image 20241004112845.png]]
![[Pasted image 20241004115800.png]]


### Lag 1 – Det fysiske laget

**Signalrepresentasjon av bits**

- **Hovedpunkter:**
  - Sørger for at 1-bit også blir mottatt som 1-bit (og ikke et 0-bit).

- **Mekanikk:**
  - Koblingstype, kabler/medium.

- **Elektronikk:**
  - Spenning, bit-lengde.

- **Formelle regler for kommunikasjon:**
  - Enveis (unidirectional) – Half-duplex.
  - Toveis (bidirectional) – Full-duplex.
  - Hva skal markere starten og slutten på overføringer.

- **Eksempler:**
  - RS-232-C
  - 1000BASE-X

![[Pasted image 20241004115839.png]]

![[Pasted image 20241004115854.png]]



**Ekstramateriale:**

- **Bøker og artikler:**
  - **Andrew S. Tanenbaum:** *Computer Networks* (5th edition), 2010. Prentice Hall International Edition
  - **James F. Kurose, Keith W. Ross:** *Computer Networking: A Top-Down Approach* (6th edition), 2012. Pearson
  - **TCP/IP modellen:** [Wikipedia - Internet Protocol Suite](https://en.wikipedia.org/wiki/Internet_protocol_suite)