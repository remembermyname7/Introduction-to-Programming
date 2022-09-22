import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim, ulang;
        int angka, totalGenap, totalGanjil, totalFibbonnacci;

        //input NAMA
        do{
            System.out.print("Masukan Nama Anda [1..25] : ");
            nama = input.nextLine();
            if(nama.length()>25){
                System.out.println("Nama harus 1 hingga 25 karakter");
            }
        }while(nama.length()>25);

        //input NIM
        do{
            System.out.print("Masukan NIM Anda [harus 10 karakter] : ");
            nim = input.nextLine();
            if(nim.length()!=10){
                System.out.println("NIM harus 10 karakter");
            }
        }while(nim.length()!=10);
        

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("Selamat datang "+nama+" [NIM : "+nim+"].. ^^v");
        System.out.println("\nMari belajar macam-macam deret bilangan..");


        //PENGULANGAN ANGKA
        do{
            totalGenap = 0;
            totalGanjil = 0;
            totalFibbonnacci = 0;
            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            do{
                System.out.print("\nMasukan Sembarang Angka [5...20] :  ");
                angka = input.nextInt();
                if(angka <5||angka>20){
                    System.out.println("Angka tidak sesuai ketentuan, masukan angka 5 hingga 20");
                }
            }while(angka <5 ||angka>20);
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
            System.out.println("Deret Bilangan \n###############");

            //GENAP
            System.out.println(angka+" Bilangan Genap");
            int g = angka*2;
            for (int a=2; a<=g; a+=2){
                System.out.print(a+" ");
                totalGenap = totalGenap + a;
            }
            System.out.println("\nHasil Penjumlahan = " + totalGenap);
            
            //GANJIL
            System.out.println("\n"+angka+" Bilangan Ganjil");
            int j = angka*2;
            for (int a=1; a<=j; a+=2){
                System.out.print(a+" ");
                totalGanjil = totalGanjil + a;
            }
            System.out.println("\nHasil Penjumlahan = " + totalGanjil);

            //FIBBONACCI
            int fib[] = new int [angka];
            fib[0] = 1;
            fib[1] = 1;
            for (int i = 2; i<angka; i++){
                fib [i] = fib[i-1] + fib [i-2];
            }
            System.out.println("\n"+angka+" Bilangan Fibonacci");
            for (int i = 1; i <=angka; i++){
                System.out.print(fib[i-1] + " ");
                totalFibbonnacci = totalFibbonnacci + fib[i-1];
            }
            System.out.println("\nHasil Penjumlahan = " + totalFibbonnacci);
            
            //Konfirmasi PENGULANGAN
            System.out.print("\nAnda ingin mengulang [y/t] : ");
            ulang = input.next();

        }while(ulang.equalsIgnoreCase("Y"));
    } 
}