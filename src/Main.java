import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Isak isak = new Isak();
        Mae mae = new Mae();
        Thor thor = new Thor();
        Andre andre = new Andre();

        String input = sc.nextLine();
        switch (input) {
            case "Isak":
                isak.hello();
                break;
            case "Mae":
                mae.hello();
                break;
            case "Thor":
                thor.hello();
                break;
            case "Andre":
                andre.hello();
                break;
            case "Isak food":
                isak.food();
                break;
            case "Mae food":
                mae.food();
                break;
            case "Thor food":
                thor.food();
                break;
            case "Andre food":
                andre.food();
                break;
            default:
                break;
        }
    }
}