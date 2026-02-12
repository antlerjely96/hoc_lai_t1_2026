package core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Biến (Variable):
                - Dung de luu tru du lieu duoc nhap tu ban phim hoac tra ve tu chuong tring
                - Moi bien co 1 kieu du lieu
                - Bien la duy nhat
                - Cach khai bao bien:
                    + Khai bao bien, khong gan gia tri
                        Datatype variable_name;
                    + Khai bao bien, gan gia tri cho bien
                        Datatype variable_name = value;
                - Quy tac dat ten bien
                    + Ten bien khong chua ky tu dac biet
                    + Ten bien chi chua chu cai (hoa, thuong), so, _
                    + Ten bien khong duoc trung tu khoa
                    + Ten bien khong trung nhau
                    + Ten bien phan biet hoa thuong (bien A khac bien a)
            Kieu du lieu (Datatype):
                - Kieu gia tri ma 1 bien co the luu tru
                - 1 so kieu du lieu co ban
                    + So nguyen: int
                    + So thuc: float, double
                    + Ky tu: char
                    + Chuoi: String
                    + True - false: Boolean
            Tu khoa (Keyword):
                - La nhung tu duoc xay dung san trong ngon ngu lap trinh
                - Moi tu khoa co 1 chuc nang nhat dinh
                - Khong the thay doi chuc nang cua tu khoa
            Toan tu (Operator):
                - Ky hieu the hien cho cac phep toan
                - 1 so loai toan tu
                    + Toan tu so hoc: +, -, *, /, %, ++, --
                    + Toan tu quan he: >, <, >=, <=, ==, !=
                    + Toan tu logic: &&, ||, !
                    + Toan tu gan: =, +=, -=, *=, /=, %=
                    + Toan tu khac: ? :
                - Toan tu ++:
                    b = a++: Lay a gan cho b, sau do moi tang a
                    b = ++a: Tang a truoc, roi moi gan cho b
                - Do uu tien cua toan tu: so hoc > quan he > logic > gan
            Cau truc dieu khien re nhanh (Condition):
                - Thuc hien 1 khoi lenh khi 1 dieu kien duoc thoa man (khi dieu kien tra ve true => thuc hien khoi lenh)

                if(condition){
                    code block;
                }

                if(condition){
                    code block 1;
                } else {
                    code block 2;
                }

                if(condition_1){
                    code block 1;
                } else if(condition_2){
                    code block 2;
                } else if(condition_3){
                    code block 3;
                } ... else {
                    code block n;
                }

                if(condition_1){
                    if(condition_2){
                        code block 1;
                    } else if(condition_3){
                        code block 2;
                    } else {
                        code block 3;
                    }
                } else if(condition_4){
                    if(condition_5){
                        code block 4;
                    }
                } else {
                    if(condition_6){
                        code block 5;
                    }
                }
            Cau truc lua chon (switch - case)
                switch(bien){
                    case value_1:
                        code block 1;
                        break;
                    case value_2:
                        code block 2;
                        break;
                    ...
                    default:
                        code block n;
                        break;
                }

                - Switch - case chi su dung duoc khi tat ca cac condition la dieu kien so sanh bang (==) doi voi 1 bien
                - Khi co 1 case thoa man: thuc hien code block trong case do va tat ca cac case duoc viet sau no
                    => cuoi moi case can co 1 cau lenh break;
        */

        /*
            1. Nhap 1 so nguyen n tu ban phim. Kiem tra n la so duong hay am
        */

        //Khai bao n
        int n;
        Scanner input = new Scanner(System.in);
        //Nhap n
        System.out.print("n = ");
        n = input.nextInt();
        //Kiem tra n la so am hay duong
        if(n < 0){
            System.out.println("n la so am");
        } else if(n > 0){
            System.out.println("n la so duong");
        } else {
            System.out.println("n la so khong am, khong duong");
        }
    }
}
