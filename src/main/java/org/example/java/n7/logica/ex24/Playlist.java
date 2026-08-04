package org.example.java.n7.logica.ex24;

import org.example.java.n7.logica.ex23.Order;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist(){
        this.songs = new ArrayList<>();
    }

    public void addSong(String nameSong){
        if(findSongByName(nameSong) == -1 ){
            songs.add(new Song(nameSong));
        }
    }

    public void playSong(String nameSong){
        int index = findSongByName(nameSong) ;
        if(index != -1 ){
            songs.get(index).setStatus(StatusSong.PLAYED);
        }
    }
    public void removeSong(String nameSong){
        int index = findSongByName(nameSong) ;
        if(index != -1 ){
            songs.remove(index);
        }
    }



    private int findSongByName(String name){
        for (int i = 0; i <= songs.size() -1 ; i++) {
            if(songs.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public List<String> stringToList(){
        List<String> s = new ArrayList<>();
        StringBuilder sb =  new StringBuilder();
        sb.append("[");
        for(int i = 0; i <= songs.size() -1; i++){
            if(i == songs.size() -1){
                sb.append(songs.get(i).toString());
            }else {
                sb.append(songs.get(i).toString()+", ");
            }
        }
        sb.append("]");
        s.add(sb.toString());
        return s;
    }


}
