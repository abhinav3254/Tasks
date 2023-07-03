package July3year2023;

public class LLS1 {
        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; // Return the index if the target is found
                }
            }
            return -1; // Return -1 if the target is not found
        }

        public static void main(String[] args) {
            int[] array = { 5, 3, 8, 4, 2 };
            int target = 8;

            int index = linearSearch(array, target);

            if (index != -1) {
                System.out.println("Target found at index: " + index);
            } else {
                System.out.println("Target not found in the array.");
            }
        }

}
