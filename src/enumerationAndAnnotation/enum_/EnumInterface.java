package enumerationAndAnnotation.enum_;

public class EnumInterface {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}

interface Playing{
    public void playing();
}

enum Music implements Playing{
    CLASSICMUSIC;
    @Override
    public void playing() {
        System.out.println("playing the music");
    }
}




