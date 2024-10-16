class Father{
    String fname;
    int age;
    public Father(String fname,int age){
        this.fname= fname;
        this.age = age;
    }
    public void display(){
        System.out.println("Father Name : "+fname);
        System.out.println("Father age : "+age);
    }
}
    class Child extends Father{
        String cname;
        int age;
        public Child(String fname,int fage,String cname,int cage) {
            super(fname,fage);
            this.cname=cname;
            this.age=cage;
        }
        @Override
        public void display(){
            super.display();
            System.out.println("Child Name : "+cname);
            System.out.println("Child age : "+age);
        }
        public int Returnagediff(){
            return super.age-age;
        }

    }

public class SuperDemo {
    public static void main(String args[]) {
        Child child = new Child("Chiranjeevi",60,"Ram",35);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        child.display();
        int k=child.Returnagediff();
        System.out.println(k);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

    }
}
