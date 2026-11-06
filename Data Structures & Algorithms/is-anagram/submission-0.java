class Solution {
    public boolean isAnagram(String s, String t) {
  if(s.length()!=t.length()){
    return false;
  }
  HashMap<Character,Integer> freqmap=new HashMap<Character,Integer>();
  for(char c:s.toCharArray()){
    freqmap.put(c,freqmap.getOrDefault(c,0)+1);
  }
  for(char c:t.toCharArray()){
    if(!freqmap.containsKey(c))return false;
    freqmap.put(c,freqmap.get(c)-1);
      if (freqmap.get(c) < 0) return false;
  }
  return true;
  }
}
