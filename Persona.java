import java.util.ArrayList;

public class Persona extends Human {

  String PersonaJobTitle;

  public Persona(String name, String sex, int age, String personaJobTitle) {
    super(name, sex, age);
    this.PersonaJobTitle = personaJobTitle;
  }

  public String getPersonaJobTitle() {
    return PersonaJobTitle;
  }

  ArrayList<Persona> PersList = new ArrayList<>();

  public void addName(Persona persona) {
    PersList.add(persona);
  }

  public ArrayList<Persona> getListName(){
    return PersList;
  }

  @Override
  public String toString() {
    return String.format("%s %s %d %s", this.Name, this.Sex, this.Age, this.PersonaJobTitle);
  }
}
