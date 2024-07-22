
abstract class ComputerScience {

    String topic;

    ComputerScience(String t) {
        this.topic = t;
    }

    abstract void branch();

//    void subjectDetails(ComputerScience cs) { This method doesn't make much sense because it's already instance method and
//        System.out.println("Name : "+cs.topic); //it can access topic variable which we try to obtain via object
//    }

    void subjectDetails() {
        System.out.println("Topic is : "+topic);
    }
}

class CyberSecurity extends ComputerScience {

    CyberSecurity(String topic) {
        super(topic);
    }

    @Override
    public void branch() {
        System.out.println("MS in CyberSecurity");
    }

    @Override
    public void subjectDetails() {
        System.out.println("Its an important topic !! : "+this.topic);
    }

}

class MachineLearning extends ComputerScience {
    MachineLearning(String t) {
        super(t);
    }
    @Override
    public void branch() {
        System.out.println("Machine Learning");
    }
}

class DeepLearning extends ComputerScience {
    DeepLearning(String topic) {
        super(topic);
    }
    @Override
    public void branch() {
        System.out.println("Deep Learning");
    }

//    @Override
//    public void subjectDetails() {
//        System.out.println("Its a deep subject ... "+this.topic);
//    }
}

public class InstanceInitializer7 {
    public static void main(String[] args) {
        ComputerScience cs = new CyberSecurity("CyberSecurity");
        cs.branch();
        cs.subjectDetails();

        System.out.println();

        MachineLearning ml = new MachineLearning("Machine Learning");
        ml.branch();
        ml.subjectDetails();

        System.out.println();

        DeepLearning dl = new DeepLearning("Deep Learning");
        dl.branch();
        dl.subjectDetails();
    }
}
