class Solution {
    public int findMaxLength(int[] nums) {
        int max_len=0;
        int sum=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i]==0?-1:1;
            if(sum==0)
            {
                max_len=i+1;
            }
            else if(mp.containsKey(sum))
            {
                max_len=Math.max(max_len,i-mp.get(sum));
            }
            else{
                mp.put(sum,i);
            }
        }
        return max_len;
    }
}