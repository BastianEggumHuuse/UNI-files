
#### I.
UniKunn har et stort ansvar for gjennomføringen av digitale eksamener, inkludert håndtering av brukeridentiteter, autentisering og tilgangsstyring for både studenter, faglærere og sensorer. På bakgrunn av dette vurderes UniKunns risikoappetitt som lav. Det er derfor hensiktsmessig å sette terskelnivået for akseptabel risiko til 5 på skalaen fra 4 til 7. Dette nivået reflekterer at kun risikoer med lav eller moderat alvorlighetsgrad tolereres, og at det skal iverksettes tiltak for å redusere risiko som overstiger dette nivået.

#### II.

Antatt "Snarest" hendelsesfrekvens (S), representert ved et kvalitativt sannsynlighetsnivå 5 (høyeste). Det velges en frekvens på fire ganger i året, basert på at det gjennomføres en eksamens periode per semester med to semesterper år (ordinær eksamen og konte-eksamen). En kompromittert eksamen regnes som én hendelse. 

Antatt "Verst tenkelig" konsekvens (V) på nivå 5, som tilsvarer et kvantitativt tap på 1 milliard kroner (Siden jeg antar at UniKunn har flere kampuser enn UiO). For UniKunn representerer dette hele virksomhetens verdi, noe som innebærer at selskapet vil gå konkurs.


#### III.
 - ##### Beskriv en trussel som anses mest relevant 

	A. Scenarioet er at studenter finner en mulighet til å få tilgang til professor/faglærerens bruker. Får deretter tilgang til eksamens oppgaver der etter laster de ned/kopierer de oppgaver og sprer materialet videre. Sterkt press for gode resultater kan trigge en slik hendelse og motivet er å få bedre karakterer på eksamen.

	B) Angrepet skjer ved at en aktør får uautorisert tilgang til vurderingssystemet eller lærers konto og endrer karakterdata. Motivet kan være å endre på karakterer ved brudd på integritet.

	C) Eksamenstakere (Studenter) kan bli nektet tilgang til eksamens "servere" under eksamen ved DDoS-angrep. 

 - ##### Beskriv sårbarhet(er) og hendelse (brudd på sikkerhetsmål). 
 
	A) Om faglerere har dårlige vaner med opprettelser/bruk av password. Svake eller gjenbrukte passord med manglende flerfaktorautentisering. Trusselaktøren kan da få tilgang til informasjon og tilgang til eksamensfiler.

	B) Ved svakheter hos databasen kan trusselaktørene endre karakterer uten ordentlig validering. Kanskje ved manglende integritetsbegrensninger og dårlig vedlikehodl av logging gjør dette mulig uten å bli oppdaget.

	C) Eksperas systemer kan være sårbare for DDoS-angrep, som kan føre til at eksamenstakere mister tilgang til systemet under eksamen.

 - ##### Hvilke verdier er berørt? Hvilke sikkerhetsbrudd oppstår?

	A) De verdiene som er berørt er eksamensoppgavene, vurderingsprosessen, og institusjonens tillit og omdømme. Sikkerhetsbruddet som oppstår er et brudd på konfidensialitet, ettersom eksamensmaterialet blir gjort tilgjengelig for uvedkommende før eksamen. Dette fører til at ett av de grunnleggende sikkerhetsmålene i KIT brytes. I tillegg kan integritet delvis påvirkes dersom oppgavene blir endres eller manipuleres, og i tillegg tillit til vurderingssystemet svekkes.

	B) Sikkerhetsbruddet som oppstår er et brudd på integritet, siden data kan endres uten  autorisasjon. Dette bryter ett av sikkerhetsmålene i KIT igjen og nemlig integritet, i motsetning til risiko A, der bruddet primært var på konfidensialitet (eksamensoppgaver lekket før eksamen).

	C) Berørte verdier er tilgjengelighet siden Eksamenstakere vil bli nektet tilgang for å  besvare/utføre eksamen.

 - ##### Mulige negative konsekvenser?
 
	A) Som nevnt så kan mulige negative konsekvenser være tap tillit for utdanningsinstitusjonen, samt svekket troverdighet i vurderingssystemet. Det kan føre til juridiske konsekvenser for de involverte trusselaktørende, og økede kostnader for å lage nye eksamensoppgaver og styrke sikkerhetstiltak.

	B) Ved lik linje som risiko A så kan begge skade omdømme og tap av tillit til selve vurderingssystemet. I forhold til risiko A gir primært urettferdig fordeler.

	C) Tap av tillit og tid til Eksamenstakere. Siden eksamen ikke kan gjennomføres med fører det til liten grad av økonomiske tap for UniKunn.

 - ##### Hva gjør hendelsen mindre sannsynlig?
 
	A) Tiltak som reduserer sannsynligheten kan være flerfaktorautentisering, sterke og unike passord. Strengere tilgangskontroll på dokumenter og bruk av fil overvåking. Gode sikkerhets vaner samtidig sikkerhetsopplæringer for ansatte.

	B) For å redusere sannsyligheten til hendelsen kan man få strengere tilgangskontroller eller justere rollebaserte tilgang. Bedre database integritet som gjør det vanskelig å gjennomføre uautoriserte endringer.

	C) Hendelsen blir mindre sannsynlig ved bruk av DDoS-beskyttelse og trafikkfiltrering som stopper unormal trafikk. Overvåking av nettverket gjør at angrep kan oppdages tidlig, og flere servere eller skytjenester gjør systemet mindre sårbart hvis et angrep skjer.

 - ##### Hva gjør konsekvensene mindre alvorlig? 
 
	A) Konsekvensene blir mindre alvorlige dersom institusjonen har evnen til å tidelig oppdage og varsling ved lekkasje av eksamensoppgaver. Med raskt eksamens oppgave utbytte reduserer konsekvensene betydelig.

	B) Ved å sikre backups kan med gjenopprette de orginale umanipulerte karakterdata. 

	C) For å redusere konsekvensene kan de rask utsette eller gjenoppta eksamen for å reduserer  konsekvensene for studenter. 

 - ##### Automatisk beregne kvantitativ risiko, som funksjon av kvalitativ sannsynlighet og konsekvens, S og V. 
 
	A) Konsekvensene blir mindre alvorlige dersom institusjonen har evnen til å tidelig oppdage og varsling ved lekkasje av eksamensoppgaver. Med raskt eksamens oppgave utbytte reduserer konsekvensene betydelig.

	B) Ved å sikre backups kan med gjenopprette de originale umanipulerte karakterdata. 

	C) For å redusere konsekvensene kan de rask utsette eller gjenoppta eksamen for å reduserer konsekvensene for studenter. 

 - ##### Hvordan kan vi oppdage denne type hendelse?
 
	A) Som nevnt så kan bruk av overvåking av pålogginger og filtilgangen hjelpe om det blir automatisk varsles. Er usikker på hvordan man kan oppdage uvanlige mønstre ved faglærerens bruk av filer.  

	B) Gjennom NIDS som overvåker trafikk til og fra databasen kan fange opp uvanlige mønstre eller mistenkelige forespørsler (som direkte endring av karakter). Kan varsle ved tegn på uautorisert tilgang. 

	C) Denne typen hendelse kan oppdages gjennom overvåking av nettverks trafikk som viser unormal eller høy belastning på systemet. DDoS-varsler fra sikkerhetssystemer eller sky-tjenester kan gi tidlig indikasjon på forekommende angrep.

 - ##### Hvilke relevante momenter påvirker sannsynligheten? 
 
	A) Sannsynligheten avhenger av hvor gode passordregler som brukes og om flerfaktorautentisering er aktivert. Risikoen øker dersom passord deles, opplæringen er mangelfull. Derfor mener jeg at sannsynligheter er høy (4).
	
	B) Relevante momenter som påvirker sannsynligheten er sikkerheten I databasen,passordrutiner, bruk av flerfaktorautentisering. Antatt at disse tiltakene ikke fungerer godt regnes sannsynligheten som høy (4)
	
	C) Hvis Experas systemer har usikker troverdighet for denne risikoen, vurderes sannsynligheten som sannsynlig (3).

- ##### Hvilke konsekvensaspekter er relevante? 

	A) Relevante konsekvensaspekter er omdømme, rettferdighet i vurdering, og driftsmessige kostnader. Et brudd kan gi moderat til høy omdømmeskade, høy faglig konsekvens for eksamenens troverdighet, og moderat økonomisk belastning for å lage nye oppgaver og håndtere saken. Samlet vurderes den helhetlige konsekvensen som høy. (4)
	
	B) Ganske likt på risiko A. Integritet I databasen, tillit til vurderingssystemet, omdømme, høy faglig konsekvens og økonomiske kostnadder. (4)
	
	C) Hvis serverne blir utsatt for DDoS-angrep, vil eksamen kun kunne utsettes noen få dager,  noe som anses som relativt ufarlig. Derfor vurderes konsekvensen som moderat (2).

![[Pasted image 20251030213109.png|800]]


#### IV.

![[Risikomatrise.png]]

- Risiko A: Handler om at noen kan stjele eksamensoppgaver før eksamen. For å forebygge dette bør man innføre flerfaktorautentisering og sterke passord for alle faglærere, noe som gjør det reduserer sårbarheter. Dersom noe likevel skulle skje, vil overvåking av filtilganger varsle umiddelbart, og da tidlig bytte ut eksamensoppgavene.
- Risiko B: Handler om trusselaktør som skal endre karakterer uautorisert. Databasen bør håndteres med streng tilgangskontroll til karakterdatabasen og rutinemessige sikkerhetskopier. Enhver endring loggføres og overvåkes. Dersom noen manipulerer data, kan man raskt gjenopprette originale karakterer fra sikkerhetskopiene. Dette minimerer både muligheten for å gjøre endringer og skaden av eventuelle endringer som likevel skulle oppstå.
- Risiko C: Er om mulig angrep som kan forstyrre eksamensavviklingen håndteres med DDoS-beskyttelse som filtrerer bort skadelig trafikk. Systemene overvåkes kontinuerlig for å oppdage unormal aktivitet. I det tilfellet at systemet blir angrepet og går likevel ned, har god kapasitet for å utsette eller gjenoppta eksamen raskt, slik at ingen studenter blir urimelig berørt.