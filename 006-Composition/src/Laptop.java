
public class Laptop {
	
	private float screen;
	private String ram;
	private String hardDrive;
	private String opticalDrive;
	private String keyboard;
	private Processor processor;
	private GraphicsCard graphicsCard;
	
	public Laptop() {
		this.screen = 15.6f;
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.opticalDrive = "MLT Layer";
		this.keyboard = "Backlit";
		this.processor = new Processor();
		this.graphicsCard = new GraphicsCard();
	}
	
	public Laptop(float screen, String ram, String hardDrive, String opticalDrive, String keyboard, Processor processor,
			GraphicsCard graphicsCard) {
		super();
		this.screen = screen;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
		this.processor = processor;
		this.graphicsCard = graphicsCard;
	}


	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", ram=" + ram + ", hardDrive=" + hardDrive + ", opticalDrive="
				+ opticalDrive + ", keyboard=" + keyboard + ", processor=" + processor + ", graphicsCard="
				+ graphicsCard + "]";
	}


	public float getScreen() {
		return screen;
	}


	public String getRam() {
		return ram;
	}


	public String getHardDrive() {
		return hardDrive;
	}


	public String getOpticalDrive() {
		return opticalDrive;
	}


	public String getKeyboard() {
		return keyboard;
	}


	public Processor getProcessor() {
		return processor;
	}


	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}
	
	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
		return "Success";
	}
	
	
	

}
