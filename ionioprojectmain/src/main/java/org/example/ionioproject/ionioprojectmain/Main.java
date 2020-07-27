package org.example.ionioproject.ionioprojectmain;

import org.example.ionioproject.ionioprojectutil.FirstTask;
import org.example.ionioproject.ionioprojectutil.SecondTask;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FirstTask.fileReader();

        System.out.println();

        File src = new File("C:\\Users\\Mik\\IdeaProjects\\nix\\ionioproject\\test");
        File dest = new File("C:\\Users\\Mik\\IdeaProjects\\nix\\ionioproject\\newfolder");

        SecondTask.copyDirectory(src, dest);
    }
}
