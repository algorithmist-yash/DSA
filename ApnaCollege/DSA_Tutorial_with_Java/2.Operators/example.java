public class example {
    public static void main(String [] args){
        int x=2, y=5;

        int exp1= (x*y/x);
        int exp2 = (x * (y/x));     // since y/x is int/int therefore result will also be int so 5/2 = 2.5 but the result will be 2
        System.out.print(exp1 + " , ");
        System.out.println(exp2);
        // Console output is 5 , 4

        int a = 200, b=50, c =100;

        if (a>b && b>c){
            System.out.println("Hello");
        }
        if(c>b && c<a){
            System.out.println("Java");
        }
        if((b+200)< a && (b+150) < c){
            System.out.println("Hello Java");
        }


        int m,n,o;
        m = n = o = 2;
        m += n;
        n -= o;
        o /= (m+n);
        System.out.println(m + " " + n + " " + o);


        int t =9, u=12;
        int p=2,q=4,r=6;

        int exp = 4/3 * (t+34) + 9 * ( p+q+r) + (3 + u * (2 + p)) / (p + q * u);
        System.out.println(exp);


        a=10;
        b=5;
        exp1 = (b * (a / b + a / b));
        exp2 = ( b * a / b + b * a / b);

        System.out.println(exp1);
        System.out.println(exp2);

    }
}
