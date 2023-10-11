public class Main {
    public static void main(String[] args) {

        Tigre t1=new Tigre("Parque",3,6,"Angora",4,4,
                "Bengala");
        Tigre t2=new Tigre("Selva",7,7,"Sumatra",4,4,
                "Bengala");
        Tigre t3=new Tigre("Colombiano",3,2,"Malayo",6,4,
                "Bengala");
        Tigre t4=new Tigre("Africa",3,5,"China",6,4,
                "Bengala");

        Lobo l1=new Lobo("Zoologico", 1,5, "Tigae", "blanco", 2,6,"Torig");

        Lobo l2=new Lobo("Selva", 1,5, "Tigae", "naranja", 2,6,"Torig");

        System.out.println(t1);
        System.out.println("*****************************");
        System.out.println(t2);
        System.out.println("*****************************");
        System.out.println(t3);
        System.out.println("*****************************");
        System.out.println(t4);
        System.out.println("*****************************");
        System.out.println(l1);
        System.out.println("*****************************");
        System.out.println(l2);




    }
}