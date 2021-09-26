public class example1 {
    int radius; //원의 반지름
    String name; //원의 이름 필드

    public example1(){} //원의 생성자

    public double getArea(){ //원의 면적 계산 메소드
        return 3.14*radius*radius;
    }
    public static void main(String[] args){
        example1 pizza;
        pizza=new example1(); //원 객체 생성
        pizza.radius=10; //반지름 설정
        pizza.name="자바피자"; //피자 이름 설정
        double area=pizza.getArea(); //피자 면적 구하기
        System.out.println(pizza.name+"의 면적은"+area);

        example1 donut = new example1();
        donut.radius=2;
        donut.name="자바도넛";
        area=donut.getArea();
        System.out.println(donut.name+"의 면적은"+area);
    }
}
