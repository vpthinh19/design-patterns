package structural.composite.b3;

public class Main {
    static void main() {
        Component folder1 = new Folder("folderA", "1");
        Component folder2 = new Folder("folderB", "2");
        Component file1 = new File("file1", "1");
        Component file2 = new File("file2", "1");
        Component root = new Folder("root", "2");
        root.addItem(folder1);
        folder1.addItem(folder2);
        folder2.addItem(file1);
        folder2.addItem(file2);
        System.out.println(folder1.getStringTreeFolder(""));
        System.out.println(file2.getPath());
    }
}
