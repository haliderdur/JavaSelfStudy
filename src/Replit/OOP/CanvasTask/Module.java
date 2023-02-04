package Replit.OOP.CanvasTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Module {

    public String name;
    public ArrayList<File> files = new ArrayList<>();

    public Module(String name) {
        this.name = name;
    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }

    public void addFile(File object) {
        files.add(object);
    }

    public void removeFile(File object) {
        files.removeIf(p -> p.name.equals(object.name) && p.size == object.size);
    }

    @Override
    public String toString() {
        return name + "\nFiles:\n" + files.toString();
    }
}
