package Day29_inheritance;

public class C05_Child extends C03_ParentClass {
    int c =20;
    int a;

    String s ="Child Class";
    String m;



    public void method1() {
        System.out.println("Child class method1");

    }

    public static void main(String[] args) {
        // child class'dan bir obje olusturalım ve özelliklerini yazdıralim.
        C05_Child obj=new C05_Child();
        System.out.println(obj.a);//0
        System.out.println(obj.c);//20
        System.out.println(obj.b);// extend keyword oldugu icin bu classta b yok ama gidip parentsdan alır gelir.
        System.out.println(obj.m);//null
        System.out.println(obj.s);//"Child class"
        System.out.println(obj.t);//null
        obj.method1(); // önce icinde oldugumuz class'a bakar ve o calisir.

        // a bu childda var ve default 0

    }

}
