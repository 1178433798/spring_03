package zrj.shiyan6;


public class adaptor implements DataOperation{


    private BinarySearch binarySearch;

    private QuickSort quickSort;


    public adaptor(BinarySearch binarySearch, QuickSort quickSort) {
        this.binarySearch = binarySearch;
        this.quickSort = quickSort;
    }

    @Override
    public void Sort(int[] arr) {
        quickSort.quickSort(arr);
    }

    @Override
    public void search(int[] arr, int pt) {
        binarySearch.binarySearch(arr,pt);
    }
}
