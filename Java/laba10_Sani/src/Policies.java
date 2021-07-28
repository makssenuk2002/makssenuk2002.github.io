import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class Policies {
    List<Policy> PoliciesList = new ArrayList<Policy>();
    public void generationPolicies() {
        PoliciesList.add(new Policy(1 ,"LastName1", Policy.directionOfCourses.ECONOMY,111,"11.06.2021" ));
        PoliciesList.add(new Policy(2,"LastName2",Policy.directionOfCourses.IT,131,"11.23.1212"));
        PoliciesList.add(new Policy(3 ,"LastName3", Policy.directionOfCourses.ECONOMY,121,"11.06.2021" ));
        PoliciesList.add(new Policy(4,"LastName4",Policy.directionOfCourses.FOREIGN_LANGUAGES,111,"11.23.1212"));

        System.out.println("\n------------------Інформаційна система квитків:-------------------------- \n");
        devision();
        printAllPolicies();
    }

    public void printAllPolicies() {
        for (Policy currentPolicy : PoliciesList) {
            System.out.println(currentPolicy);
        }


    }
    public void sortPoliciesByLastName() {
        Collections.sort(PoliciesList, new sortByLastName());
        System.out.println("\n----------------------Відбулося сортування за прізвищем:---------------------- \n");
        devision();
        printAllPolicies();
    }
    public void sortPoliciesByType() {
        Collections.sort(PoliciesList, new sortBydirectionOfCourses());
        System.out.println("\n--------------------------------Відбулося сортування за типом: ----------------\n");
        devision();
        printAllPolicies();
    }
    public void addNewPolicy(String lastName, Policy.directionOfCourses
            directionOfCourses, int price, String date) {
        int id = PoliciesList.size() + 1;
        PoliciesList.add(new Policy(id ,lastName, directionOfCourses, price, date));
    }
    public void editPolicies(int id, String lastName,
                            Policy.directionOfCourses directionOfCourses, int price, String date) {
        for (Policy currentPolicy : PoliciesList) {
            if (id == currentPolicy.getId()) {
                System.out.println("\n----------Редагування квитка:------------\n" +
                        currentPolicy);
                devision();
                currentPolicy.setLastName(lastName);
                currentPolicy.setDirectionOfCourses(directionOfCourses);
                currentPolicy.setPrice(price);
                currentPolicy.setDate(date);
                System.out.println("\n-------------Квиток було змінено на: ---------------\n" +
                        currentPolicy);
            }
        }
    }
    public void deletePolicies(int id) {
        System.out.println("\n-------------------Видаляємо квиток: ------------------\n");
        for (Iterator<Policy> it = PoliciesList.iterator();
             it.hasNext(); ) {
            Policy currentPolicy = it.next();
            if (id == currentPolicy.getId()) {
                it.remove();
                break;
            }
        }
    }
    public void devision() {
        System.out.println(" ==================================================================================================================================================");
    }
    public void printPolicyAttraction(Policy.directionOfCourses
                                              directionOfCourses){
        System.out.println("\n---------------------Виведення квитків одного типу: ---------------------------\n");
        devision();
        for (Policy currentPolicy:PoliciesList) {

            if(currentPolicy.getDirectionOfCourses().equals(directionOfCourses)){
                System.out.println(currentPolicy);
            }
        }
    }
}