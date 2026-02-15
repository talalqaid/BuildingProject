import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Building[] build=new Building[12];
        File file=new File("src/main/java/buildings.txt");
        Scanner sc=new Scanner(file);
        int i=0;
        while(sc.hasNext()){
            String line=sc.nextLine();
            String[] tokens=line.split("\\|");
            String type = tokens[0];
            String owner = tokens[1];
            String address = tokens[2];

            switch (type) {
                case "H":
                    int rooms = Integer.parseInt(tokens[3]);
                    boolean hasGarage = Boolean.parseBoolean(tokens[4]);
                    build[i]=new House(owner, address, rooms, hasGarage);
                    break;
                case "S":
                    int employees = Integer.parseInt(tokens[3]);
                    int turnover = Integer.parseInt(tokens[4]);
                    build[i]=new Shop(owner, address, employees, turnover);
                    break;
                case "B":
                default:
                    build[i]=new Building(owner, address);
                    break;
            }
            i++;
        }
        sc.close();
        i=0;
        for(Building b:build){
            System.out.print("Building:"+i+"\n");
            System.out.println(b);
            i++;
        }
    }
}
