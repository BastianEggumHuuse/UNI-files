import numpy as np
import pandas as pd
import scipy.stats as stats
import math
import matplotlib.pyplot as plt

p = []

with open("Perioder.txt") as File:
    for l in File:
        if("-" in l):
            break
        p.append(float(l)/5)
        
plt.hist(p)
plt.show()

# Estimerer forventning (Gjennomsnitt)

N = len(p)
t_line = sum(p)/N

# Estimerer standardavvik

s_t = 0
for t in p:
    s_t += (t - t_line)**2
s_t *= 1/(N-1)
s_t = (s_t)**(1/2)

print(f"t_line : {t_line:.5f}, s_t : {s_t:.5f}")
