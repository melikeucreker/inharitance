package Day29_inheritance;

public class C04_Child extends C03_ParentClass {

        int c =20;
        int a;

        String s ="Child Class";
        String m;



    public void method1() {
        System.out.println("Child class method1");
    }

        public static void main(String[] args) {
    C03_ParentClass obj3C03 =new C03_ParentClass();
    obj3C03.a=20;
    obj3C03.b=22;
    obj3C03.s="p";
    obj3C03.t="k";
    obj3C03.parentmethod1();
    obj3C03.parentmethod2();


    C04_Child objC04=new C04_Child();
    objC04.a=50;
    objC04.c=20;
    objC04.s="u";
    objC04.m="l";
    objC04.method1();//child class method1

    //C04 Classını C03'e Child yapınca child classta olmayıp parent classda olan
    //b,t ve parentmethod2 özellik olarak objC04 e eklendi
   objC04.b=8;
   objC04.t="y";
   objC04.parentmethod2();
            /*
            javada parent classlar child edilmez.Child classlar parent edilir.
            bir classın baska bir classtki tüm özlliklrini alsın istiyorsak,o classı extend keyword ile o class'a child
            yaparız.(Size baba diyebilir miyim? hatta sizi parent seçtim diyeceğiz.

             */



    }
}
