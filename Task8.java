import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        int arrSize = 30;
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < arrSize; ++i){
            arr.add((int) Math.round(Math.random()*1001));
            System.out.print(arr.getLast() + " ");
        }
        System.out.println();
        for(int i = 0; i < arrSize-2; ++i){
            for(int j = 0; j < arrSize-1-i; ++j){
                if(arr.get(j) > arr.get(j+1)){
                    int d = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, d);
                }
            }
        }
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
}
