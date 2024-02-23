
package tarea3;

public class caracteristicasObj {
   String name;
    int age;
    String gender;
    boolean getInfo;

    String getInfo(){
return "name: " + this.name
       + "Age: "+ this.age+
        "gender: " + this.gender;
    }
    public caracteristicasObj(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
       
    
}
