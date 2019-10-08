public class Punto1 extends Figura1{
 private int x;
 private int y;


 public Punto1(){}

 public Punto1(int valorX, int valorY){
  x = valorX;
  y = valorY;
 }

 public void setX(int valorX){
  x = valorX;
 }

 public int getX(){
  return x;
 }

 public void setY(int valorY){
  y = valorY;
 }

 public int getY(){
  return y;
 }

 public String toString(){
  return "[" + getX() + ", " + getY() + "]";
 }

 public String obtenerNombre() {
  return "Punto";
 }
}

