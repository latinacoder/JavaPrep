package Section6;

public class Section6Main {
    public static void main(String[]args){

//If Statement - we are replacing with a Switch statement
     //   int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
    int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            //more code
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a: " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
    }
}
