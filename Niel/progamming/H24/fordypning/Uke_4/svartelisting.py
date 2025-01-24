# Oppgave 5: Svartelistede personer

# Lager prosedyren
def bestem_laan():
    #Leser inn person id
    person = int(input("ID: "))
    #lager en set med id
    id = {23894, 29741, 10961, 22768, 22803, 11993, 24409, 9312, 29405, 6638, 738, 29964, 11967, 13443, 11534, 26228, 6867, 23027, 29137, 14084, 452, 15594, 22765, 25487}
    #sjekker om personen er i lista
    if person in id:
        #skriver ut om han kan eller ikke få lån
        print("kan ikke få lån")
    else:
        print("kan få lån")

#kaller på prosedyren
bestem_laan()


# En mengde passer fint for svartelistede kunder fordi den automatisk håndterer unike verdier. 
# En liste tillater duplikater og er ikke like effektivt. 
# En ordbok gir unødvendig kompleksitet med mindre ekstra informasjon må lagres.
