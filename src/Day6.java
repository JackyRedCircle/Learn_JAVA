public class Day6 {
    public static void main(String[] args) {
//        * 추상클래스(abstract class)
//        추상클래스란 미완성 메서드를 포함하고 있는 클래스로 클레스 앞에 abstract 제어자를 붙임으로써 선언한다.
//        ex) abstract class name {}
//
//        * 추상메서드(abstract method)
//        꼭  필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 사용한다. 개념은 추상클래스와 동일하다. 역시 메서드 이름 앞에 abstract를 붙여서 선언.
//        ex) abstract void methodName () {}
//
//        * 추상클래스는 상속을 통해 자손클래스에 의해서만 완성될 수 있다.
//        단, 자손클래스에서 부모클래스에 있는 추상클래스를 전부 재정의 해주어야 에러가 나지 않음.
//          실습!
    }
}

//효과 번호 (effectKind 변수)
//1.독, 2.크리티컬, 3.주의분산

abstract class Creature {
// 생물체의 공통적인 속성을 담은 클래스로 미완성 메서드가 존재.
    String name;
    int LV, HP, MP, fireAttackVal, waterAttackVal, plantAttackVal, lightAttackVal, darkAttackVal, criticalVal;

    Creature (String name, int LV, int HP, int MP, int fireAttackVal, int waterAttackVal, int plantAttackVal, int lightAttackVal, int darkAttackVal) {
        this.name = name;
        this.LV = LV;
        this.HP = HP;
        this.MP = MP;
        this.fireAttackVal = fireAttackVal;
        this.waterAttackVal = waterAttackVal;
        this.plantAttackVal = plantAttackVal;
        this.lightAttackVal = lightAttackVal;
        this.darkAttackVal = darkAttackVal;
    }
    int Attack (int attackVal, int criticalRate) {
        if (Calculation.random("critical", criticalRate) == "critical") {
            System.out.printf("급소에 맞은 것 같다! [크리티컬 공격이 들어갔습니다. %d의 공격력이 들어갑니다.]%n", attackVal*3);
            return attackVal*3;
        }
        return attackVal;
    }

    int Defence (int defenceVal, int effectKind) {
        switch (effectKind) {
            case 1: {
                return defenceVal/2;
            }

            case 2: {
                return defenceVal*2;
            }

            case 3: {
                return defenceVal/4;
            }
        }
        return defenceVal;
    }

    abstract int level (int LV);
}

class Human extends Creature {

    Human (String name, int LV, int HP, int MP, int fireAttackVal, int waterAttackVal, int plantAttackVal, int lightAttackVal, int darkAttackVal) {
        super(name, LV, HP, MP, fireAttackVal, waterAttackVal, plantAttackVal, lightAttackVal, darkAttackVal);
    }

    int level (int LV) {
        super.LV = LV;
        return LV;
    }
}

class Enemy extends Creature {

    Enemy(String name, int LV, int HP, int MP, int fireAttackVal, int waterAttackVal, int plantAttackVal, int lightAttackVal, int darkAttackVal) {
        super(name, LV, HP, MP, fireAttackVal, waterAttackVal, plantAttackVal, lightAttackVal, darkAttackVal);
    }

    int level (int LV) {
        super.LV = LV;
        return LV;
    }
}