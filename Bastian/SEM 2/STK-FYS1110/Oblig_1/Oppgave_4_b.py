from scipy.stats import binom
import numpy as np
import matplotlib.pyplot as plt
# Vi har 4 ulike valg, og q antall valg vi skal gjøre:

def n(q):
    return 4**q

# Vi skal finne sannsynligheten for akkurat en kombinasjon

def P_x_s(n):
    # n er antall kombinasjoner
    return(1/n)

Q = [5,10,20]
N = 30000

print()


print()

#plt.title("Sannsynlighet for X ")

i = 1
for q in Q:
    E = int(N*(1/4**(q)))
    plt.subplot(3,1,i)
    X = np.arange(E - 20,E + 20)
    plt.bar(X,binom.pmf(X,N,1/(4**q)),width = 1,edgecolor="black",color = "lightgreen")
    i += 1
    #pass

plt.show()