public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        insertionSort(input);  
        System.out.println("Insertion Sort!!!!");
    }

    public void insertionSort(int[] list) {
        int i, j, temp;
        for (i = 1; i < list.length; i++) {
            temp = list[i];   
            j = i - 1;        

            
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j--; 
            }

            
            list[j + 1] = temp;
        }
    }
}