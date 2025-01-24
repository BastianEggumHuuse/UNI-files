voksen = input("\nEr du voksen? ")


if voksen == "ja":
    gravid = input("\nEr du gravid? ")

    if gravid == "ja":
        print("må hente melken")
    else:
        print("Yay ikke gravid")
else:
    print("uff da")


