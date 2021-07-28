public class Policy {
    private int id;
    private String lastName;
    private directionOfCourses directionOfCourses;
    private int price;
    private String date;
    enum directionOfCourses {

        IT("It"),
        ECONOMY("ECONOMY"),
        FOREIGN_LANGUAGES("FOREIGN LANGUAGES");

        private String directionOfCourses;
        directionOfCourses(String directionOfCourses) {
            this.directionOfCourses = directionOfCourses;
        }
        public String getDirectionOfCourses() {
            return directionOfCourses;
        }
        @Override
        public String toString() {
            return directionOfCourses;
        }
    }
    public Policy( int id , String lastName, Policy.directionOfCourses
            directionOfCourses, int price, String date) {
        this.id = id;
        this.lastName = lastName;
        this.directionOfCourses = directionOfCourses;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Policy.directionOfCourses getDirectionOfCourses() {
        return directionOfCourses;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDirectionOfCourses(Policy.directionOfCourses directionOfCourses) {
        this.directionOfCourses = directionOfCourses;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        String Policy = String.format(" | ID квитка = %-5d  ||  Прізвище = %-12s   ||   Тип атракціону =  %-17s   ||   Ціна = %-5d   ||  Дата придбання =%s |",
                id,lastName, directionOfCourses,price,date);
        return Policy;
    }
}


