
datakaryawan = ["budi", "bunga", "alex", "mawar", "dani", "sultan"]

nama = input("Masukkan nama: ").lower()

if nama in datakaryawan:
    print(f"{nama.capitalize()} adalah karyawan.")
else:
    print(f"{nama.capitalize()} bukan karyawan.")