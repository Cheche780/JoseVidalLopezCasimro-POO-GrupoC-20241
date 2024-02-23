
package tarea3;


public class Tarea3 {

    public static void main(String[] args) {
caracteristicasObj person1 = new caracteristicasObj("pedro", 30, "male" );
caracteristicasObj person2 = new caracteristicasObj("maria", 23, "female" );
caracteristicasObj person3 = new caracteristicasObj("Armando", 40, "male" );
caracteristicasObj person4 = new caracteristicasObj("Juana", 50, "female");

//books instances
books  book1 = new books("Anand Dílvar", 2006, "El esclavo");
books bookChange = new books("Jose Ramon Garmabella ",1997, "leyendas del boxeo ");
books  book3 = new books("Stephen king", 1986, "it");
books  book4 = new books("Stephe King", 1977, "El resplandor");

//rectangle
rectangle rectangle1 = new rectangle (4,3);
rectangle rectangle2 = new rectangle (2,3);
rectangle rectangle3 = new rectangle (5,3);
rectangle rectangle4 = new rectangle (2,4);

//person
person1.name = "pedro";
person1.age = 30;
person1.gender = "male";

        System.out.println(person1.getInfo());
        System.out.println(person2.getInfo());
        System.out.println(person3.getInfo());
        System.out.println(person4.getInfo());
        System.out.println("**********");
        
        //book
        System.out.println(book1.Autor);
        System.out.println(book1.nameBook);
        System.out.println(book1.yearPublication);
        System.out.println("");
        System.out.println(bookChange.Autor);
        System.out.println(bookChange.nameBook);
                System.out.println(bookChange.yearPublication);
                System.out.println("");
                System.out.println(book3.Autor);
        System.out.println(book3.nameBook);
        System.out.println(book3.yearPublication);
        System.out.println("");
        System.out.println(book4.Autor);
        System.out.println(book4.nameBook);
        System.out.println(book4.yearPublication);
        System.out.println("");
        //rectangle
        rectangle1.height =4;
        rectangle1.widht = 3;
        
        System.out.println(rectangle1.getInfoRectangle());
                System.out.println(rectangle2.getInfoRectangle());
        System.out.println(rectangle3.getInfoRectangle());
        System.out.println(rectangle4.getInfoRectangle());

    }
}