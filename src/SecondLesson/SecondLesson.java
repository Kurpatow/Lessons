package SecondLesson;

public class SecondLesson {
    public static void main(String[] args) {
        int sum = 105000 , end = 100000;
        double sale = sum > end ? (sum - (sum * 0.1)) : sum;
        System.out.println(sale);
    }
}
