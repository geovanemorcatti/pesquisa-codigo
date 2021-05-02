# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.







# Press the green button in the gutter to run the script.
import time

class Matriz:
    def __init__(self, mat):
        self.mat = mat
        self.lin = len(mat)
        self.col = len(mat[0])

    def getLinha(self, n):
        return [i for i in self.mat[n]]

    def getColuna(self, n):
        return [i[n] for i in self.mat]

    # opcional: dar overload no operador de multiplicação
    def __mul__(self, mat2):
        matRes = []

        for i in range(self.lin):
            matRes.append([])

            for j in range(mat2.col):
                listMult = [x*y for x, y in zip(self.getLinha(i), mat2.getColuna(j))]
                matRes[i].append(sum(listMult))

        return matRes

#----------------------------------------------

if __name__ == '__main__':
    t1 = time.time()
    mat1 = Matriz([[2, 3], [4, 6]])
    mat2 = Matriz([[1, 3, 0], [2, 1, 1]])
    print(mat1 * mat2)

tempoExec = time.time() - t1
print("Tempo de execução: {} segundos".format(tempoExec))
# colocar mais testes abaixo





