
##### ***Oppgave 1***

Skriv et program for LMC som leser inn to positive tall a og b og så beregner a mod b, dvs resten vi får når vi deler a med b. *(I Python skriver vi dette a%b.)* Hvis for eksempel brukeren skriver inn tallene 22 og 5, skal svaret bli 2. 
	***Hint:*** For å finne resten, må vi trekke fra b mange ganger til vi kommer under 0. Så må vi legge til b igjen for å få den riktige resten. I eksempelet over vil vi få følgende verdier:

        inp
        sta tall_a
        inp
        sta tall_b
	start   lda tall_a
        sta tall_c
        lda tall_a
        sub tall_b
        sta tall_a
        brp start
        lda tall_c
        out
        hlt
	tall_a  dat 0
	tall_b  dat 0
	tall_c  dat 0

