a = input("Masukan nilai a =")

b = input("Masukan nilai b =")
print("A == B =" + str(a==b))
print("A != B =" + str(a!=b))
print("A > B =" + str(a > b))
print("A < B =" + str(a<b))
print("A >= B =" + str(a >= b))
print("A <= B =" + str(a <= b))

xAnd = int(a) < 5 and int(b) > 4
print("A < 5 and B > 4 =" + str(xAnd))
xOr = int(a) < 5 or int(b) > 4
print("A > 5 or B < 4 =" + str(xOr))
print("A < 5 not B > 4 =" + str(not(xAnd)))