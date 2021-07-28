public class Main {
    public static void main(String[] args) {
        var kassa = new Policies();
        kassa.generationPolicies();
        kassa.devision();
        kassa.addNewPolicy("Didenko", Policy.directionOfCourses.IT,
                1111, "15.05.2021");

        kassa.addNewPolicy("Panku", Policy.directionOfCourses.FOREIGN_LANGUAGES, 1111,
                "15.05.2021");
        kassa.sortPoliciesByLastName();
        kassa.devision();
        kassa.editPolicies(4, "Gnatenko", Policy.directionOfCourses.FOREIGN_LANGUAGES,
                111, "24.04.2021");
        kassa.devision();
        kassa.sortPoliciesByType();
        kassa.devision();
        kassa.deletePolicies(4);
        kassa.devision();
        kassa.printAllPolicies();
        kassa.devision();
        kassa.printPolicyAttraction(Policy.directionOfCourses.ECONOMY);
        kassa.devision();

    }
}