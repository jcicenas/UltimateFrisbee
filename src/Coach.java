public class Coach extends Person {
    String role;
    
    public Coach(String role, String firstName, String lastName){
        super(firstName, lastName);
        this.role = role;
    }
    
    @Override
    public String toString(){
        return super.lastName + ", " + super.firstName + "\n   Role: " + this.role;
    }
}
