public class linearsearch {
    public static int search(int num[],int key) {
        for(int i=0;i<num.length;i++) {
            if(num[i]==key) {
                return i;
            }
        }
        return -1; // if value not found in array
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        int key=2;
        int index=search(num, key);
        if(index==-1) {
            System.out.println("FALSE");
        }
        else {
            System.out.println("TRUE");
            System.out.println("Index of "+key+" is "+index);
        }
    }
}
