import java.util.ArrayList;

public class Layout {
	private ArrayList<Place> layout;
	public Layout(ArrayList<Place> places){
		layout = places;
	}
	public Layout(){
		layout = new ArrayList<Place>();
		for(int i = 0; i< (Math.random()*20); i++){
			addPlace(new Place());
		}
	}
	
	public void addPlace(Place place){
		layout.add(place);
	}
	public void addPlace(Place place, int pos){
		layout.add(pos,place);
	}
	public void destroyPlace(int position){
		layout.remove(position);
	}
	public Place getPlace(int pos){
		return layout.get(pos);
	}
	public void setPlace(int pos, Place place){
		layout.set(pos, place);
	}
}
