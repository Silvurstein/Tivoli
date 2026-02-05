
public class TivoliRide {

    int height;

    public TivoliRide(int height) {
        this.height = height;

    }

    public String getTivoliRide(){

        if (height >= 160) {
            return "Welcome to the ride weeeee";
        } else {
            return "You're too low homie, see ya";
        }

    }

}
