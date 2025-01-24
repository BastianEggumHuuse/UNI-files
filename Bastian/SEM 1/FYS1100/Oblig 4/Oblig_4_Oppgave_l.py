import  numpy              as  np
import  matplotlib.pyplot  as  plt  # type: ignore
import  math               as  mt

# --------------------- [ To Run ] ------------------------
# cd "C:\Users\bastian\Desktop\SEM 1\FYS1100\Oblig 4"
# python "Oblig_4_Oppgave_l.py"
# --------------------- [ ------ ] ------------------------

# Variabler
m   = 5.0  # kg
k   = 500  # N/m
l_0 = 0.50 # m
h   = 0.30 # m
x_1 = 0.75 # m
dt  = 1e-4 # s
g   = 9.81 # m/s^2
mu  = 0.05 # konstant

# Funksjoner
F_x = lambda x : -k * x * ( 1 - l_0/( ( x**2 + h**2 )**( 1 / 2 ) ) )
F_y = lambda x : -k * h * ( 1 - l_0/( ( x**2 + h**2 )**( 1 / 2 ) ) )
F_N = lambda x : (F_y(x) + m*g)*mu

# Lister
T   = np.linspace(0,10,int(10/dt)) # s
V   = [0 , (F_x(x_1)/m) * dt]      # m/s
X   = [x_1 , x_1 + V[-1] * dt]     # m
E_K = [0, 0.5 * m * V[-1]**2]

# Løkke
for t in T[2:]:
    a =( F_x( X[-1] ) - ( F_N( X[-1] ) * ( V[-1] / abs(V[-1]) ) ) ) / m
    V.append(V[-1] + a * dt)
    X.append(X[-1] + V[-1] * dt)
    E_K.append(0.5 * m * V[-1]**2)

#Plotting

plt.plot(X,E_K,"dodgerblue")
plt.ylabel("Kinetisk energi i joule")
plt.xlabel("Posisjon i meter")

plt.show()