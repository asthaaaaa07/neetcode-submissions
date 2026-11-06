class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*HashSet<Integer> seen=new HashSet<>();
    for(int num:nums){
        if(seen.contains(num))
        return true;
        seen.add(num);
    }return false;*/

    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    int count=0;
    for(int num:nums){
           count = map.getOrDefault(num, 0) + 1;
           map.put(num,count);

               if(count>1){
                return true;
               }

    }
  return false;

    }
}