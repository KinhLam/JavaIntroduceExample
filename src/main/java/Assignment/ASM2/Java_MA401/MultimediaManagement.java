package Assignment.ASM2.Java_MA401;

import java.util.ArrayList;
import java.util.List;

public class MultimediaManagement {
    List<Multimedia> listOfMultimedia;

    public MultimediaManagement() {
        this.listOfMultimedia = new ArrayList<>();
    }

    public void addMultimedia(Multimedia m) {
        listOfMultimedia.add(m);
    }

    public void displayMultimedia() {
        System.out.println("-------LIST OF MULTIMEDIA-------");
        for (Multimedia m : listOfMultimedia) {
            System.out.println(m);
        }
    }
}
