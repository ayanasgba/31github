class Solution:
    def capitalizeTitle(self, title: str) -> str:
        
        a = []
        for i in title.split():
            if len(i) <= 2:
                a.append(i.lower())
            if len(i) > 2:
                a.append(i.capitalize())
        return " ".join(a)
