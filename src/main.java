public class main {
    public static void main(String[] args) {
        gta player1 = new gta();
        gta player2 = new gta();
        gta player3 = new gta();
        gta player4 = new gta();
        gta player5 = new gta();
        gta game = new gta();

player1.username = "rrq lemon";
player1.level = 1;
player1.uang = 15.00;
player1.pertahanan = 90;
player1.attack = 100;

        player2.username = "evos jessnolimit";
        player2.level = 3;
        player2.uang = 25.00;
        player2.pertahanan = 50;
        player2.attack = 200;

        player3.username = "mawang";
        player3.level = 4;
        player3.uang = 35.00;
        player3.pertahanan = 30;
        player3.attack = 400;

        player4.username = "rrq melon";
        player4.level = 5;
        player4.uang = 5.00;
        player4.pertahanan = 50;
        player4.attack = 50;
        player4.credit = 90;

        player5.username = "rrq ";
        player5.level = 6;
        player5.uang = 6.00;
        player5.pertahanan = 3;
        player5.attack = 4;

            game.pesan();
        System.out.println(" ");
        System.out.println(" ");
            System.out.println(" welcome to the mobile legend");
            System.out.println(" 5 second till enemy reach the battlefield");
            System.out.println(" slash them all");
            System.out.println(" all troop deploy");
            System.out.println(" backsound  tenewwww.........");
            System.out.println(" ");
            System.out.println(" ");


        player1.farming();
        System.out.println(player1.username + " level " + player1.level);
        System.out.println(player1.username + " farming tarus kada bebarian");
        System.out.println(player1.username + " lemon level up........");
        System.out.println(player1.username + " buying item jungle");
        System.out.println(player1.username + " attacking " + player2.username );
        System.out.print("(" + player1.username + " ) " ); player1.playerkill1();
        player1.levelup(player1);
        System.out.println(player1.username + " level " + player1.level);
        player1.uangnambah(player1);
        System.out.println(player1.username + " uang " + player1.uang);

        System.out.println(" ");
        System.out.println(" ");


        player2.farming();
        System.out.println(player2.username + " level " + player2.level);
        System.out.println(player2.username + " attacking " + player3.username);
        player1.playerkill1();  System.out.println(player2.username + " kill " + player3.username);
        System.out.println(player2.username + " attacking " + player4.username);
        player1.playerkill2();  System.out.println(player2.username + " kill " + player4.username);
        System.out.println(player2.username + " level " + player2.level);
        System.out.println(player5.username + " attacking " + player2.username);
        System.out.print("(" + player2.username + " ) " ); player2.slain();
        System.out.println(" ");
        System.out.println(" ");



        player3.lord();
        System.out.println(player3.username + " level " + player3.level);
        System.out.println(player3.username + " attacking " + player4.username);
        System.out.println("an enemy has slain lord");
        System.out.println(" ");
        System.out.println(" ");



        System.out.println(player4.username + " level " + player4.level);
        System.out.println("(" + player4.username + ")" + " credit " + player4.credit);
        System.out.print("(" + player4.username + " ) " ); player4.afk();
        player4.report(player4);

        System.out.println( "(" + player4.username + ")" +" credit " + player4.credit + " (-10) ");


    }
}
