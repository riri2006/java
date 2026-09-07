public class smallestArray {
    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 5, 6};
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}