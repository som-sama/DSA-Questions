package main

import (
	"fmt"
  "sort"
)

func main() {
	a := [20]int{43, -12, 89, -55, 21, 76, -8, 34, 10, -29, 67, 58, -45, 5, 72, -19, 50, -4, 32, 14}
  sort.Ints(a[:])
  fmt.Println("Sorted array is: ", a)
  target := 43
  fmt.Println("the target is in index: ", binarySearch(a[:],target))
}

func binarySearch(a []int, target int) int {
  start := 0
  end := len(a) - 1
  for start <= end{
    mid := (start + end) / 2
    if a[mid] == target {
      return mid
    
    } else if a[mid] < target {
      start = mid + 1
    } else if a[mid] > target {
      end = mid - 1
    } 
  }
  return -1 
  }
