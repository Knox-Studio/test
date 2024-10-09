
input_data = input("Masukkan angka-angka yang dipisahkan dengan koma: ")

angka_list = list(map(int, input_data.split(',')))

total = sum(angka_list)

print(f"Total nilai: {total}")