package Day03_sortingAlgoritm.selectionsort.sortexamscores;

public class Main {
    public static void main(String[] args) {
        int[] marks = {68, 54, 92, 34, 43, 87, 83};

        SelectionSort obj = new SelectionSort();
        int[] sortedMarks = obj.selectionSort(marks);   // sorting marks

        for(int mark : sortedMarks){
            System.out.print(mark + "  ");
        }
    }
}

