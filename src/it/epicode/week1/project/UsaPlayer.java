package it.epicode.week1.project;

import java.util.Scanner;

public class UsaPlayer {
    public static void main(String[] args) {

        String[] canzoni = {"canzone1", "canzone2", "canzone3", "canzone4", "canzone5"};
        String[] film = {"film1", "film2", "film3", "film4", "film5"};
        String[] immagini = {"foto1.jpg", "foto2.jpg", "foto3.jpg", "foto4.jpg", "foto5.jpg"};


        ListaAudio listaAudio = new ListaAudio(canzoni);
        ListaVideo listaVideo = new ListaVideo(film);
        ListaImmagini listaImmagini = new ListaImmagini(immagini);


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Cosa vuoi riprodurre? Seleziona il tipo di file:\n" +
                    "1. Audio\n" +
                    "2. Video\n" +
                    "3. Immagine\n" +
                    "Scelta " + (i + 1) + ": ");}


               Audio audio = new Audio("canzone1", 3, 5);

            audio.play();
                audio.alzaVolume(10);
                audio.play();


                Video video = new Video("film2", 3, 5, 7);

                video.play();
                video.aumentaLuminosita(11);
                video.play();



                Immagine immagine = new Immagine("foto3.jpg", 5);

                immagine.show();
                immagine.aumentaLuminosita(8);
                immagine.show();


            }
        }

