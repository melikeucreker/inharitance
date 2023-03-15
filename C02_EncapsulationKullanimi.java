package Day29_inheritance;

public class C02_EncapsulationKullanimi {
    public static void main(String[] args) {
        C01 obj=new C01();
        obj.isim="Melike";// write
        System.out.println(obj.isim); //read

        obj.setSayi(40);// write
        System.out.println(obj.getSayi());//read

        /*
        bir class üyesinin public olmasi ile private yapılıp, getter() ve setter() methodlarının oluşturulmassı işlevsel
        açıdan aynı sonuçları oluşturur.
        bazi developerlar set(write) ve get(read) yetkilerinin,kullanıldığını vurgulamak için,2.yöntemi tercih ederler.(yani private
        olusturup sonra bunları yaparlar) bu skilde yetki türü belirtilmiş olur.
         */

    }

}
