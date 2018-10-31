import time

x = 0

def main(): 
    start = time.time()
    print(Fib(35))
    print(time.time() - start, "sec")
    print("Fib was called:",x,"times!")

def Fib(n):
    global x
    x += 1
    if (n < 2):
        return n
    else: 
        return Fib(n-1) + Fib(n-2)

main()