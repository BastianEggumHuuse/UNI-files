## les_lmc er fasiten. Legg denne fila i samme mappe som deres program, og legg til dette:
from les_lmc import les_program as test_les

programfil = "add.txt"
assert tuple(les_program(programfil)) == tuple(test_les(programfil)), \
        "Programmene gir ikke samme minneoppsett"