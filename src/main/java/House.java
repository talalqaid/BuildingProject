import java.util.Objects;

public class House extends Building {
    private int numOfRooms;
    private boolean hasGarage;
    private static int numOfHouses = 0;

    public House(String owner, String address, int numOfRooms, boolean hasGarage) {
        super(owner, address);
        this.numOfRooms = numOfRooms;
        this.hasGarage = hasGarage;
        numOfHouses++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        House house = (House) o;
        return numOfRooms == house.numOfRooms && hasGarage == house.hasGarage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numOfRooms, hasGarage);
    }

    public static void setZeroHouses() {
        House.numOfHouses = 0;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public static int getNumOfHouses() {
        return numOfHouses;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House{" + "Owner="+getOwner()+
                ", Address="+getAddress()+
                ", numOfRooms=" + numOfRooms +
                ", hasGarage=" + hasGarage +
                '}';
    }

    public static void main(String[] args) {
        House h1 = new House("John", "Doe", 3, true);
        System.out.println(h1);
        System.out.println("Number of Houses:"+House.getNumOfHouses());
    }
}
