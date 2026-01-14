package milestone1.module6.module6Assignment;

public class Owner {
    private String name;
    private String address;
    private int petsAdopted;


    public Owner(String address, String name) {
        this.address = address;
        this.name = name;
        this.petsAdopted = 0;
    }

    public void adoptPet(Pet pet) {
        petsAdopted++;
        System.out.println("You have adopted " + pet.getName() + "!");
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getPetsAdopted() {
        return petsAdopted;
    }
}
