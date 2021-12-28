package com.example;

public class Notepad {
    int id;
    String notepadContent;
    String notepadTime;

    @Override
    public String toString() {
        return "Notepad [ notepadContent=" + notepadContent + ", notepadTime=" + notepadTime + "]";
    }
}

