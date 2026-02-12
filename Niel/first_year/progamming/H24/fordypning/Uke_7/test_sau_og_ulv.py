from sau import Sau  # Importerer Sau-klassen fra sau-modulen
from ulv import Ulv  # Importerer Ulv-klassen fra ulv-modulen

ulv = Ulv("Warwick", "busk")  # Oppretter en instans av Ulv med navn "Warwick" og posisjon "busk"
sau = Sau("Bambi", "hus")  # Oppretter en instans av Sau med navn "Bambi" og posisjon "hus"

assert sau.lever()  # Sjekker om sauen lever, forventer True
assert ulv.hent_vekt() == 20  # Sjekker om ulvens vekt er 20

ulv.spis_sau(sau)  # Ulven spiser sauen

assert sau.lever() == False  # Sjekker om sauen ikke lever, forventer False
assert ulv.hent_vekt() == 25  # Sjekker om ulvens vekt er 25
