public class Pet {
	private String name;
	private int age;
	private double weight;

	public Pet(){
		name = "No name yet.";
		age = 0;
		weight = 0;
  }
	public Pet(String initialName){ 
		name = initialName;
		age = 0;
		weight = 0.0;
  }
	public Pet(int initialAge){
		name = "No name yet.";
		weight = 0.0;
		if(initialAge < 0){
			System.out.println("Error: Negative age.");
			System.exit(0);
    }
  }
	public Pet(double initialWeight){
		name = "No name yet.";
		age = 0;
		if(initialWeight < 0){
			System.out.println("Error: Negative weight.");
			System.exit(0);
    }
  }
	public Pet(String initialName, int initialAge, double initialWeight){
		name = initialName;
		if(initialAge < 0){
			System.out.println("Error: Negative age.");
			System.exit(0);
		}
		if(initialWeight < 0){
			System.out.println("Error: Negative weight.");
			System.exit(0);
		}
	}

	public void set(String newName, int newAge, double newWeight){
		name = newName;
		if(newAge < 0 || newWeight < 0){
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		} else{
			age = newAge;
			weight = newWeight;
		}
	}

	public void setName(String newName){
		name = newName;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	public void setWeight(double newWeight){
		weight = newWeight;
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getWeight(){
		return weight;
	}
  
	public String toString(){
		return ("Name: " + name + " Age: " + age + " years "  +
      "\nWeight: " + weight + " pounds");
	} 
}