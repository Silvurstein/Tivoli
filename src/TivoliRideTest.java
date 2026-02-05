import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you height: ");
        int height = sc.nextInt();

        TivoliRide ride = new TivoliRide(height);

        System.out.println(ride.getTivoliRide());

        sc.close();

    }
}
