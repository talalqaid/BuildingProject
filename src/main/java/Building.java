import java.util.Objects;

public class Building {
    private String owner;
    private String address;
    private static int numOfBuildings = 0;

    public Building(){
        this.owner = "";
        this.address = "";
        numOfBuildings++;
    }

    public static void setZeroBuildings() {
        Building.numOfBuildings = 0;
    }

    public Building(String owner, String address) {
        this.owner = owner;
        this.address = address;
        numOfBuildings++;
    }

    public String getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }

    public static int getNumOfBuildings() {
        return numOfBuildings;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(owner, building.owner) && Objects.equals(address, building.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, address);
    }

    public static void main(String[] args) {
        Building b1 = new Building();
        b1.setOwner("John");
        b1.setAddress("123 Main St");
        System.out.println(b1);
        Building b2 = new Building("Peter", "234 High St");
        System.out.println(b2);
        System.out.println("Number of Buildings:"+Building.getNumOfBuildings());
    }
}
