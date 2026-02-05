
public class TivoliRide {

    int height;

    public TivoliRide1(int height) {
        this.height = height;

    }

    public String getTivoliRide1(){

        if (height >= 160) {
            return "Welcome to the ride in our car";
        } else {
            return "You're too low for cars homie, see ya";
        }

    }

    public TivoliRide2(int height) {
        this.height = height;

    }

    public String getTivoliRide2(){

        if (height >= 20) {
            return "Welcome to the bike ride weeeee";
        } else {
            return "You're too low for bikes (what??) bye bye";
        }

    }

}
