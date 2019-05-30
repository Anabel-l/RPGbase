public class Person {
	private String firstName, lastName, ethnicity, landOfOrigin, sexuality, story;
	private int age, numSiblings, gender; //gender is 0 = female, 1 = male, 2 = non-binary
	private boolean isInRelationship;
	private Dictionary lang;

	public Person() {
		lang = new Dictionary();
		firstName = lang.translate("personality").substring(0,1).toUpperCase()+lang.translate("personality").substring(1);
		lastName = lang.translate("family").substring(0,1).toUpperCase()+lang.translate("family").substring(1);
		ethnicity = lang.translate("people").substring(0,1).toUpperCase()+lang.translate("people").substring(1);
		landOfOrigin = lang.translate("home").substring(0,1).toUpperCase()+lang.translate("home").substring(1);
		age = (int) (Math.random() * 85) + 1;
		if (age > 13) {
			isInRelationship = (int) (Math.random() * 2) == 1;
			switch((int)(Math.random()*6)){
			case 0:
				sexuality = "gay";
				break;
			case 1:
				sexuality = "straight";
				break;
			case 2:
				sexuality = "bisexual";
				break;
			case 3:
				sexuality = "questioning";
				break;
			case 4:
				sexuality = "pansexual";
				break;
			case 5:
				sexuality = "other";
				break;
			default:
				sexuality = "straight";
				break;
			}
		} else {
			isInRelationship = false;
			sexuality = "questioning";
		}
		numSiblings = (int) (Math.random() * 6);
		gender = (int)(Math.random()*3);
		story = "";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public void setLandOfOrigin(String landOfOrigin) {
		this.landOfOrigin = landOfOrigin;
	}

	public void setSexuality(String sexuality) {
		this.sexuality = sexuality;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNumSiblings(int numSiblings) {
		this.numSiblings = numSiblings;
	}

	public void setInRelationship(boolean isInRelationship) {
		this.isInRelationship = isInRelationship;
	}

	public void setLang(Dictionary lang) {
		this.lang = lang;
	}

	public String getLandOfOrigin() {
		return landOfOrigin;
	}

	public String getSexuality() {
		return sexuality;
	}

	public String getStory() {
		return story;
	}

	public int getAge() {
		return age;
	}

	public int getNumSiblings() {
		return numSiblings;
	}

	public boolean isInRelationship() {
		return isInRelationship;
	}

	public Dictionary getLang() {
		return lang;
	}

	public Person(String name1, String name2, String race, String land,String sexuality, String history, int age, int numSiblings, boolean relationship, int gender) {
		lang = new Dictionary();
		firstName = name1;
		lastName = name2;
		ethnicity = race;
		landOfOrigin = land;
		this.sexuality = sexuality;
		story = history;
		this.age = age;
		this.numSiblings = numSiblings;
		isInRelationship = relationship;
		this.gender = gender;
	}
	
	public void talk(String words){
		System.out.println(firstName+ ": " + words);
	}
	
	public String toString(){
		String tot = "";
		String pronoun = "";
		String plurality ="s";
		if(numSiblings==1){
			plurality = "";
		}
		if(gender==0){
			tot = firstName +" "+ lastName + " is a "+ ethnicity + " "+ age + "-year-old. She is " + sexuality+ " and comes from "+ landOfOrigin+". She has " + numSiblings + " sibling"+plurality+". Her story is below:\n"+story;
		} else if(gender==1){
			tot = firstName +" "+ lastName + " is a "+ ethnicity + " "+ age + "-year-old. He is " + sexuality+ " and comes from "+ landOfOrigin+". He has " + numSiblings + " sibling"+plurality+". His story is below:\n"+story;
		} else {
			tot = firstName +" "+ lastName + " is a "+ ethnicity + " "+ age + "-year-old. They are " + sexuality+ " and come from "+ landOfOrigin+". They have " + numSiblings + " sibling"+plurality+". Their story is below:\n"+story;
		}
		return tot;
	}

}
