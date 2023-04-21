/**
 * The purpose of this class is to model a television.
 * Written by Getnet Workalemahu on 04/20/23.
 */
public class Television {

    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     * Constructor method for creating a new Television object.
     * @param brand the manufacturer's brand name
     * @param size the size of the television screen
     */
    public Television(String brand, int size) {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        channel = 2;
        volume = 20;
    }

    /**
     * Returns the current volume of the television.
     * @return the current volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Returns the current channel of the television.
     * @return the current channel
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Returns the manufacturer's brand name of the television.
     * @return the manufacturer's brand name
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * Returns the size of the television screen.
     * @return the size of the screen
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     * Sets the channel of the television to the specified value.
     * @param channel the desired channel
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }

    /**
     * Toggles the power state of the television.
     */
    public void power() {
        powerOn = !powerOn;
    }

    /**
     * Increases the volume of the television by 1.
     */
    public void increaseVolume() {
        volume++;
    }

    /**
     * Decreases the volume of the television by 1.
     */
    public void decreaseVolume() {
        volume--;
    }
}