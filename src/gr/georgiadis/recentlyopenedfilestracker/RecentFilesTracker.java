package gr.georgiadis.recentlyopenedfilestracker;

import java.util.LinkedHashSet;
import java.util.List;

public class RecentFilesTracker {
    private final LinkedHashSet<String> recentFiles;
    private final int maxSize;

    // Constructor: specify max number of recent files to keep
    public RecentFilesTracker(int maxSize) {
        this.maxSize = maxSize;
        this.recentFiles = new LinkedHashSet<>();
    }

    /*
    ** Call this method whenever a file is opened.
    ** It adds the file to the recent list, moves it to the front if already present,
    ** and removes the oldest if size exceeds maxSize.
    */
    public void openFile(String filePath) {
        // If already present, remove it so we can add it again to update order
        recentFiles.remove(filePath);

        // Add to end (newest)
        recentFiles.add(filePath);

        // If size exceeded, remove oldest (the first in insertion order)
        if (recentFiles.size() > maxSize) {
            recentFiles.removeFirst();
        }
    }

    // Returns recent files as a list with most recent first.
    public List<String> getRecentFiles() {
        return recentFiles.stream().toList().reversed();
    }

    // Print recent files with most recent first.
    public void printRecentFiles() {
        recentFiles.stream().toList().reversed().forEach(System.out::println);
    }
}
