class Solution:
    def isPalindrome(self, s: str) -> bool:
        i = 0
        j = -1
        
        cleaned_string = ""
        for a in range(len(s)):
            if s[a].isalnum():
                cleaned_string += s[a].lower()

        while(i != len(cleaned_string)):
            if cleaned_string[i] != cleaned_string[j]:
                return False

            i += 1
            j = j -1
        
        return True
        