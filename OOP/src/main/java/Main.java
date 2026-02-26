public class Main {
    public static void main(String[] args) {
        //Khoi tao doi tuong cua class DongVat
        DongVat dongVat = new DongVat();
        dongVat.name = "Con chó";
        dongVat.eat("Bone");
        dongVat.eat();

        //Khoi tao doi tuong cua class DongVatDuoiDat
        DongVatDuoiDat dongVatDuoiDat = new DongVatDuoiDat();
        dongVatDuoiDat.name = "Con mèo";
        dongVatDuoiDat.number_leg = 4;
        dongVatDuoiDat.eat("Con chuột");

        ConCho conCho = new ConCho();
        conCho.number_leg = 4;
        conCho.setType("Corgi");
        conCho.color = "Yellow + While";

        ConCho conCho1 = new ConCho("Ki");
    }
}
