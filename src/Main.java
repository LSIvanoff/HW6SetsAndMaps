import java.util.*;
public class Main {
    private static final    List<Integer> nums;

    static {
        nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    }


    private static final List <String> words;

    static {
        words = new ArrayList<>(List.of("ab", "ab", "cd", "cd", "ef"));
    }

    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1( ) {
//        Collections.sort( nums);
//        Set<Integer>  alreadyPrintedNums = new HashSet<>();
//            if ( !alreadyPrintedNums.contains(nums) ) {

        for (int num : nums ){
            if( num % 2  == 1){
                // or num% 2 != 0
                System.out.println(num + " ");
            }

        }
    }

    public static void task2() {
        Collections.sort(nums);
        int uniqNum = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if(num% 2== 0 & num != uniqNum ){
                uniqNum=num;
                System.out.println(num);
            }
        }
    }
    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size()- uniqueWords.size());
    }
}