
tinggi = int(input("Input Tinggi: "))

for i in range(tinggi):
	for j in range(tinggi - 1):
		print(' ', end='')
	for k in range(i + 2):
		print('* ', end='')
	print()