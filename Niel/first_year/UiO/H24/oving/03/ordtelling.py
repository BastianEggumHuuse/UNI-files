# - ordtelling.py - 03.02 Nye datatyper

ordliste = ["I", "dag", "er", "jeg", "så", "lykkelig", "så", "lykkelig", "så", "lykkelig", "det", "hele", "endte", "dejligt", "jeg", "synger", "og", "er", "glad", "Ja", "alting", "endte", "lykkeligt", "så", "lykkeligt", "så", "lykkeligt", "i", "dag", "er", "jeg", "så", "lykkelig", "som", "dagen", "den", "er", "lang"]


# a)
antall_ord = len(ordliste)
print(antall_ord)

# b)
unike_ord = set(ordliste)
antall_unike_ord = len(unike_ord)
print(antall_unike_ord)


# c)

liste = []

print("\nAntall skrevet ord:\n")
print(f"lykkelig: {ordliste.count("lykkelig")}")
print(f"så: {ordliste.count("så")}")
print(f"dag: {ordliste.count("dag")}\n")


# d)

ordbok = {}

ordbok["lykkelig"] = ordliste.count("lykkelig")
ordbok["så"] = ordliste.count("så")
ordbok["dag"] = ordliste.count("dag")

#print(ordbok)

print(list(ordbok))

print(set(ordbok))