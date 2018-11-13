public class BubbleSwap {
    public void swap (int [] arr, int pos1, int pos2)
    {
        int x = 0;
        x = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = x;
    }
    public void bubbleSwap(int [] arr)
    {
        boolean done = false;
        int m = 1;
        while(!done)
        {
            int x = -1;
            for ( int i = 0; i < arr.length - m; i ++)
            {
                swap(arr, i,i +1);
                x++;
            }
            if( x == -1)
            {
                done = true;
            }
        }
    }
}
