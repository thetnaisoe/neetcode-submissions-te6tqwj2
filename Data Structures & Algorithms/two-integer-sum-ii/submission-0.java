class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int second = numbers.length - 1;

        while(first < second){
            if(numbers[first] + numbers[second] > target){
                second -= 1;
            }else if(numbers[first] + numbers[second] < target){
                first += 1;
            }else{
                return new int[] { first + 1, second + 1 };
            }

        }
        return new int[0];

    }
}
