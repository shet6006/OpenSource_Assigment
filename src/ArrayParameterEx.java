public class ArrayParameterEx {
    static void replaceSpace(char a[]){
        for (int i=0; i<a.length; i++)
            if (a[i]==' ')
                a[i]=','; //i번째 문자가 공백이라면 i번째 문자를 반점으로 바꾸어라
    }
    static void printCharArray (char a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]); //문장 출력
        System.out.println();
    }
    public static void main (String args[]){
        char c[]={'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}
