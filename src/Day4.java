import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Player[] PArr = new Player[3];
        for (int i = 0; i < 3; i++) {
            PArr[i] = new Player();
        }

        System.out.printf("안녕하세요! 용사님. 이름을 입력해 주세요.%n용사님의 이름은 :");
        PArr[0].name = s.nextLine();
        System.out.printf("아하! 용사님의 이름은 %s 이군요! 그렇다면 이제 모험을 떠나보죠!%n",PArr[0].name);

        PArr[0].Lv = 1;

        while(true) {
            System.out.printf("길을 걷고 있습니다. 그런데...");
            Math.random();
        }
    }
}

class Player {
    String name;
    int HP;
    int MP;
    int Lv;
    int Defence;
    int fireAttack;
    int waterAttack;
    int plantAttack;
    int lightAttack;
    int darkAttack;

    int Attack(String Kindness, int HP) {
        int CalHP = 0;
        switch (Kindness) {
            case "FA": CalHP = HP - fireAttack; break;
            case "WA": CalHP = HP - waterAttack; break;
            case "PA": CalHP = HP - plantAttack; break;
            case "LA": CalHP = HP - lightAttack; break;
            case "DA": CalHP = HP - darkAttack; break;
        }
        return CalHP;
    }

    int Defence(int HP, int AT) {
        return HP - (AT - Defence);
    }
}

class Monster {
    int HP;
    int Attack;
    int Defence;

    int Attack(int HP) {
        return Attack;
    }
}

class Event {
    String[] DungeonArr = {"FD", "WD", "PD", "LD", "DD"};

    void Meet() {

    }
}