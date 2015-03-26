import time,math
start = time.time()*1000
def integral(coeff,power,min,max):
        print (coeff/(power+1))*math.pow(max,power+1) - (coeff/(power+1))*math.pow(min,power+1)

for x in range(1,100):
        integral(4,3,x,x+1)


print ""
print time.time()*1000 - start
