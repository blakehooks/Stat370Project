import time,math
start = time.time()*1000
def quadratic(a,b,c):
        print ((-1*b)+math.sqrt(math.pow(b,2)-(4*a*c)))/(2*a)

for x in range(1,100):
        quadratic(1,1,-x)
print ""
print time.time()*1000 - start
