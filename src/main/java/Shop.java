public class Shop extends Building{
    private int numOfEmployees;
    private double averageTurnover;
    private static int numOfShops=0;

    public Shop(String owner, String address, int numOfEmployees, double averageTurnover) {
        super(owner, address);
        this.numOfEmployees = numOfEmployees;
        this.averageTurnover = averageTurnover;
        numOfShops++;
    }

    public static int getNumOfShops() {
        return numOfShops;
    }

    public static void setZeroShops() {
        Shop.numOfShops = 0;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public double getAverageTurnover() {
        return averageTurnover;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public void setAverageTurnover(double averageTurnover) {
        this.averageTurnover = averageTurnover;
    }

    @Override
    public String toString() {
        return "Shop{" +"owner="+getOwner()+
                ", address="+getAddress()+
                ", numOfEmployees=" + numOfEmployees +
                ", averageTurnover=" + averageTurnover +
                '}';
    }
}
