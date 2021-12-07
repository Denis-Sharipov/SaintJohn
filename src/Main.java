public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{22, 44, 11, 55, 77, 2, 5, 6};
        TestSortArray.sort(arr);
        for(int element : arr){
            System.out.println(element);
        }
    }
}
