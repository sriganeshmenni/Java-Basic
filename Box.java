public class Box {
    int l,b,h,area,vol;
    public Box(){
        l=b=h=1;
    }
    public Box(int n){
        l=b=h=n;
    }
    public Box(int p,int q,int r){
        l=p;
        b=q;
        h=r;
    }
    public void showDimenion(){
        System.out.println(l+" "+b+" "+h);
    }
    public void calarea(){
        area = 2*(l*b+b*h+h*l);
    }
    public void calvol(){
        vol = l*b*h;
    }
    public static void main(String args[]){
      Box b1 = new Box();
      Box b2 = new Box(4);
      Box b3 = new Box(2,3,4);

      b1.calarea();;
      b1.calvol();;

      b2.calarea();;
      b2.calvol();;

      b3.calarea();;
      b3.calvol();;

      System.out.println("==============================================");

      b1.showDimenion();
      System.out.println("Area = "+b1.area);
      System.out.println("Volume = "+b1.vol);

      System.out.println("==============================================");


      b2.showDimenion();
      System.out.println("Area = "+b2.area);
      System.out.println("Volume = "+b2.vol);
      
      System.out.println("==============================================");

      b3.showDimenion();
      System.out.println("Area = "+b3.area);
      System.out.println("Volume = "+b3.vol);
     
      System.out.println("==============================================");


    }
}
