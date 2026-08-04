package org.example.java.n7.logica.ex24;


public class Song {

    private String name;
    private StatusSong status;

    public Song(String name) {
        this.name = name;
        this.status = StatusSong.NEW;
    }

    public String getName() {
        return name;
    }

    public void setStatus(StatusSong status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + "(" + status+")";
    }
}
