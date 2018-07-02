numberList = [3, 5, 2, 7, 2]

def myFunction(list, secondNumber):
    for i in range(len(list)):
        if list[i] < secondNumber:
            print(list[i])

myFunction(numberList, 6)
