import matplotlib.pyplot as plt
import numpy as np

omega = 1

# 3 a
x = lambda t : -2 * np.sin(omega * t)

T = np.linspace(0,((2*np.pi)/omega),100)
X = x(T)

plt.plot(T,X)
plt.xlabel("Time [s]")
plt.ylabel("Displacement [m]")
plt.grid()
plt.show()

# 3 b
T = np.linspace(0,((2*np.pi)/omega) * 0.8,100)

theta_0 = np.pi/2
A = 5
plt.plot(A * np.cos(omega * T + theta_0), A * np.sin(omega * T + theta_0),color = "firebrick")
plt.xlabel("Re(z)")
plt.ylabel("Im(z)")
plt.grid()
plt.axis("equal")
plt.show()