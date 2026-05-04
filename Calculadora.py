def sumar(a, b):
    return a + b


def restar(a, b):
    return a - b


def multiplicacion(a, b):
    return a * b


def division(a, b):
    return a / b


i = -1
while i != 0:
    print("1. Suma\n" "2. Resta\n" "3. Multiplicacion\n" "4. Division\n" "0. Salir")
    i = int(input())

    if i == 1:
        a = float(input())
        b = float(input())
        print(sumar(a, b))
    elif i == 2:
        a = float(input())
        b = float(input())
        print(restar(a, b))
    elif i == 3:
        a = float(input())
        b = float(input())
        print(multiplicacion(a, b))
    elif i == 4:
        a = float(input())
        b = float(input())

        if b == 0:
            print("No se puede dividir entre 0.")
        else:
            print(division(a, b))

    else:
        print("Escoge un entero de la lista.")

print("Gracias por usar el programa")
