#Oppgaven min er å lage en matte quiz. Hvor brukeren må få alle tre oppgavene for å vinne.


#printer ut starten av matte quizet:
print("\nVelkommen til matte quizet ;3")
#Stiller spørsmålet til brukeren
bruker_svar = int(input("1 + 1 = "))

#ser om brukeren har riktig. Hvis de skrev 2 så fortsetter quizet
if bruker_svar == 2:
    print("Riktig!")
    bruker_svar = int(input("5 * 4 = "))

    #tar nytt svar fra brukeren og ser om bruker fikk rett igjen
    if bruker_svar == 20:
        print("Riktig!")
        bruker_svar = int(input("10 / 2 = "))

        #Sjekker for siste gang og skriver ut at brukeren vant :)
        if bruker_svar == 5:
            print("Riktigg du vannttt!")

#Alt ned over printes om brukeren skriver noe feil.
        else:
            print("Beklager, det var feil! Spillet er over \n ")
    else:
        print("Beklager, det var feil! Spillet er over. \n ")
else: 
    print("Beklager, det var feil! Spillet er over. \n ")