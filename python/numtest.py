import numpy as np

def exclusion(arr1, arr2, arr3=None):
  # arr1 = [1,2,3,4,5]
  # arr2 = [1,2,5,5,5]
  # arr3 = [2,2,3,4,1]

  ara = np.array(arr1)
  arb = np.array(arr2)
  arc = np.array(arr3)

  compare = ara == arb
  print("compare:")
  print(compare)

  if arr3 is None:
    result = ara[compare]

  else:
    exar = np.array([])
    size = len(ara)
    i = 0
    while i < size:
      if compare[i] == True:
        exar = np.append(exar, ara[i])
      else:
        exar = np.append(exar, 'False')
      i += 1
      print("exar:")
      print(exar)
    
    result = arc[exar == 'False']

  return result