package javalr6;

public class JavaLR6 {
     public static void main(String[] args) { 
        Student Ftemov = new Student("Senuk", 18, Sex.MAN, 2, 8.2);
        Ftemov.Data();

        System.out.println("\n");

        Student Sokhatska = new Student("Petrenko", 18, Sex.WOMAN, 0, 10);
        Sokhatska.Data();

        System.out.println("\n");

        Student Kryvenko = new Student("Nikolov)", 17, Sex.MAN, 20, 2);
        Kryvenko.Data();
    }
}
