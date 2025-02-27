def f(N,n,q):
    return(1/(1+(N-n)/4**q))


N = 5500000
n = 30000
Q = [5,10,20]

for q in Q:
        print(q, f(N,n,q))