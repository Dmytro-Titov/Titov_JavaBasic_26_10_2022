package com.hillel.titov.lessons.lesson13.Music;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles group : musicStyles) {
            group.playMusic();
        }
    }
}
