#sirkelberegning.py - 02.19: Utskrift av sirkelberegning

import math

pi = math.pi

inp = input("\nSkriv inn en radius:\n> ")
radius = float(inp)

diameter = 2*radius
areal = pi*radius*radius
omkrets = diameter*pi

print(f"\nDiameter : {diameter:.2f}\nAreal: {areal:.2f}\nOmkrets: {omkrets:.2f}\n")

