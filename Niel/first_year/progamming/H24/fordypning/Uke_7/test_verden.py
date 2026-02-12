from verden import Verden  # Importerer Verden-klassen fra verden-modulen
from sau import Sau  # Importerer Sau-klassen fra sau-modulen
from ulv import Ulv  # Importerer Ulv-klassen fra ulv-modulen
import random as rd  # Importerer random-modulen og gir den forkortelsen "rd"

# Oppretter en instans av Verden
verden = Verden()



# Lager 6 ulver
# Oppretter ulver med tilfeldige posisjoner mellom 1 og 10
for i in range(6):
    verden.opprett_dyr("ulv", f"Wolf_{i}", rd.randint(1, 10))

# Oppretter sauer med tilfeldige posisjoner mellom 1 og 10
# Lager 6 sauer
for i in range(6):
    verden.opprett_dyr("sau", f"Lamb_{i}", rd.randint(1, 10))



# Skriver ut antall sauer og ulver i verden

# print(f"\nAntall sauer: {verden.antall_sauer()}")
# print(f"Antall Ulver: {verden.antall_ulver()}")

# Beskriver verden med posisjoner til sauer og ulver
#verden.beskriv()


# Kjører oppdateringsmetoden ti ganger
for x in range(10):
    verden.oppdater()

# Finn og beskriv den/de feiteste ulvene
verden.finn_feiteste_ulv()
