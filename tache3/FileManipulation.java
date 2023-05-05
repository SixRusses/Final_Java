package m1.examen_final.tache3;

import java.io.*;

public class FileManipulation {

    public static void printFiles(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }

    public static long totalSizeOfFiles(String directoryPath) {
        long totalSize = 0;
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                totalSize += file.length();
            }
        }
        return totalSize;
    }

    public static File mostRecentFile(String directoryPath) {
        File mostRecentFile = null;
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        long lastModifiedTime = Long.MIN_VALUE;
        for (File file : files) {
            if (file.lastModified() > lastModifiedTime) {
                mostRecentFile = file;
                lastModifiedTime = file.lastModified();
            }
        }
        return mostRecentFile;
    }

    static class StartsWithFilter implements FilenameFilter {
        private String prefix;

        public StartsWithFilter(String prefix) {
            this.prefix = prefix;
        }

        public boolean accept(File directory, String name) {
            return name.startsWith(prefix);
        }
    }

    public static void printFilesStartingWith(String directoryPath, String prefix) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles(new StartsWithFilter(prefix));
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
    public static void printFilesStartingWithStaticInnerClass(String directoryPath, String prefix) {
        class StartsWithFilter implements FilenameFilter {
            private String prefix;

            public StartsWithFilter(String prefix) {
                this.prefix = prefix;
            }

            public boolean accept(File directory, String name) {
                return name.startsWith(prefix);
            }
        }

        File directory = new File(directoryPath);
        File[] files = directory.listFiles(new StartsWithFilter(prefix));
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }

    public static void printFilesStartingWithAnonymousClass(String directoryPath, final String prefix) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String name) {
                return name.startsWith(prefix);
            }
        });
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }

}

