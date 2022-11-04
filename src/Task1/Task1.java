package Task1;

public class Task1 {

    public static void main(String[] args) {

        int a = 8;

        if (a > 0 && ((a & (a - 1)) == 0)) {
            System.out.println("число является степенем двойки");
        } else {
            System.out.println("число НЕ является степенем двойки");
        }
    }
}
