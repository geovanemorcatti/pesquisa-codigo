# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    print_hi('PyCharm')
    n = int(input("Verificar numeros primos ate: "))
    mult = 0

    for count in range(2, n):
        if (n % count == 0):
            print("Múltiplo de", count)
            mult += 1

    if (mult == 0):
        print("É primo")
    else:
        print("Tem", mult, " múltiplos acima de 2 e abaixo de", n)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
