import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(integerList);
        for (Integer integer : integerList) {
            if (integer %2 == 0 && integer > 0){
                System.out.print(integer + " ");
            }
        }
    }
}
