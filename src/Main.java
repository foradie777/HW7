public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = User.builder()
                .firstName("Marsel")
                .lastName("Sidikov")
                .age(26)
                .isWorker(true)
                .build();
    }
}
