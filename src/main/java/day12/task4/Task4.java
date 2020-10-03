package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Brian May");
        members1.add("Roger Taylor");
        MusicBand band1 = new MusicBand("Smile", 1968, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Freddie Mercury");
        members2.add("John Deacon");
        MusicBand band2 = new MusicBand("Queen", 1970, members2);

        MusicBand.transferMembers(band1, band2);

        System.out.println("Состав группы " + band1.getName() + ":");
        band1.printMembers();
        System.out.println("Состав группы " + band2.getName() + ":");
        band2.printMembers();
    }
}
