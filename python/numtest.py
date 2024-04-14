import numpy as np

def exclusion(arr1, arr2, arr3=None):
  '''
  Returns:
  Elements in arr1[] that match the elements in arr2[] but DO NOT match the elements in arr3[], if provided
  '''
  # arr1 = [1,2,3,4,5]
  # arr2 = [1,2,5,5,5]
  # arr3 = [2,2,3,4,1]
  # [1,5]

  # arr1 = [1,2,3,4,5]
  # arr2 = [2,2,3,4,1]
  # arr3 = [1,2,5,5,5]
  # [3,4]

  ara = np.array(arr1)
  arb = np.array(arr2)
  arc = np.array(arr3)

  compare = ara == arb

  if arr3 is None:
    result = ara[compare]
  else:
    exar = np.array([])
    size = len(ara)

    # build exar[] of matching values from arr1[] and arr2[] with 'False' placeholders for non-matching positions
    i = 0
    while i < size:
      if compare[i] == True:
        exar = np.append(exar, ara[i])
      else:
        exar = np.append(exar, False)
      i += 1
    
    # build final[] with any value from exar[] that doesn't match arr3[] and isn't 'False'
    j = 0
    final = np.array([])
    while j < size:
      if exar[j] != arc[j] and exar[j] != 0:
        final = np.append(final, exar[j])
      j += 1
    result = final

  return result