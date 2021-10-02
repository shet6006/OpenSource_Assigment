package Assignment1001;

class Sample {
    public int a;
    private int b;
    int c;
}
public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        //aClass.b = 10;
        aClass.c = 10;
    }
} //a와 c는 public과 default 지정자로 선언이 되었지만, b는 private하도록 선언되었으므로 다른 클래스인 AccessEx클래스에서 접근이 불가능하다.