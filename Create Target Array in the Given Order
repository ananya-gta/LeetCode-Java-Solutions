class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list= new ArrayList<>();
            int i;
            for(i=0; i<nums.length; i++)
                    list.add(index[i], nums[i]);
            int[] target= new int[nums.length];
            for(i=0; i<target.length; i++)
                    target[i]= list.get(i);
            return target;
    }
}
