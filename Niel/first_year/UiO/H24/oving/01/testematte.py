# - 01.15 Test matte

"""
Skriv et program som ber brukeren gi svaret på enkle matteoppgaver.

For eksempel: 1 + 1 5 * 4  10 / 2

Hvis brukeren gir det riktige svaret, skriv ut "Riktig!" og still det neste spørsmålet. Hvis brukeren gir et feil svar, skriv ut "Beklager, det var feil! Spillet er over." Hvis brukeren svarer på alle spørsmålene riktig, skriv ut "Gratulerer, du vant!"

Programmet skal bestå av minst 3 spørsmål og skal avslutte hvis brukeren svarer feil.

"""
print("")
print("Velkommen til matte quizet ;3")

mvp = False

bruker_svar = int(input("1 + 1 = "))

if mvp == False:
    if bruker_svar == 2:
        print("Riktig!")
        bruker_svar = int(input("5 * 4 = "))

        if bruker_svar == 20:
            print("Riktig!")
            bruker_svar = int(input("10 / 2 = "))

            if bruker_svar == 5:
                print("Riktigg du vannttt!")
                mvp == True
            else:
                print("Beklager, det var feil! Spillet er over \n ")

        else:
            print("Beklager, det var feil! Spillet er over. \n ")
        
    else: 
        print("Beklager, det var feil! Spillet er over. \n ")


        


            




