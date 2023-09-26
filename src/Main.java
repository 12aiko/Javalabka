import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("N = "); int N = read.nextInt();
        int[] mass = new int[N];
        for(int i = 0; i < N; i++)
        {
            System.out.print("mass[" + i + "] = "); mass[i] = read.nextInt();
        }

        int Orta = 0, Orta1 = 1;
        for(int i = 0; i < N; i++)
        {
            Orta = Orta + mass[i];
            Orta1 = Orta / N;

        }
        System.out.print("Fact = " + Orta1);

    }
}