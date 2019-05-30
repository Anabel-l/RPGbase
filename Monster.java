import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.*;

public class Monster {
	private String type;
	private int ac, hp, speed, str, dex, con, intelligence, wis, cha, xp;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Monster() {
		try {
			choose();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Monster(String t) {
		type = t;
	}
	
	public void choose() throws IOException {
		List<String> type = new ArrayList<String>();
		Scanner iFile = new Scanner(new File("monsters.txt"));
		while (iFile.hasNext()) {
			type.add(iFile.nextLine());
		}
		this.type = type.get((int) (Math.random() * type.size()));
	}

}
