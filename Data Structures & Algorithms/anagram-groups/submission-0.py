class Solution:
    def __init__(self):
        pass
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict: dict[str, list[str]] = {}
        for palavra in strs:
            has_anagram = False
            for key in anagram_dict.keys():
                has_anagram = self.isAnagram(key, palavra)
                if has_anagram:
                    array = anagram_dict.get(key)
                    array.append(palavra)
          
                    break
             
            if not has_anagram:
                anagram_dict.setdefault(palavra, [palavra])
        
        output = []
        for value in anagram_dict.values():
            output.append(value)
        
        return output

    def isAnagram(self, word, otherWord):    
        sorted_word = sorted(word)
        sorted_other_word = sorted(otherWord)
        
        return sorted_word == sorted_other_word
    
