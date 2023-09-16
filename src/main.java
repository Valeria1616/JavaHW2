public class main {

    public static void main(String[] args) {

        int ticketPrice = 500;
        int perMiles = 20;

        int bonusMiles = ticketPrice / perMiles;

        System.out.println("Начислено: " + bonusMiles + " бонусных миль");
    }
}