# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.




import time

    def factor(n):
        if (n == 0):
            return None
        elif (n == 1):
            return 1
        else:
            theFactors = []
            for i in range(2, n + 1):
                while n % i == 0:
                    n = n / i
                    theFactors.append(i)
            return theFactors


    if __name__ == '__main__':
        t1 = time.time()
        print
        factor(100)
        tempoExec = time.time() - t1
        print("time"+tempoExec)
# See PyCharm help at https://www.jetbrains.com/help/pycharm/
