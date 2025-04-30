import matplotlib.pyplot as plt
import scipy.stats as stats
import math as mt
import numpy as np

data = []
with open("Svingetid.txt") as file:
    for l in file:
        data.append(float(l.replace(",","")))

T = lambda L : 2*mt.pi*mt.sqrt(L/9.82)

plt.title("Svingetider")
plt.xlabel("Tid [s]")
plt.ylabel("Antall målinger")

N = len(data)
x_line = sum(data)/N # Bruker snitt som estimator for t
s_squared = 0.0
for d in data:
    s_squared += (d + x_line)**2
s_squared = (1/(N-1))*s_squared 

norm = lambda m,s,x : (1/(mt.sqrt(2*np.pi)*s))

x = np.linspace(min(data),max(data),100)

plt.hist(data,edgecolor = "k")
plt.plot(x,stats.norm.pdf(x,loc = x_line,scale = s_squared))

plt.show()