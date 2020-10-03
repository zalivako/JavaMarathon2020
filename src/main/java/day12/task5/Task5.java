package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Brian May", 1947));
        members1.add(new MusicArtist("Roger Taylor", 1949));
        MusicBand band1 = new MusicBand("Smile", 1968, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Freddie Mercury", 1946));
        members2.add(new MusicArtist("John Deacon", 1951));
        MusicBand band2 = new MusicBand("Queen", 1970, members2);

        MusicBand.transferMembers(band1, band2);

        System.out.println("Состав группы " + band1.getName() + ":");
        band1.printMembers();
        System.out.println("Состав группы " + band2.getName() + ":");
        band2.printMembers();
    }
}
