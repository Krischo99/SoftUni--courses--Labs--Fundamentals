package Fundamentals.ClassesAndObjects;

public class Song {

    private String typeList;
    private String nameSong;
    private String timeSong;
    private String test;

    public Song(String typeList, String name, String time) {

        this.typeList = typeList;
        this.nameSong = name;
        this.timeSong = time;

    }

    public String getNameSong() {

        return this.nameSong;
    }

    public String getTypeList() {

        return this.typeList;
    }

    public String getTest() {

        return test;
    }
}