public class gta {
    String username;
    int level;
    double uang;
    int pertahanan;
    int attack;
    int credit;


    void slain() {
        System.out.println("you have been slain");
    }

    void playerkill1() {
        System.out.println("you have slain an enemy");


    }

    void playerkill2() {
        System.out.println("double kill");


    }

    void levelup(gta gta) {
        level +=1;
    }
    void uangnambah(gta gta) {
        uang += 10.00;
    }
    void playerkill3() {
        System.out.println("triple kill");


    }

    void playerkill4() {
        System.out.println("maniac");


    }

    void playerkill5() {
        System.out.println("savage");


    }


    public void farming() {
    }

    public void attackothers(gta player2) {
    }

     void lord(){;
    System.out.println("attacking lord");
    }

    public void attackbyothers(gta player4) {
    }

   void afk(){;
     System.out.println("leave the game... dilaporkan telah afk AKAN dikenakan sanksi dan berpengaruh kepada credit score");

    }


    void report(gta gta) {
        credit -= 10;
    }
    public void pesan() {

    }
}
