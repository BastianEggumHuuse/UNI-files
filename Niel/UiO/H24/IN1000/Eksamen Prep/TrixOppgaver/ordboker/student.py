class Student:

    def __init__(self,navn,brukernavn,telefonnummer):
        self._navn = navn
        self._brukernavn = brukernavn
        self._telefonnummer = telefonnummer


    def __str__(self):
        return (f"\nNavn: {self._navn}\nBrukernavn: {self._brukernavn}\nTelefonnr: {self._telefonnummer}\n")
    
    

