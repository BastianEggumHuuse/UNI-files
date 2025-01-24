
#lager en prosedyre bare fordi jeg kan
def Konvertering():
    #lagrer temperaturen fra brukeren i en verdi
    fahrenheit = int(input("\nSkriv inn Temperaturen i fahrenheit\n > "))
    #skriver temperaturen i fahrenheit ut i terminalen
    print(f"Temperaturen i fahrenheit: {fahrenheit}")
    #her skjer konverteringen fra fahrenheit til celsius
    celsius = ((fahrenheit)-32)*5/9
    #skriver temperaturen i celsius ut i terminalen
    print(f"Temperaturen i celsius: {celsius:.2f}\n")

#kaller på prosedyren
Konvertering()