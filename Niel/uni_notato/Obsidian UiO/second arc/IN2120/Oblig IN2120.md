Hei Bob,

Jeg håper dette brevet har nådd deg trygt, og at du har klart å dekryptere innholdet. Jeg beklager virkelig hemmeligholdet, men jeg mistenker at kommunikasjonen vår blir overvåket av den såkalte Bjørne Tjenesten eller B-tjenesten. Jeg er usikker på hvor godt du har blitt orientert om dette, men jeg kan ikke utdype noe mer før jeg vet at jeg kan stole på at du er den du sier du er. Neste del er kryptert med en symmetrisk krypteringsnøkkel. 

Algoritme brukt: AES
Modus: CTR
IV: 0000000000000000000000000000000

Nøkkelen er en hash av navnet til den beste Pokémonen. Denne er hashet med MD5.
Dersom du av en eller annen grunn er usikker på hva den beste Pokémonen heter så har du noen alternativer under:

- Charizard
- Pikachu
- Vulpix
- Dragonite
- Mew

Spørsmål:
1. Hva er nøkkelen (navnet på Pokémonen i klartekst)? Mew
2. Forklar veldig kort om en ulempe av å bruke symmetrisk kryptering

Begge partene deler en hemmelig nøkkel hvor de både krypterer og dekrypterer data. Under symmetrisk kryptering så vet man ikke hvem som har sendt hva. Nøkkelen kan bli stjålet og deretter er all dataen som er kryptert med den nøkkelen, tilgjengelig. 


Mew som input i MD5:
6dbe44626a81716e8e1ed88beebb1aec

------------

Nå som jeg er trygg på at du faktisk er Bob.

Eller, nesten helt trygg. Litt trygg. Relativt sett.

Så tenker jeg at jeg kan dele litt mer informasjon med deg. Jeg har nemlig fått tak i et passord, men det eneste problemet er at det er lagret som en hash, så jeg får ikke brukt det slik som det er nå. Det finnes mange måter å knekke et passord på, men jeg har grunn til å tro at brukeren av dette passordet kun har valgt å bruke et enkelt, om ikke litt langt ord som passord. Kan du sjekke dette for meg?
Gå til crackstation.net, her kan du sjekke hashen mot en database av hashede ord, en rainbow table, som kjapt finner ut om passordet finnes i databasen.

Hashen er: 839ab8d3b16e185860afe65666693a96

Spørsmål:
3. Hva er passordet? - Tiramisu
4. Hvilken hashing-algoritme er brukt? Er denne trygg? Hvorfor/hvorfor ikke? Svar kort.
- Nei, siden hashing-algoritmen som blir brukt er MD5 som er sårbar for kollisjonsangrep siden to ulike input gir samme hashverdi.

VIKTIG!
Om du ikke klarte å hente ut passordet så er oppdraget vårt over, og vi må klare oss videre uten deg. Brenn laptopen din, kast telefonen din og glem at vi eksisterer. Du hører aldri fra oss igjen.

Om du mot alle odds klarte å hente ut passordet, så er det (mistenkelig) bra jobbet. Hmm, la oss fortsette.

Jeg klarte å rappe en hemmelig beskjed fra en agent fra B-Tjenesten. Den er kryptert på følgende måte:

Algoritme brukt: AES
Modus: CFB
IV: 0000000000000000000000000000000

Nøkkelen finner du ved å hashe passordet du fant med SHA-256.

- Nøkkel : 5c50122c6c3fdfd869533f347f6e4085629db0cf624ff9e7ee72bfb15ab18277

-----Melding start-----
Hei Doomguy93,
Vedlagt finner du instrukser fra MegaScorpion222. Som du vet er MegaScorpion222 av den gamle skolen, og stoler ikke på moderne krypteringsalgorithmer. Dekrypter med henhold til metodikk beskrevet av vår bon ami Blaise.

Melding fra MegaScorpion222: Mkazxaz zex qkfi zqk rqh erm-zmqiqr rqh iuhjmxp
-----Melding slutt-----

- Agenten vil mote deg ved ifi-dammen ved midnatt

Signert (SHA-256)
ZbaaiIttx64cjlHyTry6SGowypLGQof9EtZTzcewMlkXYLVzW9E9cRuWgUH9RplBY9DPh/Guwj8sT9hiMuXe9nkBLT7UQ+sqEvYBM7PuBdAGHI7zzUcvIK8BxLSI2zoq0QLgVVw9KUMaZgfZus9Uy9AeNGkTkqFipbjYrLlSyRk=

Spørsmål:
5. Hva er kodenavnene til de to agentene fra B-TjenesteN. - Doomguy93 og MegaScorpion222

6. Beskriv kort fire av nøkkelegenskapene til en hashingalgoritme. 
- Kollisjonsresistens: Altså at det er nesten umulig å finne to ulike input som gir samme hash.
- Enveis: Det skal være umulig (eller veldig vanskelig) å finne en input som gir en gitt hashverdi, altså: Finn x slik at hash(x) = h, når du kun kjenner h.
- Effektivt: Det skal være lett å beregne med hashingalgoritme med input data x.
- Komprimering: Det viktig at det blir en konstant størrelse fordi ulike algoritmer tar ulike størrelser gitt en vilkårlig størrelse input så gir den en fast størrelse output.

7. Hvor er utleveringspunktet beskrevet i meldingen inne i meldingen? 
- "Agenten vil mote deg ved ifi-dammen ved midnatt"

8. Hva heter algoritmen som er brukt til å krypteringen til meldingen inne i meldingen? Nevn en måte man kan knekke en slik type kryptering.
- Algoritmen heter vigenere cipher og for å knekke slike krypertinger kan man bruke frekvensanalyser som viser hvilke bokstaver som er mest brukt.

Du og jeg Bob, vi har noe. Ekte partnere liksom. Så jeg har bestemt meg for å stole på deg med en liten hemmelighet om meg selv. Jeg har trust issues..
Kan du, sånn for sikkerhetsskyld, bare sjekke at den meldingen vi stjal er ekte? Agenten sin offentlige nøkkel er:


-----BEGIN PUBLIC KEY-----
MIGeMA0GCSqGSIb3DQEBAQUAA4GMADCBiAKBgG736Li4YEzr1RMh2/BujqPghK2C
2BkX3GN3Ri7cnRDosn+SkJzMw6NjiRWydZU5wVUNRK4J0MuaRPhdEI8ycN1cLXX+
fC8Ps0Em/FYID8CQkDzJNHFkveeem7Vg666n7LbUT9hRbyIgU9eAq254PlYCZjGR
0zcq1jOShbCkINdJAgMBAAE=
-----END PUBLIC KEY-----

Meldingen er signert med RSA, SHA-256. 

Sjekk at den faktisk ble signert av agenten og ikke er blitt tuklet med. Signaturen kommer i Raw-format som ikke er glad i copy/paste, bruk kunnskapen fra workshopen om krypto til å oversette til et passende format. Aner du ikke hva dette betyr kan du spørre en gruppelærer. Pass også på at det ikke er noen tomme linjer bak meldingen som verifiseres.

Spørsmål:
9. Legg inn et skjermbilde med bekreftelse av at meldingen ble signert og sendt av agenten. (Dette er ikke et lurespørsmål, meldingen skal være Verified OK).

![[Pasted image 20250919195115.png]]


10. Signerer man med sin offentlige eller private nøkkel? Forklar kort logikken bak.

Den private nøkkelen er kun kjent for eieren (agenten). Ved å signere med den private nøkkelen, beviser agenten at de er den eneste som kunne ha produsert signaturen. Alle andre kan verifisere signaturen ved å bruke den offentlige nøkkelen. Dette skaper ikke-benektelse - agenten kan ikke nekte for at de signerte meldingen. Det beviser også at meldingen ikke har blitt endret etter signering.