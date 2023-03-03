import phone.Phone;
import phone.Camera;
import phone.MusicPlayer;
public class SmartPhone extends Phone implements Camera,MusicPlayer
{
	//camera interface methods
	public void click()
	{
		System.out.println("click method");
	}
	public void record()
	{
		System.out.println("record method");
	}
	
	//MusicPlayer interface Methods
	public void play()
	{
		System.out.println("play method");
	}
	public void stop()
	{
		System.out.println("stop method");
	}
	public static void main(String ar[])
	{
		Phone p=new Phone();
		
		p.call();
		p.sms();
		SmartPhone smartphone=new SmartPhone();
		smartphone.click();
		smartphone.record();
		smartphone.play();
		smartphone.stop();
	}
}