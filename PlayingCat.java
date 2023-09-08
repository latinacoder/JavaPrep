public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            // in summer, the upper limit is 45
            if (temperature >= 25 && temperature <= 45) {
                return true; // cat is playing
            } else {
                return false; // cat is not playing
            }
        } else { // if summer is false
            // in non-summer, the upper limit it 35
            if (temperature >= 25 && temperature <= 35) {
                return true; //cat is playing
            } else {
                return false; // cat is not playing
            }
        }
    }

    //condensed version 1:
//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        if (summer) {
//            return temperature >= 25 && temperature <= 45;
//        } else {
//            return temperature >= 25 && temperature <= 35;
//        }
//    }

    // condensed version 2:
//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        return summer ? (temperature >= 25 && temperature <= 45) : (temperature >= 25 && temperature <= 35);
//    }


    public static void main (String[] args){
        isCatPlaying(false,45);
    }
}

