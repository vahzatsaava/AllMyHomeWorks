package com.company.strings.romNetStrings.twofightersonewinner;

import java.util.Random;
//Создайте функцию, которая возвращает
// имя победителя в схватке двух бойцов.
//Каждый боец ​​по очереди атакует
// другого, и тот, кто убивает другого первым, побеждает. Смерть определяется как наличие здоровья <= 0.
//Каждый боец ​​будет объектом / экземпляром Истребителя. См. Класс Истребителя ниже на выбранном вами языке.
//И health, и damagePerAttack (damage_per_attack для python) будут целыми числами больше 0. Вы можете изменять объекты Fighter.
public class Main {
    public static String declareWinner(Fighter fighter1, Fighter fighter2) {
        int damageFighter1 = 0;
        int damageFighter2 = 0;
        String res = "";
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 0) {
            while (true) {
                damageFighter1 = fighter2.health - fighter1.damagePerAttack;
                damageFighter2 = fighter1.health - fighter2.damagePerAttack;
                fighter2.health = damageFighter1;
                fighter1.health = damageFighter2;
                if (fighter1.health <= 0 && fighter2.health <= 0){
                    return "Оба соперника повержены ! ";
                }
                else if (fighter1.health <= 0) {
                    return res += fighter2.name;
                } else if (fighter2.health <= 0) {
                    return res += fighter1.name;
                }
            }
        }
            else {
            while (true) {
                damageFighter2 = fighter1.health - fighter2.damagePerAttack;
                damageFighter1 = fighter2.health - fighter1.damagePerAttack;
                fighter1.health = damageFighter2;
                fighter2.health = damageFighter1;
                if (fighter1.health <= 0 && fighter2.health <= 0){
                    return "Оба соперника повержены !";
                }
                else if (fighter1.health <= 0) {
                    return res += fighter2.name;
                } else if (fighter2.health <= 0) {
                    return res += fighter1.name;

                }
            }

        }
    }

    public static void main(String[] args) {
        Fighter fighter = new Fighter("Garry", 120, 5);
        Fighter fighter1 = new Fighter("Jon", 75, 5);
        String res = declareWinner(fighter,fighter1);
        System.out.println(res);

    }
}
