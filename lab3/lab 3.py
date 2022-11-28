
## code for getting input from the usen in the right format
size = input()
list = size.split(', ')
n = int(list[0])
m = int(list[1])
matrix = []
for i in range(n):
    inputt = input()
    arr = [str(x) for x in inputt]
    matrix.append(arr)
id = input()
thre = input()


## locations of id in the 2D matrix
#loc_id = []
#for i in range(n):
#    for idx, value in enumerate(matrix[i]):
#        if value == str(id):
#            loc_id.append([i,idx])







