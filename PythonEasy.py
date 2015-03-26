import time
start = time.time()
for x in range(1,100):
        print x+x
        print x*x
        print x/x
        print x-x

print time.time() - start
