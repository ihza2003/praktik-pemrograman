nama = input("Masukan Nama Anda =")
fakultas = input("Masukan Fakultas Anda=")
prodi = input("Masukan prodi Anda =")
print("Nama saya Adalah =" + str(nama)) #Nama mahasiswa yang bersangkutan
print("fakultas =" + str(fakultas))
print("prodi =" + str(prodi))

ipk = input("Masukan IPK Anda =")
tahun = input("Masukan lama studi anda=")
ipk = float(ipk)
tahun = int(tahun)
if (ipk >= 3.51 and  ipk <= 4.00 and tahun <= 4):
    print("Anda lulus dengan pujian tertinggi atau prdikat summa Cumlaude")
elif (ipk >= 3.51 and ipk <= 4.00 and tahun > 4):
    print("Anda lulus dengan pujian atau predikat Cumlaude")
elif (ipk >= 3.01 and ipk < 3.51):
    print("Anda lulus dengan sangat memuaskan")
elif (ipk >= 2.76 and ipk <3.01):
    print("Anda lulus dengan memuaskan")
elif (ipk >= 2.00 and ipk < 2.76):
    print("Anda lulus dengan cukup")
elif (ipk > 0 and ipk < 2.00):
    print("Mohon maaf anda tidak lulus")
elif ( ipk> 4.00 or ipk  <0):
    print("Tidak valid")
else:
    print("Anda tidak terdeteksi")
print("Terima kasih")