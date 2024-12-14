package lecture_11;

public class Company {
    private static String companyName = "Roga i Kopyta";

    static class Employee{
        int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}' +
                    "Company: " + companyName;
        }
    }
}
