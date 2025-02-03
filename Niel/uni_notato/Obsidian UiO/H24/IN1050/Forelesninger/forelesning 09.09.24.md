


### Nøkkelbegreper fra dagens forelesning

- Behov 
- Krav  
- Funksjonelle og ikke-funksjonelle krav 
- Personas  
- Scenario  
- Domene




#### Krav og behov

- ##### Systemer
	- Faglige begreper
	- Teknisk språk
	-> **Krav** stilles til maskiner
	
- ##### Brukere
	- Løsrevet fra spesifikke teknologier eller andre mennesker
	- Dagligdags, ofte ikke-teknisk, språk
	-> **Behov** avdekkes hos mennesker

### Behov innen HCI og UCD

- **Behov** beskriver hva vi som mennesker - helt fundamentalt - trenger i livet.
- Frikoblet fra konkrete teknologiske løsninger - hjelper oss med å forstå menneskers grunnleggende/iboende atferd og motivasjon.
- Kontekstualiserer underliggende motivasjon for ønsker, verdier, preferanser etc. og er uavhengig av teknologi og andre mennesker
- Mye av vår forståelse rundt menneskelige behov er lånt fra psykologien (f.eks. Maslows behovspyramide).

**Eksempler på behov:**
- Trygghet
- Informasjon
- Mestring
- Forflytning
- Kommunikasjon
- Tilbakemelding
- Sosialisering
- Selvrealisering

![[Pasted image 20240909144611.png | ]]


#### Vi må grave for å avdekke underliggende behov

- Vi blir ofte så opptatt av løsningen i seg selv og de umiddelbare funksjonene som tilbys at vi glemmer «hvorfor»-spørsmålet.

- En vanlig teknikk benyttet under datainnsamling for å grave er «5 Whys».

- Problem: hodetelefonene til mobiltelefonen min fungerer ikke. 
- 1. hvorfor? – fordi ledningen er ødelagt. 
- 2. hvorfor? – fordi kablingen i ledningen er ødelagt.
- 3. hvorfor? – fordi det er oppstått brudd på jordingskabelen. 
- 4. hvorfor? – fordi det er slitt, bøyd og strukket for mye på hodetelefonene. 
- 5. hvorfor? – fordi de er kveilet sammen og lagt i bukselommer over lang tid.


### Krav
#Krav
- **Krav** beskriver funksjoner eller egenskaper til et system, en tjeneste, eller en løsning.
- Innen HCI er krav altså noe vi stiller til systemer – og ikke noe vi snakker om at brukerne har (de har sine behov).
- Krav er ofte koblet til spesifikke teknologier eller andre mennesker: plattformer, strategier, teknologier, enheter etc.
- Krav er ment å kunne forstås av utviklere: gir dem føringer på hvilke funksjoner og egenskaper som ønskes.
- Krav lider ofte av utydelighet, tvetydighet eller mangelfullhet.
- Er de noen gang enstydige og heldekkende?


### Hvordan komme seg fra behov til krav?

Hva ønsker vi og oppnå?
- Forstå mest mulig om bruk, brukere, bruks kontekst og oppgavene som skal løses.
- Etablere et stabilt sett med krav

Hvordan kan vi oppnå dette?
- Datasamlingsaktiviteter
- Analyse av data
- Formulere uttrykk og beskrivelser som "krav".
- Iterative prosesser med brukere og andre interessenter. 


##### **Etablering av krav: typiske spørsmål å stille seg**

**Hva ønsker brukerne å oppnå?** → hva har de behov for?

- Hva er brukernes ønsker?
- For hvilke brukergrupper eller aktører gjelder dette?
- Gjelder deres ønsker kun i henhold til oppgave, aktivitet, mål etc. eller alt de foretar seg?
- Uansett underliggende behov så er det vår jobb å klargjøre, fullføre, omstrukturere (→ etablere) før det kan kalles krav.

**Hvorfor «etablering»?**

- Krav binder ofte sammen flere ulike behov som kun kan forstås i sin brukssammenheng, dermed «oppstår de».
- Vi henviser ofte til innsamlet data og bruker dataen til å rettferdiggjøre og forankre kravene → dataen etablerer.


**Ulike typer krav**

- Funksjonelle krav
- Ikke-funksjonelle krav
- Krav til omgivelser
- Datakrav
- Sosiale krav
- Organisatoriske krav
- Brukerkrav



##### **Funksjonelle og ikke-funksjonelle krav**

**Funksjonelle krav**

- Krav som sier noe om hva systemet skal kunne gjøre.
- Absolutt formulert: «ja/nei».
- Hvilke funksjonaliteter (og atferd) skal systemet ha?
- «Mobiltelefonen skal kunne lades trådløst» / «Mobiltelefonen skal kunne avspille musikk»

**Ikke-funksjonelle krav**

- Krav som sier noe om hvordan systemet skal utføre sine funksjoner (dvs. kvaliteten på utførelsen).
- Målbart formulert: «hvor godt»
- Hvilke kvaliteter og egenskaper skal systemet ha?
- «Mobiltelefonen skal ha en responstid på under 100ms ved ansiktsgjenkjenningsinnlogging» / «Mobiltelefonen skal ikke veie mer enn 200g»


**Andre krav: omgivelser, sosiale, data, organisatoriske**

**Krav til omgivelser**

- Er det forhold ved omgivelsene som kan gi opphav til krav?
- «Mobiltelefonen skal være vanntett» / «Mobiltelefonen skal tåle støt/risting»

**Datakrav**

- Kan hvilken data som samles inn eller hvordan det lagres gi opphav til krav?
- «Mobiltelefonen skal kryptere lokalt datainnhold» / «Mobiltelefonen skal ikke dele personlig informasjon med tredjepartsaktører»

**Sosiale krav**

- Er det sosiale elementer ved bruken eller brukskonteksten som kan gi opphav til krav?
- «Mobiltelefonen skal kunne brukes av flere individer» / «Mobiltelefonen skal støtte samtaler med mennesker på andre siden av jorda»

**Organisatoriske krav**

- Har organisasjonen hierarkiske, infrastrukturelle, holdningsmessige, sikkerhetsmessige eller andre type føringer som kan gi opphav til krav?
- «Mobiltelefonen skal be om at ny sekssifret sikkerhetskode opprettes hver måned» / «Mobiltelefonen skal være fri for konfliktmineraler»

(^ - Glir ofte over i hverandre og som regel er de generalisert som funksjonelle eller ikke-funksjonelle krav.)




## Eksempler på ulike type krav: Zoom som case
#type_krav 

**Funksjonelle krav:**

- Systemet skal støtte samtaler en-til-en.
- Systemet skal støtte fellesmøter i sanntid.
- Systemet skal støtte deling av skjerm.
- Systemet skal støtte deltagelse via telefon.

**Ikke-funksjonelle krav:**

- Systemet skal støtte overføring video med en båndbredde på 1.5 Mbps.
- Systemet skal støtte skjermdeling med oppløsning på 1080p.
- Systemet skal støtte sanntidsamtaler med maksimalt 100ms forsinkelse.


**Hva med andre type krav som vi kan uttrykke som funksjonelle eller ikke-funksjonelle krav?**

- Krav til omgivelser
- Datakrav
- Sosiale krav
- Organisatoriske krav
- Brukerkrav


### **Personas**
#Personas
- Personas beskriver brukerkarakteristikken til en fiktiv bruker som er ment å representere en gruppe brukere.
- Som regel holder man seg til 1-4 personaer for å dekke de mest interessante brukergruppene.
- Vi har som oftest en primær persona blant de få vi lager.
- Beskriver ikke reelle personer, men personas skapes som regel fra reelle personer.
- Bringes til live ved å gi dem navn, mål, karakteristikker, bakgrunn etc.
- Må ikke idealiseres til å anses som 100 % perfekte, nøyaktige eller representative.



### **Scenario**
#scenario

- Et scenario er en uformell, narrativ fremstilling av en brukssituasjon hvor en problemstillingen eller foreslått løsning står i sentrum.
- Scenarioer skal være enkle, naturlige, personlige og ikke generaliserbare → de skal vise til en bestemt brukssituasjon.
- Er ment både til å kommunisere og til å frembringe kritisk refleksjon blant designere som vurderer brukssituasjonen.
- Brukes på ulike måter og finnes i ulike varianter, men vi konsentrerer oss om to typer:


**Scenario til fremstilling av et problem:**

- Tekstlig scenario for å beskrive hvordan en problemstilling typisk utfolder seg og oppgaver som inngår.
- Benyttes for å skape en illustrativ fremstilling som folk flest kan relatere seg til og som kommuniserer godt.
- Det er ikke meningen at scenarioet skal forsøke å løse problemet eller forslå løsninger til problemet.

**Pluss- og minusscenarioer:**

- Et forsøk på å fremstille de mest positive/negative konsekvensene ved en foreslått løsning.
- Brukes stort sett av designere for å danne seg helhetlige bilder av brukssituasjonen de ser for seg.


**Domene**

- Vi designer ofte for spesifikke brukskontekster hvor god innsikt krever domenekunnskap.
- For å skape gode brukeropplevelser må vi enten sette oss inn i domenet eller hente inn domeneeksperter.
- Ofte er ikke løsninger overførbare mellom domener.
- Domene → et felt eller omfang av en bestemt kunnskap eller aktivitet.
- Domenekunnskap → kunnskap innenfor et bestemt domene.
- Domeneekspert → en ekspert innenfor et gitt domene.

### **Hvordan bruke datainnsamling til å etablere krav (1)**

**Intervjuer**

- «Props»: vi bruker gjerne rekvisitter og typiske gjenstander som en del av intervjuet for å forstå underliggende behov.
- Intervjuer er godt egnet til å utforske forhold og få oversikt.
- Kan brukes til å knytte relasjoner til deltagere og aktører som kan være relevante å inkludere senere.

**Fokusgrupper**

- Utføres som regel som gruppeintervjuer.
- Fokusgrupper er godt egnet til å oppnå konsensus og/eller for å belyse og fremprovosere sensitive forhold eller konflikter.
- Kan ofte medføre at enkeltpersoner dominerer



#### **Hvordan bruke datainnsamling til å etablere krav (2)**

**Spørreskjema**

- Brukes gjerne i kombinasjon med andre teknikker (husk triangulering).
- Kan gi oss både kvalitativ og kvantitativ data.
- Spørreskjemaer er godt egnet til å få tak i svar på spesifikke spørsmål fra en større og spredt populasjon.

**Studier av liknende løsninger**

- Brukes som oftest når vi ønsker å forbedre et eksisterende system fremfor å introdusere noe helt nytt.
- Krever at vi har kjennskap til eksisterende liknende løsninger i en tidlig fase.
- Denne typer studier gir oss et godt grunnlag for å sammenlikne og utlede krav


#### **Hvordan bruke datainnsamling til å etablere krav (3)

Direkte observasjon

- Vi får innsikt i brukernes faktiske oppgaver og omstendigheter.
- Direkte observasjon er godt egnet for å danne seg et helhetlig inntrykk av brukerens situasjon og brukskontekst.
- Krever svært mye tid kan fort lede til store mengder data. 

Indirekte observasjon

- Indirekte observasjon egner seg godt til å få en oversikt over eksisterende oppgaver, rutiner, aktiviteter etc. 
- Brukes sjeldent alene i kravetablering, men kan gi støttedata som supplerer annen innsamlet primærdata (husk triangulering).

#### **Hvordan bruke datainnsamling til å etablere krav (4)**

**Dokumentstudier**

- Vi får ofte tak i prosedyrer, regler og rutiner ved å se på manualer, instrukser, guider etc.
- Dokumentstudier er godt egnet til å forstå stegene som inngår i en aktiviteter…
- …samt hvilke regler og retningslinjer som regulerer aktiviteten.
- Bør ikke brukes isolert (husk triangulering).
- Hjelper oss med å forstå relevant lovgivning og nødvendig bakgrunnsinformasjon.
- Krever ikke tid fra deltagere!


#### **Utfordringer ved datainnsamling (1)**

- Når vi samler inn data – uavhengig av metoder og teknikker vi velger – må vi være oppmerksomme på en del utfordringer
- Hvem er interessentene (stakeholders)? → hvem andre enn brukeren vil kunne mene om kravene til løsningen?
- Hvem kan vi engasjere i en UCD-prosess og hvordan? → når, hvor og hvordan bør vi gå frem?
- Hvordan kommer vi tettest på «ekte» brukere og ikke ledere, administrativt ansatte og andre ikke-brukere? Proxy-brukere?
- Hvordan involverer vi deltagere uten at maktbalansen blir skjev og noen dominerer prosessen?
- Er det økonomiske eller organisatoriske forhold vi bør være kjent med som kan påvirke datainnsamlingen?


#### **Utfordringer ved datainnsamling (2)**

- Hvordan skal vi kommunisere mellom partene?
    - Innen design- og utviklings teamet
    - Mellom designer og bruker
    - Mellom brukere (ofte ulik terminologi selv innad i en bedrift)
    
- Hvor godt kjente er vi og brukerne med domenet og terminologi?
- Hvor god er tilgangen på faktiske brukere og nøkkelpersoner?



#### *Oppsummering*

- Krav og behov må ikke forveksles!
- Det å etablere gode, entydige krav er viktig for både designer og utvikler – og IT-prosjekter bommer ofte på krav.
- De vanligste datainnsamlingsmetodene for å etablere krav er intervju, spørreskjema, observasjon og fokusgruppe.
- Vi kan bruke personas og scenarioer for å artikulere og kommunisere eksisterende og fremtidige løsninger.

