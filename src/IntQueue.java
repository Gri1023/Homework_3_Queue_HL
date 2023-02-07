public class IntQueue {
    public static void main(String[] args) {
        int[] array = new int[5];
        enqueue(7,array);
        enqueue(9,array);
        enqueue(3,array);
        enqueue(4,array);
        enqueue(8,array);
        dequeue(array);
        System.out.println("isEmpty = " + isEmpty(array));
        System.out.println("isFull = " + isFull(array));
        //OUTPUT
        for (int i=0;i<5;i++) {
            System.out.println(array[i]);
        }
    }
    public static void enqueue(int n,int[] array){
        for (int i=0;i<5;i++) {
            if (array[i] == 0) {
                array[i] = n;
                break;
            }

        }
    }
    public static int dequeue(int[] array){
        int n = array[0];
    array[0] = 0;
    for (int i = 1;i<5;i++) {
//            System.out.println("replaced " + array[i - 1] + " with " + array[i]);
            array[i - 1] = array[i];
    }
    System.out.println("dequeued " + n);
    return n;
    }
    public static boolean isEmpty(int[] array){
        int counter = 0;
        for (int i=0;i<5;i++) {
            if (array[i] == 0) {
                counter++;
            }
        }
        if (counter == 5)
            return true;
        else
            return false;
    }
    public static boolean isFull(int[] array) {
        int counter = 0;
        for (int i=0;i<5;i++) {
            if (array[i] == 0) {
                counter++;
            }
        }
        if (counter == 0)
            return true;
        else
            return false;
    }
}