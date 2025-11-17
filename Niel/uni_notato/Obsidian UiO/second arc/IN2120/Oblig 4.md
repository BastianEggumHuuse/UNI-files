
Oppgave 1: Du har en klient A (IP-adresse: 192.168.20.24), som må kunne kommunisere med en FTP-server B (IP-adresse: 192.168.56.23). 

Begge sider må kunne initiere kommunikasjonen. Det står en brannmur mellom disse - lag IP-tableregler som støtter dette.


- iptables -A FORWARD -s 192.168.20.24 -d 192.168.56.23 tcp --dport 21 -j ACCEPT
- iptables -A FORWARD -s 192.168.56.23 -d 192.168.20.24 tcp --sport 21 -j ACCEPT

- iptables -A FORWARD -s 192.168.20.24 -d 192.168.56.23 tcp --dport 20 -j ACCEPT
- iptables -A FORWARD -s 192.168.20.24 -d 192.168.56.23 tcp --sport 20 -j ACCEPT

- iptables -A FORWARD -s 192.168.20.24 -d 192.168.56.23 tcp --dport 20 -j ACCEPT
- iptables -A FORWARD -s 192.168.20.24 -d 192.168.56.23 tcp --sport 20 -j ACCEPT


Oppgave 2:

Brukte wireshark for å finne at Brukeren er silje og passordet er xY688ASSu27 for brukeren er silje.

Oppgave 3:

Diffie-Hellman fremoverhemmelighold ved å generere en midlertidig sesjonsnøkkel som ikke lagres. Selv om en angriper får tak i de langsiktige private nøklene senere, kan de ikke rekonstruere denne tidsbegrensede sesjonsnøkkelen. Offentlige/private nøkkelpar gir ikke dette fordi den private nøkkelen er statisk - hvis den stjeles, kan angriperen dekryptere all tidligere kommunikasjon som ble kryptert med den tilsvarende offentlige nøkkelen.

Oppgave 4:

![[Pasted image 20251114141137.png]]

Jeg tenker å overvåke trafikken som passerer den ytterste brannmuren. I tillegg til å sikre e-post- og webservere, bør man også etablere en domenekontroller for klientene, skrivere, samt trafikken mot databaseservere og filservere. Grunnen er at de fleste angrep skjer i flere faser. En angriper som trenger gjennom brannmuren, vil deretter prøve å bevege seg sidelengs i nettverket for å finne verdifulle mål. 


Oppgave 5:

alert tcp any any -> 10.0.23.23 3389 (msg:"RDP til ip 10.0.23.23")


Oppgave 6: 

IDS er inntrengingsdeteksjonssystemer som forsøker til å oppdage mistenkelige aktiviteter. Det er sensorer som overbevåker og henter ut nettverksdata. Anomalisert basert IDS utløser når en sjelden hendelse oppstår. Siden det ofte er basert på maskinlæring kan det utløse falske alarmer. 

Oppgave 7:

En honeypot er et lokkesystem som etterligner ekte tjenester for å tiltrekke seg angripere. Formålet er å avlede dem fra produksjonssystemer, studere angrepsmetodene deres, og samle inn informasjon om nye trusler uten å sette virkelige ressurser i fare.

Oppgave 8:

En IDS på utsiden av brannmuren fanger opp alle angrepsforsøk, men den jobber hardere og sender også ut varsler om angrep som brannmuren likevel ville ha stoppet. Plasserer du IDS-en på innsiden, varsler den kun om de angrepene som faktisk trenger/har kommet gjennom brannmuren, og den slipper å jobbe like mye.

Oppgave 9:

Alle forsøk på kommunikasjon med disse adressene er illegitim trafikk, og kan derfor tydelig identifiseres som skanning, utforskning eller angrep fra en trussel i nettverket.

Oppgave 10:

Dette sikrer at all kommunikasjon skjer gjennom en kryptert og sikret tunnel, selv på usikker nettverk (som offentlig Wi-Fi). Det gir også kontroll og overvåkning av trafikk, og tilgang til interne ressurser som om man var på kontoret.