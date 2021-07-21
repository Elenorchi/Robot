package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHead SonyHead1 = new SonyHead(300);
        ILeg ToshibaLeg1 = new ToshibaLeg(200);
        IHand SonyHand1 = new SonyHand(150);
        Robot robot1 = new Robot(SonyHead1, SonyHand1, ToshibaLeg1);
        robot1.action();
        System.out.println(robot1.getPrice());

        IHead SonyHead2 = new SonyHead(300);
        ILeg SamsungLeg2 = new SamsungLeg(350);
        IHand SonyHand2 = new SonyHand(150);
        Robot robot2 = new Robot(SonyHead2, SonyHand2, SamsungLeg2);
        robot2.action();
        System.out.println(robot2.getPrice());

        IHead ToshibaHead3 = new ToshibaHead(150);
        ILeg ToshibaLeg3 = new ToshibaLeg(200);
        IHand ToshibaHand3 = new ToshibaHand(100);
        Robot robot3 = new Robot(ToshibaHead3, ToshibaHand3, ToshibaLeg3);
        robot3.action();
        System.out.println(robot3.getPrice());

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Робот 1 самый дорогой");
        } else if
        (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Робот 2 самый дорогой");
        } else if
        (robot3.getPrice() > robot1.getPrice() && robot3.getPrice() > robot2.getPrice()) {
            System.out.println("Робот 3 самый дорогой");
        }
    }
}

