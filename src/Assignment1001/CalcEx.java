package Assignment1001;

class Calc {
    public static int abs(int a) { return a>0?a:-a; } //절댓값
    public static int max(int a, int b) { return (a>b)?a:b; } //최댓값
    public static int min(int a, int b) { return (a>b)?b:a; } //최솟값
} //변수들이 static하도록 설정되었으므로 다른 클래스에서 사용 가능
public class CalcEx {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-3));
        System.out.println(Calc.max(8, 15));
        System.out.println(Calc.min(-3, -10));
    }
}