public class typePromotion {
    public static void main(String [] args){
        char ch = 'a';
        char ch2 = 'b';
        System.out.println((int)ch);
        System.out.println((int)ch2);
        System.out.println(ch+ch2);
        int a = ch-ch2;
        //char b = ch-ch2;  //error: incompatible types: possible lossy conversion from int to char
        System.out.println(a);


        short s = 5;
        byte c = 25;
        char b ='c';
        // byte bt = s+b+c;     // lossy conversion from int to byte
        int bt = s+b+c;
        System.out.println(bt);
    }
}
