# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


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
    print("É primo" if isprimo(12) else "Não é primo")
# See PyCharm help at https://www.jetbrains.com/help/pycharm/
