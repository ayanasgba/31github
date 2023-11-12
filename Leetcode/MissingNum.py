class Solution:
    def missingNumber(nums):
        a = len(nums) #3
        for i in range(a): #0,1,2
            b = i-nums[i]
            # 0,1,2 - 0,1,3 = 2-3 = -1
            a = a+b # 3 = 3+(-1)
        return a # 2
    print(missingNumber([0,1,3]))