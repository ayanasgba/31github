class Solution:
    def fizzBuzz(n):
        answer = []
        for i in range(1,n+1,1):
            if (i%3 == 0 and i%5 != 0):
                answer.append("Fizz")
            elif (i%5 == 0 and i%3 != 0):
                answer.append("Buzz")
            elif (i%3 == 0 and i%5 == 0):
                answer.append("FizzBuzz")
            else:
                answer.append(str(i))
        return answer
    print(fizzBuzz(15))