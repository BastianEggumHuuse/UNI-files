from collections import namedtuple


#klasse navn blir person

Person = namedtuple("Person", ["navn","alder"])
meg = Person("jonas",33)

print(meg.navn)

navn = "jonas"
navn2 = "margrethe"

bokstaver = {"e","t"}
print(bokstaver.intersection(navn2))