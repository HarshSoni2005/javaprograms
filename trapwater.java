public class trapwater {
    public static int trap(int height[]) {

        //Calculation of leftmax in array to find minimum for waterlevel

        int leftmax[] = new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //Calculation of rightmax in array to find minimum for waterlevel

        int rightmax[] = new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--) {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        //Loop to calculate trappedwater

        int trappedwater = 0;
        for(int i=0;i<height.length;i++){

            //Finding the minimum value to find waterlevel out of leftmax and rightmax

            int waterlevel = Math.min(leftmax[i],rightmax[i]);

            //Calculating trappedwater

            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trap(height));
    }
}
