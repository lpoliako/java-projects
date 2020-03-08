/** 
*The purpose of this class is to model a television
*Lennard Poliakov 3/8/20
*/
public class Television {
	//MANUFACTURER holds the brand name
	private String MANUFACTURER;
	//SCREEN_SIZE the size of the TV screen
	private int SCREEN_SIZE;
	//powerOn true if power is on 
	private boolean powerOn = false;
	//channel holds the value of the station the TV is showing
	private int channel = 2;
	//volume holds the value of the loudness
	private int volume = 20;
	
	//constructors that sets the manufacturer and screen size
	public Television(String MANUFACTURER, int SCREEN_SIZE) {
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
	}
	
	/*
	 * Gets the current loudness of the TV
	 * @return int volume
	 */
	public int getVolume(){
		return volume;
	}
	/*
	 * Gets the current station of the TV
	 * @return int channel
	 */
	public int getChannel() {
		return channel;
	}
	/*
	 * Gets the brand name
	 * @return String MANUFACTURER
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	/*
	 * Gets the screen size of the TV
	 * @return int SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	/*
	 * sets the channel value
	 * @param the channel to which the TV is changed to
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	/*
	 * Turns the TV off and on
	 * If TV on, then sets to off and vice versa
	 * @param void
	 */
	public void power() {
		powerOn = !powerOn;
	}
	/*
	 * Increases volume by one
	 * @param void
	 */
	public void increaseVolume() {
		this.volume += 1;
	}
	/*
	 * Decreases volume by one
	 * @param void
	 */
	public void decreaseVolume() {
		this.volume -= 1;
	}
}

