package lecture_3;

public class L3_Example_6 {
    public static void main(String[] args) {
        int age = 25;
        String result = age > 18 ? age < 20 ? "Ate" : "Didn't eat" : "Didn't eat";
        System.out.println(result);

        int ageIf = 25;
        if(ageIf > 18){
            System.out.println("Ate");
        } else {
            System.out.println("Didn't eat");
        }

        int sum = age > 18 ? 20 + 20 : 15 + 15;
        System.out.println(sum);
    }

}
