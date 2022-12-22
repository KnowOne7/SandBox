package Udemy_complete;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + "MB and " + remainder + " KB");


    }

}
