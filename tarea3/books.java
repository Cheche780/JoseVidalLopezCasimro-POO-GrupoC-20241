
package tarea3;


public class books {
    
    int yearPublication;
    String nameBook;
    String Autor;
    
    String getInfoBooks(){
return "autor: " + this.Autor
       + "book: "+ this.nameBook+
        "year: " + this.yearPublication;
                
}
    public books(String nameBook, int yearPublication,  String Autor){
   this.nameBook  = nameBook;
    this.yearPublication = yearPublication;
    this.Autor = Autor;
} 

    
    

}
