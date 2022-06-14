package com.company;

public class precedenceAssociativity {
    public static void main(String[] args) {

        // for example addition and subractin operator has low precedence than * and divide

        int b = 10*3-35/2;
        System.out.println(b);

        //precedence && Associativity
        // bada operator hoga pehle wo evalute hoga

        // in java  we check associativity of operators for example left to right

        int c = 10/2-44*2;
        // the above example tells us about the associtivity that first divide will happen then multiply then subraction

        int x =5;
        int y =10;
        int z = 20;

       int k = x*x - 4*x*z/2*x;
        System.out.println(c);
        System.out.println(k);
    }
}
