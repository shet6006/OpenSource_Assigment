import java.util.Scanner;
public class Rectangle {
    int width; //가로
    int height; //세로
    public int getArea(){
        return width*height; //면적
    }
    public static void main(String[] args){
        Rectangle rect=new Rectangle();
        Scanner scanner=new Scanner(System.in);//스캐너 생성
        System.out.print(">> ");
        rect.width=scanner.nextInt();
        rect.height=scanner.nextInt();

        System.out.println("사각형의 면적은 "+rect.getArea());
        scanner.close();
    }
}
