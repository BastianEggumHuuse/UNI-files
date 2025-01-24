

def velkommen_melding(navn):
    if navn == "admin":
        print("Velkommen tilbake, admin!")
    else:
        print(f"Velkommen til kafeen, {navn}!")


bruker = str(input("Vennligst skriv inn brukernavnet ditt:\n> "))

velkommen_melding(bruker)