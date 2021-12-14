package ru.zelenkov;

public class Bot {
    private final float MAX_HEIGHT=1f;//m
    private final float MAX_LENGTH=3f;//km


    public boolean jump(double height) {
        if (height <= MAX_HEIGHT) {
            System.out.printf("Робот перепрыгнул %.1f метровую стену\n", height);
            return true;
        } else {
            System.out.printf("Робот не смог перепрыгнуть %.1f метровую стену\n", height);
            return false;
        }
    }


    public boolean run(double length) {
        if (length <= MAX_LENGTH) {
            System.out.printf("Робот пробежал %.1f километровую дорожку\n", length);
            return true;
        } else {
            System.out.printf("Робот не смог пробежать %f километровую дорожку\n", length);
            return false;
        }
    }
}
