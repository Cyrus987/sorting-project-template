import java.util.Arrays;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        InsertionSort(input, input.length);
    }

     /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void InsertionSort(int [] list, int n){
        if (n < 2)
        {
            return;
        }
        int i,j,temp;
        for(i=1;i<list.length;i++){
            j = i-1; 
            while(i>0 && list[j] > list[i]){
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        System.out.println("insetion sorting!!!");
    }
    
    }

