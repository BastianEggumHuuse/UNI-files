import matplotlib.pyplot as plt

X = ["Fossile Brensler","Atomkraft","Fornybar energi"]
Y = [11.2,4.0,1.0]
Colors = ["firebrick","mediumspringgreen","royalblue"]

plt.axhline(1,linestyle="dashed",color = "black")

plt.bar(X,Y,edgecolor = "black",color = Colors)
plt.title("Vannforbruk for forskjellige typer strømproduksjon\n i bcm (Billion Cubic Meters) i 2021")
plt.ylabel("Vann [bcm]")
plt.xlabel("Strømproduksjonstype")

plt.show();