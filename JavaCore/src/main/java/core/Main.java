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

        /*
            Vòng lặp (Loop)
                - Thuc hien 1 khoi lenh nhieu lan
                - 3 cau truc: for, while, do - while
                - for
                    for(tham so 1; tham so 2; tham so 3){
                        code block;
                    }

                    Tham so 1: thoi diem bat dau cua vong lap => thieu tham so 1: loi cu phap
                    Tham so 2: dieu kien duy tri vong lap: Neu dieu kien tra ve false vong lap bi dung => thieu tham so 2: Vong lap vo han
                    Tham so 3: buoc nhay cua vong lap: thay doi thoi diem bat dau cua vong lap => thieu tham so 3: vong lap vo han

                    + Cach su dung: vong lap for duoc dung khi biet truoc so lan lap
                    + Vong lap for kiem tra truoc, thuc hien sau: kiem tra tham so 2 truoc, roi moi thuc hien code block
                        => Vong lap for co the chay 0 hoac n lan
                - while
                    tham so 1;
                    while(tham so 2){
                        code block;
                        tham so 3;
                    }

                    + Cach su dung: Vong lap while duoc su dung khi biet truoc so lan lap hoac khi truoc so lan lap
                    + Vong lap while kiem tra truoc, thuc hien sau: kiem tra tham so 2 truoc, roi moi thuc hien code block
                        => Vong lap while co the chay 0 hoac n lan
                - do while
                    tham so 1;
                    do {
                        code block;
                        tham so 3;
                    } while(tham so 2);

                    do {
                        tham so 1;
                        code block;
                        tham so 3;
                    } while(tham so 2);

                    + Cach su dung: duoc dung khi biet truoc hoac khong biet truoc so lan lap
                    + Vong lap do while thuc hien truoc, kiem tra sau: thuc hien code block truoc, sau do moi kiem tra tham so 2
                        => Vong lap do while co the chay 1 hoac n lan
            Mang (array):
                - La 1 tap hop cac phan tu co cung kieu du lieu voi nhau
                - Cac phan tu trong mang co cung ten, duoc phan biet voi nhau bang 1 so nguyen duoc goi la chi so index
                - Index bat dau tu 0 den n - 1 (n la so phan tu cua mang)
                - Khai bao mang:
                    datatype[] array_name = new datatype[number_element];
                - Truy xuat 1 phan tu trong mang:
                    array_name[index];
                - Truy xuat lan luot tung phan tu trong mang: dung vong lap chay theo chi so index
        */

        /*
            2. Nhap so nguyen a. Tinh tong cac so tu 1 den a
        */

        //Khai bao a, tong = 0
        int a, tong = 0;
        //Nhap a
        System.out.print("a = ");
        a = input.nextInt();
        //Tinh tong cac so tu 1 den a
        for(int i = 1; i <= a; i++){
            tong = tong + i;
        }
        //Hien thi ket qua
        System.out.println("Tong cac so tu 1 den " + a + " la: " + tong);

        /*
            3. Nhap mang so nguyen co m phan tu. Tinh tong cac phan tu trong mang
        */

        //Khai bao m, tong_mang
        int m, tong_mang = 0;
        //Nhap m
        System.out.print("m = ");
        m = input.nextInt();
        //Khai bao mang
        int[] arr = new int[m];
        //Nhap mang
        for(int i = 0; i < m; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        //Tinh tong cac phan tu trong mang
        for(int i = 0; i < m; i++){
            tong_mang = tong_mang + arr[i];
        }
        //Hien thi
        System.out.println("Tong cac phan tu cua mang: " + tong_mang);
    }
}
