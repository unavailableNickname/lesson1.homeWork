package ru.zelenkov;

import java.util.Random; //

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Object[] obstacles = new Object[10];
        for (int i = 0; i < obstacles.length; i+=2) {
            obstacles[i] = new Wall( 0.1f + r.nextFloat() * (2.5f - 0.1f));
            obstacles[i+1] = new Track( 0.1f + r.nextFloat() * (2.5f - 0.1f));
        }
        Object[] players = new Object[10];
        players[0] = new Man();
        players[1] = new Cat();
        players[2] = new Bot();
        players[3] = new Man();
        players[4] = new Cat();
        players[5] = new Bot();
        players[6] = new Man();
        players[7] = new Cat();
        players[8] = new Bot();
        players[9] = new Man();

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (players[i] instanceof Man){
                    if(obstacles[j] instanceof Wall){
                        if(!(((Man)players[i]).jump(((Wall)obstacles[j]).getHeight()))){
                            break;
                        }
                    } else {
                        if(!(((Man)players[i]).run(((Track)obstacles[j]).getLength()))){
                            break;
                        }
                    }
                } else if(players[i] instanceof Cat){
                    if(obstacles[j] instanceof Wall){
                        if(!(((Cat)players[i]).jump(((Wall)obstacles[j]).getHeight()))){
                            break;
                        }
                    } else {
                        if(!(((Cat)players[i]).run(((Track)obstacles[j]).getLength()))){
                            break;
                        }
                    }
                } else {
                    if(obstacles[j] instanceof Wall){
                        if(!(((Bot)players[i]).jump(((Wall)obstacles[j]).getHeight()))){
                            break;
                        }
                    } else {
                        if(!(((Bot)players[i]).run(((Track)obstacles[j]).getLength()))){
                            break;
                        }
                    }
                }

            }
        }
    }
}
