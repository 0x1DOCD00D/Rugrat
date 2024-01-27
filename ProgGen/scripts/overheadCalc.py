# random test with integers
import os
import sys
import optparse
import random
import subprocess
#Ishtiaque
from time import time

def execProcess(args):
  p = subprocess.Popen(args,
                       shell=True,
                       stdout=subprocess.PIPE,
                       stderr=subprocess.PIPE)
  (out, err) = p.communicate()
  if len(err) != 0:
    raise SystemError ("Error in execProcess: "+os.linesep+
                       "Args: "+str(args)+os.linesep+
                       "Result: "+out+os.linesep+
                       "Error: "+err)
  else:
    return out

def executeProgram(inputs, options):
  args = []
  args.append("java")
  args.append("-classpath")
  args.append(options.autdirectory)
  args.append(options.autclass+"."+options.autmethod)
  addInputsToArgs(inputs, args)
  execProcess(args)

def addInputsToArgs(inputs, args):
  for input in inputs.split(' '):
    if len(input.strip()) != 0:
      args.append(input)

def getRandomInputs(inputlimit):
  input = ''
  for i in range(inputlimit):
    sign    = random.randint(0, 5)
    integer = random.randint(-sys.maxint-1,sys.maxint) % 10000
    if sign == 0:
      integer = 0
    elif sign % 2 == 0:
      integer *= -1
    input += str(integer)+' '
  return input



# process options: http://docs.python.org/library/optparse.html
def processOptions():
  parser = optparse.OptionParser()
  parser.add_option("-c", "--class",
                    dest="autclass",
                    default="",
                    help="Java AUT class")
  parser.add_option("-m", "--method",
                    dest="autmethod",
                    default="",
                    help="Java AUT method")
  parser.add_option("-d", "--directory",
                    dest="autdirectory",
                    default="..\\bin",
                    help="Java AUT classpath directory")
  parser.add_option("-i", "--inputs",
                    dest="inputs",
                    default=20,
                    help="number of integer inputs")
  parser.add_option("-t", "--testlimit",
                    dest="testlimit",
                    default=20,
                    help="number of random testing limit")
  (options, args) = parser.parse_args()

  if len(options.autclass) == 0 or len(options.autmethod) == 0:
    print parser.print_help()
    sys.exit()
  else:
    return options

# main method
def main():
  options = processOptions()
  totalTime = 0

  f = open('t4ts.txt','r')



  for i in range(options.testlimit):
#    input = getRandomInputs(options.inputs)
    input = f.readline()
    print "test "+str(i)+": "+input
    t1 = time()
    executeProgram(input, options)
    t2 = time()
    totalTime += t2-t1
    print " Time required :" +str(t2-t1)

  print "Total time for the experiment:" + str(totalTime*1000)+ " ms"
# entry
if __name__ == "__main__":
  main()