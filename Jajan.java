import java.text.DecimalFormat;
import java.util.Scanner;

class Jajan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlhOrang, menu1, menu2, menu3, menu4, menu5;
        double totalMenu1, totalMenu2, totalMenu3, totalMenu4, totalMenu5, totalPembelian, diskon, totalAkhir, totalIndividu;
        String nama, menu;
        System.out.println("Selamat siang... \n");
        System.out.print("Pesan untuk berapa orang  : ");
        jmlhOrang = input.nextInt();
        System.out.print("Pesanan atas nama         : ");
        nama = input.next();

        double hrg1 = 9999.99;
        double hrg2 = 12345.67;
        double hrg3 = 21108.40;
        double hrg4 = 13579.13;
        double hrg5 = 98765.43;

        System.out.println("\nMenu Spesial hari ini");
        System.out.println("======================");
        System.out.println("    1. Nasi Goreng Spesial              @ Rp.    "+
        String.format("%8s", String.format("%.2f", hrg1).replaceAll(",",".")));
        System.out.println("    2. Ayam Bakar Spesial               @ Rp.    "+
        String.format("%8s", String.format("%.2f", hrg2).replaceAll(",",".")));
        System.out.println("    3. Steak Sirloin Spesial            @ Rp.    "+
        String.format("%8s", String.format("%.2f", hrg3).replaceAll(",",".")));
        System.out.println("    4. Kwetiaw Siram Spesial            @ Rp.    "+
        String.format("%8s", String.format("%.2f", hrg4).replaceAll(",",".")));
        System.out.println("    5. Kambing Guling Spesial           @ Rp.    "+
        String.format("%8s", String.format("%.2f", hrg5).replaceAll(",",".")));

        System.out.println("\nPesanan Anda [batas pesanan 0-10 porsi]");

        do{
            System.out.print("1. Nasi Goreng Spesial    = ");
            menu1 = input.nextInt();
            if(menu1 > 10){
                System.out.println("Pesanan tidak boleh lebih dari 10 porsi");
            }
        }while(menu1 > 10);
        do{
            System.out.print("2. Ayam Bakar Spesial     = ");
            menu2 = input.nextInt();
            if(menu2 > 10){
                System.out.println("Pesanan tidak boleh lebih dari 10 porsi");
            }
        }while(menu2 > 10);
        do{
            System.out.print("3. Steak Sirloin Spesial  = ");
            menu3 = input.nextInt();
            if(menu3 > 10){
                System.out.println("Pesanan tidak boleh lebih dari 10 porsi");
            }
        }while(menu3 > 10);
        do{
            System.out.print("4. Kwetiaw Goreng Spesial = ");
            menu4 = input.nextInt();
            if(menu4 > 10){
                System.out.println("Pesanan tidak boleh lebih dari 10 porsi");
            }
        }while(menu4 > 10);
        do{
            System.out.print("5. Kambing Guling Spesial = ");
            menu5 = input.nextInt();
            if(menu5 > 10){
                System.out.println("Pesanan tidak boleh lebih dari 10 porsi");
            }
        }while(menu5 > 10);

        System.out.println("\n\nSelamat menikmati makanan Anda...");

        System.out.println("\nPembelian  :");
        totalMenu1 = menu1*hrg1;
        totalMenu2 = menu2*hrg2;
        totalMenu3 = menu3*hrg3;
        totalMenu4 = menu4*hrg4;
        totalMenu5 = menu5*hrg5;

        System.out.println("1. Nasi Goreng Spesial      "+menu1+" porsi *  @ Rp.    9999.99 = Rp.      "+
        String.format("%8s",String.format("%.2f", menu1*hrg1).replaceAll(",",".")));

        System.out.println("2. Ayam Bakar Spesial       "+menu2+" porsi *  @ Rp.   12345.67 = Rp.      "+
        String.format("%8s",String.format("%.2f", menu2*hrg2).replaceAll(",",".")));

        System.out.println("3. Steak Sirloin Spesial    "+menu3+" porsi *  @ Rp.   21108.40 = Rp.      "+
        String.format("%8s",String.format("%.2f", menu3*hrg3).replaceAll(",",".")));

        System.out.println("4. Kwetiaw Siram Spesial    "+menu4+" porsi *  @ Rp.   13579.13 = Rp.      "+
        String.format("%8s",String.format("%.2f", menu4*hrg4).replaceAll(",",".")));

        System.out.println("5. Kambing Guling Spesial   "+menu5+" porsi *  @ Rp.   98765.43 = Rp.     "+
        String.format("%8s",String.format("%.2f", menu5*hrg5).replaceAll(",",".")));

        totalPembelian = totalMenu1+totalMenu2+totalMenu3+totalMenu4+totalMenu5;
        diskon = totalPembelian*0.1;
        totalAkhir = totalPembelian - diskon;
        totalIndividu = totalAkhir/jmlhOrang;
        System.out.println("============================================================================");
        System.out.println("Total Pembelian                                         = Rp.     "+String.format("%.2f", totalPembelian).replaceAll(",","."));
        System.out.println("Disc. 10% (Masa Promosi)                                = Rp.      "+String.format("%.2f", diskon).replaceAll(",","."));
        System.out.println("============================================================================");
        System.out.println("Total Pembelian setelah disc 10%                        = Rp.     "+String.format("%.2f", totalAkhir).replaceAll(",","."));
        System.out.println("Pembelian per orang (untuk "+jmlhOrang+" orang)                     = Rp.      "+String.format("%.2f",totalIndividu).replaceAll(",","."));
        System.out.print("\n                    Terima kasih atas kunjungan Anda... \n                      ...tekan ENTER untuk keluar...");

    }
}