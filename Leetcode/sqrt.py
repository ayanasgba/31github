import math

class Solution:
    def mySqrt(x) -> int:
        return math.floor(math.sqrt(x))

print(Solution.mySqrt(4))
print(Solution.mySqrt(8))