package Battle1;



class ClassInheritance
{
    public static void main(String s[])
    {
        A a = new A();
        a.i = 21;
        B b = new B();
        b.i = 32;
        b.j = 25;
        printI(a);
        printI(b);
        printJ(b);
    }

    public static void printI(A a1)
    {
        System.out.println(a1.i);
    }

    public static void printJ(B b1)
    {
        System.out.println(b1.j);
    }
}

class A
{
    int i;
}

class B extends A
{
    int j;
}


