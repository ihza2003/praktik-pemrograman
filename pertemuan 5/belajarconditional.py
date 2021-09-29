umur = input("Masukan umur Anda =")
umur = int(umur)
if (umur >=0 and umur <= 5):
    print("Anda masih balita")
elif (umur > 5 and umur <= 19):
    print("Anda sudah Remaja")
else:
    print("umur anda tidak valid")
print("Terima kasih")