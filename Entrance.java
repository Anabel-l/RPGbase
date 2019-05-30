
public class Entrance {
	private int width, height, xPos, yPos; //width and height is in feet, don't bully me
	private boolean isOpen, locked;
	public Entrance(int w, int h, int x, int y, boolean open, boolean locked){
		width = w;
		height = h;
		xPos = x;
		yPos = y;
		isOpen = open;
		this.locked = locked;
	}
	
	public Entrance(int x, int y){
		xPos = x;
		yPos = y;
		width = 3;
		height = 7;
		boolean open = (int)(Math.random()*2)==0;
		boolean lock = false;
		if(!open){
			lock = (int)(Math.random()*2)==0;
		}
		isOpen = open;
		locked = lock;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
}
