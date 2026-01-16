class Main{
    public static void main(String[] args) {
        String name = "Pranabesh"; //Stored in string pool
        System.out.println(name);
        name = "Pranabesh Basu"; //we are shifting the point to this object that's why updated
        System.out.println(name);
    }
}