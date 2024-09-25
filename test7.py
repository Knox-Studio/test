# List kata-kata yang akan ditampilkan
kalimat = ["Aku", "Mahasiswa", "UIB"]

# Loop untuk menampilkan secara bertahap
for i in range(len(kalimat)):
    print(" ".join(kalimat[:i+1]))
