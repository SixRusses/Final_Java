package m1.examen_final.tache3;


import java.io.File;

import static m1.examen_final.tache3.FileManipulation.*;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "/Users/nyftheart/Documents/examen_final";
        String prefix = "";
        printFiles(directoryPath);
        System.out.println("taille du fichier" + totalSizeOfFiles(directoryPath));
        File mostRecent = mostRecentFile(directoryPath);
        if (mostRecent != null) {
            System.out.println("le plus récent: " + mostRecent.getAbsolutePath());
        } else {
            System.out.println("dossicer vide");
        }
        printFilesStartingWith(directoryPath, prefix);
        printFilesStartingWithStaticInnerClass(directoryPath, prefix);
        printFilesStartingWithAnonymousClass(directoryPath, prefix);
    }
}