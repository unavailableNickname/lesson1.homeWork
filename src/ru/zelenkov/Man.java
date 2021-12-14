package ru.zelenkov;

public class Man {
    private final float MAX_HEIGHT=0.7f;//m
    private final float MAX_LENGTH=1f;//km


    public boolean jump(double height) {
        if (height <= MAX_HEIGHT) {
            System.out.printf("Человек перепрыгнул %.1f метровую стену\n", height);
            return true;
        } else {
            System.out.printf("Человек не смог перепрыгнуть %.1f метровую стену\n", height);
            return false;
        }
    }


    public boolean run(double length) {
        if (length <= MAX_LENGTH) {
            System.out.printf("Человек пробежал %.1f километровую дорожку\n", length);
            return true;
        } else {
            System.out.printf("Человек не смог пробежать %.1f километровую дорожку\n", length);
            return false;
        }
    }
}
