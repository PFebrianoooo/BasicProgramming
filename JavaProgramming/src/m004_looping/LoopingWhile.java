package m004_looping;

public class LoopingWhile {
    public static void main(String[] args) {
        int n = 10, x = 0;
        while (x < n) {
            System.out.print((x + 1) + " ");
            x++;
        }
        System.out.println();
    }
}