
class S {
    private final String sid;
    private final int classNo = 2; //can't re-assign final variable

    public S(String id) {
        this.sid = id;
    }

    public String getSid() {
        return sid;
    }
                // Setter won't work, as you can't re-assign value to final
//    private void setSid(String sid) {     // variable
//        this.sid = sid;
//    }


}

public class FinalVars {
    public static void main(String[] args) {
        S s = new S("A20");
        System.out.println("Id : "+s.getSid());
    }
}
