package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Arctic Monkeys", 2002));
        bands.add(new MusicBand("Black Rebel Motorcycle Club", 1998));
        bands.add(new MusicBand("Muse", 1994));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Nirvana", 1988));
        bands.add(new MusicBand("Fall Out Boy", 2001));
        bands.add(new MusicBand("The Killers", 2001));
        bands.add(new MusicBand("Pink Floyd", 1965));
        bands.add(new MusicBand("System of a Down", 1992));
        bands.add(new MusicBand("Royal Blood", 2011));
        Collections.shuffle(bands);

        for (MusicBand band : bands) {
            System.out.println(band.getName());
        }
        System.out.println();

        List<MusicBand> groupsAfter2000 = groupsAfter2000(bands);
        for (MusicBand band : groupsAfter2000) {
            System.out.println(band.getName());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}
