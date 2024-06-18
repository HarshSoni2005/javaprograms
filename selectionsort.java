public class selectionsort {
    public static void selection(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            int minpos=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[j]<arr[minpos])
                {
                    minpos=j;
                }
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void printarr(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        selection(arr);
        System.out.print("Sorted array - ");
        printarr(arr);
    }
}
