package milestone1.module5.module5part2;

import java.time.LocalDateTime;

class Voter{
    private final String nid;
    String name;
    LocalDateTime localDateTime;

    public Voter(String nid, String name) {
        this.nid = nid;
        this.name = name;
//        localDateTime = LocalDateTime.now();
    }


    @Override
    public String toString() {
//        return "Voter{" +
//                "nid='" + nid + '\'' +
//                ", name='" + name + '\'' +
//                '}';

//        return "Name: " + name + " NID: " + nid + " " + localDateTime.toString();  // We can customize toString()
//        nid = "thisIsChanged";   // make it final to avoid mistake

        return "Name: " + name + " NID: " + nid;
    }
}


public class EncapsulationAndAccessControl {
    public static void main(String[] args){
        Voter lily = new Voter("1234", "lily");
        Voter zohra = new Voter("6789", "Zohra");

//        System.out.println(lily.nid);
//        System.out.println(lily);     // writ click on Voter & generate toString() to see the value

//        lily.name = "lota";
//        lily.nid = "00000";
//        System.out.println(lily);

    }
}
