public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        selectionSort(input);
        System.out.println("Selection Sort!!!!");
    }

    public void selectionSort(int[] list) {
        int n = list.length;
        
        
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }

            
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }
}
