from sau import Sau  # Importerer Sau-klassen fra sau-modulen

bambi = Sau("niel", "norge")  # Oppretter en instans av Sau med navn "niel" og posisjon "norge"

bambi.blir_spist()  # Kaller metoden blir_spist() på bambi
assert not bambi.lever()  # Sjekker om bambi ikke lever (bør passere siden bambi er spist)
