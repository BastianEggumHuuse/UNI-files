antall_stjerner = 1
stjerne = "*"
rom = " "

pyramide_hoyde = int(input("\nHvor høy skal pyramiden være? \n > "))
antall_rom = pyramide_hoyde - 1     

for x in range(0,pyramide_hoyde):
    
    print(rom*antall_rom,stjerne*antall_stjerner)
    
    antall_stjerner += 2
    antall_rom -= 1