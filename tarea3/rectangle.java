
package tarea3;


public class rectangle {
    int height, widht;
    int result1, result2;
    
    String getInfoRectangle(){
return "area: " +height*widht
        +" perimeter: "+ (height*2)+(widht*2);
         }
    public rectangle(int height, int widht){
        this.height = height;
        this.widht = widht;
    }
    
}
