
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

Diffie-Hellman genererer en midlertidig sesjonsnøkkel som ikke lagres. Selv om en angriper får tak i de langsiktige private nøklene senere, kan de ikke rekonstruere denne tidsbegrensede sesjonsnøkkelen. Offentlige/private nøkkelpar gir ikke dette fordi den private nøkkelen er statisk - hvis den stjeles, kan angriperen dekryptere all tidligere kommunikasjon som ble kryptert med den tilsvarende offentlige nøkkelen.

Oppgave 4:

Oppgave 5:

alert tcp any any -> 10.0.23.23 3389 (msg:"RDP til ip 10.0.23.23")


