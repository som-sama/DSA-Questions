def bubble_sort(array):
    n = len(array)

    for i in range(n):
        already_sorted = True


        for j in range(n-i-1):

            if array[j] > array[j+1]:
                array[j], array[j+1] = array[j+1], array[j]
                already_sorted = False

        if already_sorted:
            break



    return array




unsorted_array = [9,3,1,4,2,5]

print(bubble_sort(unsorted_array))






