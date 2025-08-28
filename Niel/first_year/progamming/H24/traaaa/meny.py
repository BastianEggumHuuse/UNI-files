# - Oppgave 3: Problemløsing


# - lager to lister for hovedrettene og siderettene
hovedretter = ["biff","torsk","salat"]
sideretter = ["brokkoli","bearnaise"]


# - skriver det ut
print("\nHovedretter:\n> biff\n> torsk\n> salat\n\nSideretter:\n> brokkoli\n> bearnaise")

# - Spør etter hva brukeren har lyst på 
bruker_hoved = input("\nHva ønsker du å ha som hovedrett?\n> ")
bruker_side = input("\nHva ønsker du som siderett?\n> ")

# 3)

# setter parentes rundt or som at den sjekket det først og ikke med and sammtidig

"""
if (bruker_hoved == hovedretter[0] or bruker_hoved == hovedretter[1]) and bruker_side == sideretter[1]:
    print("\nDu spiser ikke nok grønnsaker!\n")
elif bruker_hoved == hovedretter[2] and bruker_side == sideretter[0]:
    print("\nDu har valgt et vegetarmåltid.\n")
else:
    print(f"\nDu har valgt {bruker_hoved} med {bruker_side}.\n")
"""


# 4) - her var jeg litt usikker med hvordan jeg skulle gjøre oppgaven. denne versjonen er ikke like bra siden elif brukes ikke.

if (bruker_hoved == hovedretter[0] or bruker_hoved == hovedretter[1]) and bruker_side == sideretter[1]:
    print("\nDu spiser ikke nok grønnsaker!\n")
else:
    if bruker_hoved == hovedretter[2] and bruker_side == sideretter[0]:
        print("\nDu har valgt et vegetarmåltid.\n")
    else:
        print(f"\nDu har valgt {bruker_hoved} med {bruker_side}.\n")
