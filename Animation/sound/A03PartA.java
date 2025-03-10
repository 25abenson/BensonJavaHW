package sound;

import javax.sound.sampled.LineUnavailableException;

import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class A03PartA {
    public static void main(String[] args) throws LineUnavailableException {
        ToneGenerator tg = new ToneGenerator();
        tg.init();
        // old mcdonald had a farm
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 400);
        tg.play(Note.REST, 50);

        // EIEIO
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 400);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);

        tg.play(Note.REST, 50);
        tg.play(Note.REST, 50);
        tg.play(Note.REST, 50);

        // and on that farm he had a cow
        tg.play(Note.D4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 400);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.E4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.D4, 400);
        tg.play(Note.REST, 50);

        // EIEIO
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.B4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 400);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.close();
    }
}
