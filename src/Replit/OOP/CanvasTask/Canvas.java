package Replit.OOP.CanvasTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Canvas {

    public String topic;
    public ArrayList<Quiz> quizzes = new ArrayList<>();
    public ArrayList<Module> modules = new ArrayList<>();

    public Canvas(String topic) {
        this.topic = topic;
        // ArrayList<String> list = new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return topic + " course\nQuizzes:\n" + quizzes.toString() + "\nModules:\n" + modules.toString();
    }
}
