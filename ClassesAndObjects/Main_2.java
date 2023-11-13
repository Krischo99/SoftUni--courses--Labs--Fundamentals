package Fundamentals.ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int songNumbers = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < songNumbers; i++) {

            String[] songInformation = scanner.nextLine().split("_");

            String typeList = songInformation[0];
            String name = songInformation[1];
            String time = songInformation[2];

            Song currentSong = new Song(typeList, name, time);

            songs.add(currentSong);
        }

        String filter = scanner.nextLine();
        int inter = 0;
        if (filter.equals("all")) {
            printElements(songs);
        } else {
            for (Song current : songs) {
                if (current.getTypeList().equals(filter)) {
                    System.out.println(current.getNameSong());
                }
                if (inter % 2 == 0){
                    System.out.println(current.getTest());
                }
                inter++;
            }
        }
    }

    public static void printElements(List<Song> songs) {

        for (Song currentSong : songs) {
            System.out.println(currentSong.getNameSong());
        }
    }
}
