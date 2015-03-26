import time
start = time.time()*1000
for x in range(1,100):
        print x+x
        print x*x
        print x/x
        print x-x

print time.time()*1000 - start
