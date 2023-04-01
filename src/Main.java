public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("1234_test","K_j123547", "K_j123547");
        if(result) {
            System.out.println("Логин и пароль корректны");
        }else{
            System.out.println("Логин и/или пароль некорректны");
        }
    }
}