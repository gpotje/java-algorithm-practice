package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void win(){
        this.score ++;
    }
    public void lose(){
        if(this.score > 0){
            this.score --;
        }
    }
    public void reset(){
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name+":"+score;

    }
}

public class ex21 {
    public static void main(String[] args) {
        List<String> commands  = List.of(  "LOSE Ana",
                "WIN Ana",
                "RESET Ana",
                "WIN Pedro");

        System.out.println(updateRanking(commands));
    }

    public static List<String> updateRanking(List<String> events){
        List<Player> p = new ArrayList<>();

        for (String s : events){
            String[] c = s.split(" ");
            int index = findIndex(p,c[1]);

            if(c[0].equals("WIN") && index == -1){
               p.add(new Player(c[1],1));
            }
            else if(c[0].equals("WIN") && index != -1){
                p.get(index).win();
            }

            if(c[0].equals("LOSE") && index != -1){
                p.get(index).lose();

            }else if(c[0].equals("RESET") && index != -1){
                p.get(index).reset();
            }

        }

        return  convertPalyerToList(p);
    }

    public static int findIndex(List <Player> player,String word){
        for (int i = 0; i <= player.size() -1 ; i++) {
            if(player.get(i).getName().equals(word)){
                return i;
            }
        }
        return -1;
    }
    public static List<String> convertPalyerToList(List<Player>p){
        ArrayList<String> strings = new ArrayList<>();
        for(Player player:p){
            strings.add(player.toString());
        }
        return strings;
    }
}
