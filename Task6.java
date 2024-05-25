import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        int arrSize = 100;
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < arrSize; ++i){
            arr.add((int) Math.round(Math.random()*1001));
        }
        int X = -1;
        int Z = -1;
        float sum = 0;
        for(int val: arr){
            sum += val;
            if(val > X){
                X = val;
                Z = arr.indexOf(val);
            }
        }
        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение = " + X + " находится в элементе под индексом " + Z);
        System.out.println("Среднее значение = " + sum/arrSize);
    }
}
