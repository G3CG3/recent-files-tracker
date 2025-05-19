# recent-files-manager

A lightweight Java 21+ utility demonstrating efficient tracking of recently opened files using a fixed-size `LinkedHashSet`.

## Overview

This project provides a `RecentFilesTracker` class that:

- Maintains a list of recently opened files
- Automatically removes the oldest entries when exceeding a fixed size
- Uses Java 21+ features for concise and efficient implementation

The tracker supports adding files via `openFile(String filePath)` and retrieving the list of recent files with `getRecentFiles()`.

---

## How to Use

1. Add the `RecentFilesTracker` class to your Java project.
2. Create an instance specifying the max size:

    ```java
    RecentFilesTracker tracker = new RecentFilesTracker(10);
    ```

3. Call `openFile()` whenever a file is opened:

    ```
    tracker.openFile("file1.txt");
    tracker.openFile("file2.txt");
    ```

4. Retrieve the recent files list (most recent last):

    ```
    List<String> recentFiles = tracker.getRecentFiles();
    recentFiles.forEach(System.out::println);
    ```
   
---

## Sample Usage Output

file1.txt <br>
file2.txt <br>
file3.txt <br>

---

## Concepts Demonstrated
- Java 21 LinkedHashSet enhancements

- Managing fixed-size collections

- Efficient file tracking with automatic eviction

---

## License
This project is licensed under the MIT License - see the LICENSE file for details.

Feel free to integrate and expand this utility in your Java applications!