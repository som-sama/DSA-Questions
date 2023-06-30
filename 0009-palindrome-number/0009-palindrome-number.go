func isPalindrome(x int) bool {
    if x == reverse(x){
        return true
    }
    return false
}

func reverse(x int) int {
    reversed := 0
	for x > 0 {
		remainder := x % 10
		reversed = reversed*10 + remainder
		x /= 10
	}
	return reversed
}
