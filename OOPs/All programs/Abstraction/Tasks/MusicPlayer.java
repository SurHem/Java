// Music Player Application
// Develop an abstract class called "MediaPlayer" with abstract methods like "play" and "stop." Implement derived classes like "AudioPlayer" and "VideoPlayer" that provide specific implementations for these abstract methods.

abstract class MediaPlayer{
    abstract void play();
    abstract void stop();
}

class AudioPlayer extends MediaPlayer{


    @Override
    public void play(){
        System.out.println("Playing audio");
    }

    @Override
    public void stop(){
        System.out.println("Stopping audio");
    }
}

class VideoPlayer extends MediaPlayer{

    @Override
    public void play(){
        System.out.println("Playing Video");
    }

    @Override
    public void stop(){
        System.out.println("Stopping Video");
    }
}

public class MusicPlayer {
    public static void main(String args[]){
        AudioPlayer a = new AudioPlayer();
        VideoPlayer v = new VideoPlayer();
        
        a.play();
        a.stop();
        v.play();
        v.stop();

    }
    
}
