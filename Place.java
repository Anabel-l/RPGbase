import java.util.ArrayList;

public class Place {
	// Constants
	public static final int DARK = 0;
	public static final int MEDIUM = 1;
	public static final int LIGHT = 2;

	private int light, width, length, height;
	private String storyElement="";
	private ArrayList<Entrance> entrances;
	private ArrayList<Monster> monsters;

	public Place() {
		width = (int) (Math.random() * 100)+2;
		length = (int) (Math.random() * 100)+2;
		height = (int) (Math.random() * 4)+5;
		light = (int) (Math.random() * 3);
		entrances = new ArrayList<Entrance>();
		monsters = new ArrayList<Monster>();
		for (int row = 0; row < (int) (Math.random() * 4); row++) {
			int x = 0;
			int y = 0;
			int random = (int) (Math.random() * 4);
			if (random == 0) {
				x = width;
				y = (int) (Math.random() * length);
			} else if (random == 1) {
				x = 0;
				y = (int) (Math.random() * length);
			} else if (random == 2) {
				y = 0;
				x = (int) (Math.random() * width);
			} else if (random == 3) {
				y = length;
				x = (int) (Math.random() * width);
			}
			entrances.add(new Entrance(x, y));
		}
		for(int i = 0; i< (int)(Math.random()*12);i++){
			monsters.add(new Monster());
		}
	}

	public Place(int lit, int width, int length, int height, int numEntrances) {
		light = lit;
		this.width = width;
		this.length = length;
		this.height = height;
		for (int row = 0; row < numEntrances; row++) {
			int x = 0;
			int y = 0;
			int random = (int) (Math.random() * 4);
			if (random == 0) {
				x = width;
				y = (int) (Math.random() * length);
			} else if (random == 1) {
				x = 0;
				y = (int) (Math.random() * length);
			} else if (random == 2) {
				y = 0;
				x = (int) (Math.random() * width);
			} else if (random == 3) {
				y = length;
				x = (int) (Math.random() * width);
			}
			entrances.add(new Entrance(x, y));
		}
	}

	public String toString() {
		String entrancePos = "";
		String entranceSizes = "";
		String def = "";
		String plurality = "s";
		//num & type of entrances
		if(entrances.size()==1){
			plurality = "";
		}
		for (int i = 0; i<entrances.size();i++) {
			entrancePos += "(" + entrances.get(i).getxPos() + "," + entrances.get(i).getyPos() + ")";
			if(entrances.size()>1&&i!=entrances.size()-1){
				entrancePos+=" and ";
			}
			entranceSizes += entrances.get(i).getWidth() + "ft x " + entrances.get(i).getHeight() + "ft";
			if(entrances.size()>1&&i!=entrances.size()-1){
				entranceSizes+=" and ";
			}
		}
		if(entrances.size()==0){
			def= storyElement +"\nBasic Information: This place is " + width + "ft wide by " + length + "ft and is " + height + "ft tall.\nIt has no entrances.\nIt is ";
		} else{
		def = storyElement +"\nBasic Information: This place is " + width + "ft wide by " + length + "ft and is " + height + "ft tall.\nIt has " + entrances.size()
		+ " entrance"+plurality+" at position"+plurality+" " + entrancePos + " with dimensions of " + entranceSizes + ".\nIt is ";
		}
		//Room Lighting
		if(light==DARK){
			def+="dark.";
		} else if(light==MEDIUM){
			def+="not particularly bright or dark.";
		} else {
			def+="well-lit.";
		}
		//make it niiiiice
		plurality = "s";
		if(monsters.size()==1){
			plurality = "";
		}
		//monsters
		def+=" There are "+monsters.size()+" monster"+plurality+": ";
		for(int i = 0; i<monsters.size(); i++){
			if(i==monsters.size()-1){
				def+="a "+ monsters.get(i).getType() +".";
			}else{
				def+="a "+ monsters.get(i).getType()+" and ";
			}
			
		}
		return def;
	}
	
	public ArrayList<Monster> getMonsters() {
		return monsters;
	}
	public Monster getMonster(int pos) {
		return monsters.get(pos);
	}
	public void setMonsters(ArrayList<Monster> monsters) {
		this.monsters = monsters;
	}

	public void setMonster(int pos, Monster monster) {
		monsters.set(pos,monster);
	}
	
	public void changeLighting(int lighting){
		light = lighting;
	}

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<Entrance> getEntrances() {
		return entrances;
	}

	public void setEntrances(ArrayList<Entrance> entrances) {
		this.entrances = entrances;
	}

	public String getStoryElement() {
		return storyElement;
	}

	public void setStoryElement(String storyElement) {
		this.storyElement = storyElement;
	}
}
