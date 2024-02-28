
package tarea.pkg5;

public class rectangle {
    private double area, perimeter;

  String resultados(int height, int widht){
      area = height * widht;
      perimeter = (height*2)+(widht*2);
      return String.format("the area is "+area+ " and the perimeter is "+ perimeter);
  }
  String resultados(double height, double widht){
      area = height * widht;
      perimeter = (height*2)+(widht*2);
      return String.format("the area is "+area+ " and the perimeter is "+ perimeter);
  }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
  
}
