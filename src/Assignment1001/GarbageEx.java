package Assignment1001;

public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null;
        d = c;
        c = null;
    }
}//a가 null을 가리키게 되면서 Good객체가 가비지 객체가 된다.