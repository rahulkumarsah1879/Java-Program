
class Practice {
    String name="Rahul"; //non static global variable
    int age=23; //non static global variable
    String address="Hyderabad"; //non static global variable

    public static void main(String[] args){
        Practice pr=new Practice(); //object creation
        System.out.println(pr.name); //pr is reference name by which we can call nonstatic variable
        System.out.println(pr.age);
        System.out.println(pr.address);
    }
}
