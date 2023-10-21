public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array:");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1) {
				System.out.print(",");
			}
        }
        
        int n = arr.length;
        
        for (int j = n - 1; j > 0; j--) {
            int k = (j * 4) % n;
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
        }

        System.out.println("\nShuffled array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
