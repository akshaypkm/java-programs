package Famouse_Problems;
public class Recursion {
    public static void main(String[] args){
        int a = 0;

        System.out.println(recursion(a));
    }

    static int recursion(int a){
        if(a>5){
            return a;   //return 1
        }
        a = a+1;

        recursion(a);

        System.out.println(a);

        return a;     //return 2
    }
}
