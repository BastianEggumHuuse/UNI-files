ord = (input().lower())

h = ord.count("h")
t = ord.count("t")

if h + 2 >= t :
    print(h," - " ,t)

if t + 2 >= h: 
    print(t," - " ,h)

if h == 12  and t < 12:
    print(h," - ",t)

if t == 12 and h < 12:
    print(t," - ",h)

