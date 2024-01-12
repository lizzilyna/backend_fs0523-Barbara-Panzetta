package it.epicode.week1.project;

import java.util.Scanner;

public class UsaPlayer {
    public static void main(String[] args) {








Audio audio=new Audio("A vuo frnì", 3, 5);

    audio.play();
    audio.alzaVolume(10);
    audio.play();
    audio.abbassaVolume(8);
    audio.play();
    audio.alzaVolume(9);
    audio.play();
    audio.abbassaVolume(5);

Video video=new Video("Rochelle Rochelle", 5, 15, 10);

video.play();
video.aumentaLuminosita(11);
video.play();
video.diminuisciLuminosita(5);
video.play();
video.abbassaVolume(9);
video.play();


Immagine immagine=new Immagine("gatto.jpg", 5);

immagine.show();
immagine.aumentaLuminosita(10);
immagine.show();
immagine.diminuisciLuminosita(7);
immagine.show();

    }
}
