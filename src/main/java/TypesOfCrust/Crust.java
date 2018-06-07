package TypesOfCrust;

public class Crust {
    public static void main(String[] args) {
       String crust = "thick";
        switch(crust){
            case "thinCrust": System.out.println("Thin Crust");break;
            case "semiThick": System.out.println("Semi Thick");break;
            default:System.out.println("Thick");
        }
    }

}
