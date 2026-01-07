class SData{
        private Integer roll;
        private String name;
        SData(int _roll, String _name) {
            this.roll = _roll;
            this.name = _name;
        }
        public void setRoll(int _roll){
            this.roll = _roll;
        }
        public void setName(String _name){
            this.name = _name;
        }
        public int getRoll(){
            return roll;
        }
        public String getName(){
            return name;
        }
}
public class Student {
    public static void main(String[] args) {
        SData sdata1 = new SData(1, "Manabesh Basu");
        sdata1.setName("Pranabesh Basu");
        System.out.println(sdata1.getName());
    }
}
