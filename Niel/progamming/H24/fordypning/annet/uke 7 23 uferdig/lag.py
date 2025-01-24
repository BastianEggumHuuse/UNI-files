class Lag:

    def __init__(self,navn,angrep,forsvar):
        self._navn = str(navn)
        self._angrep = float(angrep)
        self._forsvar = float(forsvar)

    def navn(self):
        return self._navn
    
    def angrep(self):
        return self._angrep
    
    def forsvar(self):
        return self._forsvar

    