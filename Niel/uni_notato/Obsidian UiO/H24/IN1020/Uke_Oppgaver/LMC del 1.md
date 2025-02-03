##### *Oppgave 1*

Ta utgangspunkt i programmet som legger sammen to tall, vist på forelesning. Endre programmet så det legger sammen tre tall. Vis programmet både som tallkoder og assemblerkode.
-         inp
        sta tall_a
        sta sum
        inp
        sta tall_b
        add sum
        sta sum
        inp
        sta tall_c
        add sum
        sta sum
        out
        hlt
	tall_a  dat 0
	tall_b  dat 0
	tall_c  dat 0
	sum     dat 0

##### *Oppgave 2* 

Ta utgangspunkt i det samme programmet, men endre det slik at det bare leser ett tall og skriver ut det dobbelte av tallet. 
	***Hint:*** Hvordan dobler man et tall når man ikke har noen multiplikasjonsinstruksjon?

        inp
        sta tall_a
        add tall_a
        out
        hlt
	tall_a  dat 0

##### *Oppgave 3 (I/O)*

Lag et program som leser inn et tall, lagrer det (STA) i en minnecelle, og så:
1. Skriver ut tallet med LDA og OUT (som desimaltall).
2. Skriver ut tallet med LDA og OTC (som et ASCII symbol).

-         inp
        sta tall_a
        lda tall_a
        out
        OTC 
        hlt
	tall_a  dat 0

Modifiser så programmet slik at det ikke leser inn et tall, men heller skriver ut et forhåndslagret symbol fra ASCII tabellen med OTC. Velg et symbol fra tabellen selv!
	Dersom man blir inspirert går det an å skrive ut selveste ”Hello, world!” før man etter god programmeringspraksis avslutter med HLT.



##### *Oppgave 7 (Absoluttverdi)*

Skriv et program som leser inn et tall. Hvis tallet er positivt, skal det skrives ut uendret. Hvis tallet er negativt, skal det gjøres om til det tilsvarende positive tallet.

![[Pasted image 20240912154334.png]]

        inp
        sta verdi
        brz start
        out
        hlt 
	start   sub verdi
        sub verdi
        out
        hlt
	verdi   dat 0
