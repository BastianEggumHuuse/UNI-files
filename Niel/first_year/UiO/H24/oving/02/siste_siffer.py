# - siste_siffer.py - 02.21: Finn ut om siste siffer er felles

a = 123450
b = 17892
c = 29872


if a % 10 == b % 10:
    print("a og b har like siste siffer")

if a % 10 == c % 10:
    print("a og c har like siste siffer")

if b % 10 == c % 10: 
    print("b og c har like siste siffer")