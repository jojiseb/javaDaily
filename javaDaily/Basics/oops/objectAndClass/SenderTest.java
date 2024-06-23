package objectAndClass;

import java.io.File;

interface Sender {
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

public class SenderTest {
    public static void main(String[] args) {
        Sender sender = new VideoSender();
    }
}
