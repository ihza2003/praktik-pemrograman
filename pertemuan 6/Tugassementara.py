print("........Sistem Siakad.......")
print("1 . Tambah data")
print("2 . Edit data")
print("3 . Hapus data")
print("4 . Lihat data")

Menu = input("Menu yang ada pilih :")
Menu = int(Menu)

if ( Menu == 1):
    print()
    print("1. Tambah data Mahasiswa")
    print("2. Tambah data mata kuliah")
    print("3. Kembali")
    
    Menu1 = input("Menu yang anda pilih")
    Menu1 = int(Menu1)
    if (Menu1 == 1):
        print()
        nama = input("Masukan nama Anda")
        nama = str(nama)
        print("Nama Anda Adalah" + nama)
    elif (Menu1 == 2):
        print()
        mataKuliah = input("Masukkan mata Kuliah yang ingin ditambahkan")
        mataKuliah = str(mataKuliah)
        print("Mata kuliah yang ingin ditambahkan adalah" + mataKuliah)
    elif (Menu1 == 3):
        print()
        print("......Terima kasih......")
    else:
       print("Menu tidak ada")
elif(Menu == 2 or 3 or 4):
    print("Fitur belum ada")

else:
    print("Menu tidak ada")


    
    

