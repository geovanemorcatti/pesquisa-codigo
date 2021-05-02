# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


import time
def isprimo(numero):
    if numero != 0 & numero != 1:
        if numero > 3:
            for i in range(2, numero):
                if numero % i == 0:
                    return False
        return True
    return False


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    t1 = time.time()
    print("É primo" if isprimo(233333) else "Não é primo")
    tempoExec = time.time() - t1
    print("Tempo de execução: {} segundos".format(tempoExec))

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
