package sound;

import sound.SoundClip;

public class Demo {

    public static void main(String[] args) {

        String path = "media/boing.wav";
        SoundClip audioFile = new SoundClip(path);
        audioFile.open();
        audioFile.play(true);
        audioFile.close();

    }
}
