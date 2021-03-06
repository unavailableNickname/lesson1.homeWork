package ru.zelenkov;
//
public class Cat {
    private final float MAX_HEIGHT=1.5f;//m
    private final float MAX_LENGTH=3f;//km


    public boolean jump(double height) {
        if (height <= MAX_HEIGHT) {
            System.out.printf("Кот перепрыгнул %.1f метровую стену\n", height);
            return true;
        } else {
            System.out.printf("Кот не смог перепрыгнуть %.1f метровую стену\n", height);
            return false;
        }
    }


    public boolean run(double length) {
        if (length <= MAX_LENGTH) {
            System.out.printf("Кот пробежал %.1f километровую дорожку\n", length);
            return true;
        } else {
            System.out.printf("Кот не смог пробежать %.1f километровую дорожку\n", length);
            return false;
        }
    }
}
