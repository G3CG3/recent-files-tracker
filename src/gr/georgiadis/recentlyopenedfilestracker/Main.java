package gr.georgiadis.recentlyopenedfilestracker;

public class Main {
    public static void main(String[] args) {
        RecentFilesManager manager = new RecentFilesManager(5);

        manager.openFile("file1.txt");
        manager.openFile("file2.txt");
        manager.openFile("file3.txt");
        manager.openFile("file2.txt"); // file2 moved to most recent
        manager.openFile("file4.txt");
        manager.openFile("file5.txt");
        manager.openFile("file6.txt"); // file1 removed (oldest)

        manager.printRecentFiles();
        manager.getRecentFiles().forEach(System.out::println);
    }
}
