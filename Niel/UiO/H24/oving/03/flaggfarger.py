flaggOrdbok = {"norge" : ["rødt", "hvitt", "blått"], 
               "sverige" : ["blått", "gult"],
               "danmark" : ["rødt", "hvitt"],
               "finland" : ["hvitt", "blått"],
               "japan" : ["rødt", "hvitt"],
               "gabon" : ["grønt", "gult", "blått"],
               "storbritannia" : ["rødt", "blått", "hvitt"],
               "chile" : ["blått", "hvitt", "rødt"]}

print("")
#print(flaggOrdbok)

flaggOrdbok["taiwan"] = ["rødt","hvitt","blått"]



def visFlagg():

    bruker = input("Hvilket land vil du se fargene på? ").lower()

    if bruker in flaggOrdbok:

        farge = input("Gi meg en farge? ")

        if farge in flaggOrdbok[bruker]:
            print(f"\nFargen forekommer i flagget: {bruker}\n")
        else:
            print(farge, "forekommer ikke i flaggen av", bruker)


        print(f"\nFarge på flaget er: {flaggOrdbok[bruker]}\n")

    else:
        print("Vi har ikke dette flagget.")


    

    

visFlagg()