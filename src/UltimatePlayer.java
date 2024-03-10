public class UltimatePlayer extends Person{
    int jerseyNumber;
    static int jerseyNumberCounter;
    String position;
    public UltimatePlayer(String firstName, String lastName, String position){
        super(firstName, lastName);
        if(!position.equals("handler") || !position.equals("cutter")){
            this.position = "handler";
        }else{
            this.position = position;
        }

        
    }

    public String getPosition(){
        return this.position;
    }

    @Override
    public int throwDisk(int pow){
        return pow * 4;
    }

    public String toString(){
        return super.lastName + ", " + super.firstName + "\n   Jersey #: " + this.jerseyNumber + "\n   Position: " + this.position;
    }
}
