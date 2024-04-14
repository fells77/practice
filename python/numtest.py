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

    # build combined array of matching values for arr1[] and arr2[]
    i = 0
    while i < size:
      if compare[i] == True:
        exar = np.append(exar, ara[i])
      else:
        exar = np.append(exar, False)
      i += 1
    
    # compare combined array with arr3[] to rm any matches
    j = 0
    final = np.array([])
    while j < size:
      if exar[j] != arc[j] and exar[j] != 0:
        final = np.append(final, exar[j])
      j += 1
    result = final

  return result