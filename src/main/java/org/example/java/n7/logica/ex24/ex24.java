package org.example.java.n7.logica.ex24;
import java.util.List;

public class ex24 {
    public static void main(String[] args) {
        List<String> commands  = List.of( "ADD_SONG Imagine",
                "ADD_SONG Yesterday",
                "PLAY Imagine",
                "REMOVE_SONG Yesterday");

        System.out.println(processPlaylist(commands));
    }

    public static List<String> processPlaylist(List<String> commands){
        Playlist playlist = new Playlist();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ADD_SONG")){
                playlist.addSong(c[1]);
            }
            else if(c[0].equals("PLAY")){
                playlist.playSong(c[1]);
            }
            else if(c[0].equals("REMOVE_SONG")){
                playlist.removeSong(c[1]);
            }

        }

        return playlist.stringToList();
    }
}
