public class AccessSpecifierDemo {
    public static void main(String[] args) {

    }
    class Emp{
        private int age;
        public Emp(int age){
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
}
