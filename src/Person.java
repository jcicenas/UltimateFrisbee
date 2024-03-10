public class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int throwDisk(int pow){
        double temp;
        if(pow > 10){
            temp = 10;
        }else if (pow < 1) {
            temp = 1;
        }else{
            temp = pow;
        }

        return (int)Math.pow(temp, 2);
    }
    public String toString(){
        return this.lastName + ", " + this.firstName;
    }
}
