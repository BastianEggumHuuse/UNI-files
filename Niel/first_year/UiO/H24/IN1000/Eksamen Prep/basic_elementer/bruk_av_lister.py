

liste = ["apple", "banana", "cherry", "apple", "cherry"]
liste2 = [1, 5, 7, 9, 3]
liste3 = [True, False, False]

print(f"\nPrinter liste: {liste}")

print(f"Bruk av len: {len(liste)}")

print(f"Bruk av type: {(type(liste))}")

print(f"\nBruk av append: {liste.append("Eirik")}")
print(f"Printer liste: {liste}")
print(f"\nBruk av insert liste.insert(0,'Niel'): {liste.insert(0,"Niel")}")  #(index,element)
print(f"Printer liste: {liste}")
print(f"\nBruk av print index liste[0]: {liste[0]}")
print(f"Printer liste: {liste}")
print(f"\nBruk av .remove('Niel') : {liste.remove("Niel") }")
print(f"Printer liste: {liste}")
print(f"\nBruk av .pop(indeks): {liste.pop(2)}")
print(f"Printer liste: {liste}")

tall_liste = [100, 50, 65, 82, 23]
print(f"\nPrinter liste: {tall_liste}")
print(f"Bruk av sort():")
tall_liste.sort()
print(f"Printer liste: {tall_liste}")


print()
listespill = ["Fortnite", "Apex", "Minecraft"]
print(f"Ny liste: {listespill}")

# Endre et element i listen
listespill[1] = "Valorant"

print(f"Ny liste: {listespill}")




thislist = list(("apple", "banana", "cherry"))
print(f'\nFør list funksjonen: "apple", "banana", "cherry,"')
print(f"Printer liste: {thislist}")

