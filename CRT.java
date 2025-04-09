public class CRT {
    public static int chinese(int[] nums, int[] rems){
        int x = 1;
        while (true){
            int i;
        for(i=0; i<nums.length; i++){
            if(x%nums[i]!=rems[i]) break;
        } if (i==nums.length) return x;
            x++;
    }
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        int[] rems = {2, 3, 1};
        System.out.println(chinese(nums, rems)); 
    }
}
