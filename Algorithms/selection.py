def selection_sort(array):
    n = len(array)

    for i in range(n):
        min_number = i

        for j in range(i+1, n):

            if array[j] < array[min_number]:
                min_number = j

        array[i], array[min_number] = array[min_number], array[i]


    return array






unsorted = [5,9,10,1,2,3,0]

print(selection_sort(unsorted))






