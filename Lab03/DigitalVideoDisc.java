
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String directory) {
		this.director = directory;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getLength() {
		return length;
	}
	
	public boolean setLength(int length) {
		if(length > 0) {
			this.length = length;
			return true;}
		else 
			return false;
	}
   // xay dung phuong thuc khoi tao cho lop
   // constructor method
	public DigitalVideoDisc() {
		this.title = "noname";
		this.category = "unknown";
		this.director = "unknown";
		this.length = 0;
		this.cost = 0.0f;
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

	public DigitalVideoDisc(String title, String category, String directory) {
		super();
		this.title = title;
		this.category = category;
		this.director = directory;
	}

	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = directory;
		this.length = length;
		this.cost = cost;
	}
	//xay dung phuong thuc cung ten khac tham so dau vao
	//this: tu tham chieu -> dung de tham chieu den doi tuong hien tai
	//no giup phan biet tham so truyen vao phuong thuc va thuoc tinh cua lop
	
}
