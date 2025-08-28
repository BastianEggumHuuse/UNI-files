i = ["Eva","Bastian","Niel","Gilbert"]
e = ["Norinn","Per","Paal","Shaked"]

def bordsetting(introverte,ekstroverte):
    borsetting = []
    for i in range(len(introverte)):
        borsetting.append(introverte[i])
        borsetting.append(ekstroverte[i])
    return borsetting

print(bordsetting(i,e))
    