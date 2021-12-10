import java.time.temporal.ValueRange;
import java.util.Scanner;
import java.util.Arrays;

public class Day4 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);

//        Player[] PArr = new Player[3];
//        for (int i = 0; i < 3; i++) {
//            PArr[i] = new Player();
//        }
//
//        System.out.printf("안녕하세요! 용사님. 이름을 입력해 주세요.%n용사님의 이름은 :");
//        PArr[0].name = s.nextLine();
//        System.out.printf("아하! 용사님의 이름은 %s 이군요! 그렇다면 이제 모험을 떠나보죠!%n",PArr[0].name);
//
//        PArr[0].Lv = 1;
//
//        while(true) {
//            System.out.printf("길을 걷고 있습니다. 그런데...");
//        }

        String[] resultArr = new String[10];
        int count = 0;
        while (resultArr[0]==null &&
                resultArr[1]==null &&
                resultArr[2]==null &&
                resultArr[3]==null &&
                resultArr[4]==null &&
                resultArr[5]==null &&
                resultArr[6]==null &&
                resultArr[7]==null &&
                resultArr[8]==null &&
                resultArr[9]==null
        ) {
            for (int i = 0; i < 10;i++) {
                resultArr[i] = Calculation.random("섹스",1); //0.0001%
            }
            System.out.println(Arrays.toString(resultArr));
            count++;
        }
        System.out.println(count);
        System.out.println("만약 10연뽑에 들어가는 재화의 양이 3000다이아 일 경우");
        System.out.println("필요한 재화의 양: "+count*3000+"다이아");
        System.out.println("실제 돈의 양: "+count*100000+"원");
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

class Calculation {
//    ramdom 메서드 정의
    static String random(String value, int rate) { //value: 원하는 값의 문자열형식의 이름, rate: 원하는 값이 랜덤하게 나오는 비율
        int repeatNum = 1; //문자열이 섞이는 횟수를 repeatNum에 저장
        String[] valArr = new String[100000]; //100칸 짜리 배열 valArr 선언 (이유는 비율이 백분율이기 때문)
        for (int i = 0; i < rate; i++) { // 비율만큼 valArr에 원하는 값을 배열에 순차적으로 할당
            valArr[i] = value;
        }
        for (int i = 0; i < repeatNum; i++) { // 배열을 섞는 반복문
            int randomNum = (int)(Math.random()*100000); //randomNum에 0~99중 랜덤하게 반환되는 수를 저장
            String tmp = valArr[randomNum]; //자리 교환을 위한 임시 변수 tmp 선언 후, tmp에 randomNum 번지 값을 저장
            valArr[randomNum] = valArr[i];// randomNum에 i번째 값을 저장
            valArr[i] = tmp; // i번째에 randomNum번째 값을 저장 -> 이 과정으로 i번째 값과 randomNum번째 값의 자리가 교환
//            System.out.println(Arrays.toString(valArr)); //확인을 위한 과정으로 이후 주석처리 요망.
        }
        int finalCalculateVal = (int)(Math.random()*100000); // 뒤섞인 배열 중 임의의 한 칸의 주소를 택해 finalCalculateVal에 저장
//        System.out.println(valArr[finalCalculateVal]); // 확인을 위한 과정으로 이후 주석처리 요망.
        return valArr[finalCalculateVal]; // 최종적으로 뒤섞인 배열 가운데 임의의 한 값을 골라 반환
    }
}