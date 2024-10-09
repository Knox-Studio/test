input_data = input("Masukkan angka-angka yang dipisahkan dengan koma: ")

angka_list = list(map(int, input_data.split(',')))

angka_list.sort()

output = ','.join(map(str, angka_list))

print(f"Hasil urut: {output}")