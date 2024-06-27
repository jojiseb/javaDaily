package objectAndClass;

import java.io.File;

interface Sender { //Sender is capable of sending a file, so we use it as an interface
    void send(File fileToBeSent);
}

class VideoSender implements Sender {
    @Override
    public void send(File fileToBeSent) {
        System.out.println("Video is been sent");
    }
}

class DocumentSender implements Sender {
    @Override
    public void send(File fileToBeSent) {
        System.out.println("Document has been sent");
    }
}

class ImageSender implements Sender {
    public void send(File fileToBeSent) {
        System.out.println("Image is been sent");
    }
}

public class SenderTest {
    public static void main(String[] args) {
        Sender video = new VideoSender();
        video.send(new File("//ABC.txt"));

        Sender document = new DocumentSender();
        document.send(new File("Doc.txt"));

        Sender image = new ImageSender();
        image.send(new File("Gif.jpg"));
    }
}
