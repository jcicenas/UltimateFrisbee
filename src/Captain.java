public class Captain extends UltimatePlayer{
    boolean type;
    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        this.type = type;
    }

    @Override
    public int throwDisk(int pow){
        return pow*5;
    }

    public String toString(){
        return super.lastName + ", " + super.firstName + "\n   Jersey #: " + super.jerseyNumber + "\n   Position: " + super.position + "\n   Captain: " + this.type; 
    }

}
