import java.util.Scanner;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project HR_practice
 * @class Java_Loops_II
 * @since 26.07.2021 - 12.44
 */
public class ArithmeticProgression {


    private int a;
    private int b;
    private int n;

    public ArithmeticProgression() {
    }

    public ArithmeticProgression(int a, int b, int n) {

        this.a = a;
        this.b = b;
        this.n = n;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String calc(){

        int result = (int) (this.getA()+ Math.pow(2,0)*this.getB());
        String r = result + " ";
        for (int i = 1; i < this.getN(); i++) {
        result = (int) (result + Math.pow(2,i)*this.getB());

            r = r + result + " ";
        }
        System.out.println(r);

        return r;
    }

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int numberOfQueries = s.nextInt();
        s.nextLine();

        ArithmeticProgression[] ArithmeticProgressionArr = new ArithmeticProgression[numberOfQueries];


        for (int i = 0; i < numberOfQueries; i++) {
            String q = s.nextLine();
            String qArr[] = q.split(" ");
            int a = Integer.parseInt(qArr[0]);
            int b = Integer.parseInt(qArr[1]);
            int n = Integer.parseInt(qArr[2]);
            
            ArithmeticProgressionArr [i] = new ArithmeticProgression(a,b,n);

            ArithmeticProgressionArr [i].calc();
            
        }

    }
}
