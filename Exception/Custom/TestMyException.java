public class TestMyException {
    public static void main(String[] args) {
        String name;
        name = "Sagun";

        try {
            if (name == "Sagun" || name == "sagun")
                throw new MyException("Name already reserved");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}