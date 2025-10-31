package sorting_dsa;
import java.util.Scanner;

class Sorting2{
    int []arr;
    Sorting2(int []arr){
        this.arr = arr;
    }
    void sort(){
        for(int i = 1 ; i < arr.length ; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    void Display(){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Element at "+i+" is "+arr[i]);
        }
    }
}

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of input : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("\nEnter the Element : ");
            arr[i] = sc.nextInt();
        }
        Sorting2 srt = new Sorting2(arr);
        System.out.println("Before Sorting");
        srt.Display();
        System.out.println("After Sorting");
        srt.sort();
        srt.Display();
    }
}
