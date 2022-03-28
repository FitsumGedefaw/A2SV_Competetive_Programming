class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
                int[] result = new int[n];
                for(int i = 0; i < n; i++)
                    {
                        int num = nums[i];
                        int counter = 0;
                        for(int j = 0; j < n; j++)
                            {
                                if(num > nums[j])
                                    {
                                        counter++;
                                    }
                            }
                        result[i] = counter;
                    }
                return result;
    }
}
