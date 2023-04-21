import java.util.Scanner;

/** 
* This class tests the Television class
*/
public class TelevisionDemo {
    public static void main(String[] args) {
        // create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        // declare variables
        int station; // the user’s channel choice
        // declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        Television portable = new Television("Sharp", 19);
        // turn the power on
        bigScreen.power();
        // display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() + "-inch " + bigScreen.getManufacturer() + " has been turned on.");
        System.out.println("A " + portable.getScreenSize() + "-inch " + portable.getManufacturer() + " has been turned on.");
        // prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        // change the channel on the television
        bigScreen.setChannel(station);
        // set the channel of the second television
        portable.setChannel(70);
        // increase the volume of the first television
        bigScreen.increaseVolume();
        // display the current channel and volume of the first television
        System.out.println("Channel: " + bigScreen.getChannel() + ", Volume: " + bigScreen.getVolume());
        System.out.println("Too loud!! I am lowering the volume.");
        // decrease the volume of the first television
        bigScreen.decreaseVolume();
        // display the current channel and volume of the first television
        System.out.println("Channel: " + bigScreen.getChannel() + ", Volume: " + bigScreen.getVolume());
        System.out.println(); // for a blank line
        // display the current channel and volume of the second television
        System.out.println("2nd TV - Channel: " + portable.getChannel() + ", Volume: " + portable.getVolume());
        System.out.println("Changing the channel on 2nd TV to 3.");
        // change the channel of the second television
        portable.setChannel(3);
        // decrease the volume of the second television
        portable.decreaseVolume();
        // display the current channel and volume of the second television
        System.out.println("2nd TV - Channel: " + portable.getChannel() + ", Volume: " + portable.getVolume());
    }
}