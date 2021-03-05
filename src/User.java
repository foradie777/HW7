public class User {
    final String DEFAULT_FIRST_NAME = "";
    final String DEFAULT_LAST_NAME = "";
    final int DEFAULT_AGE = 0;
    final boolean DEFFAULT_WORKING_STATUS = false;
    public String firstName = DEFAULT_FIRST_NAME;
    public String lastName = DEFAULT_LAST_NAME;
    public int age = DEFAULT_AGE;
    public boolean isWorker = DEFFAULT_WORKING_STATUS;

    //Реализация Builder через статический внутренний класс
    public static class Builder {
        //Обязательные параметры
        //Необязательные параметры со значениями по умолчанию
        public String firstName = "";
        public String lastName = "";
        public int age = 0;
        public boolean isWorker = false;

        //Конструктор с обязательными параметрами

        //Методы с возвращающим типом Builder для необязательного параметра firstName, lastName, age, isWorker
        public Builder firstName(String name) {
            this.firstName = name;
            return this;
        }

        public Builder lasttName(String name) {
            this.lastName = name;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder isWorker(boolean statement) {
            isWorker = statement;
            return this;
        }


        //Метод с возвращающим типом Good для генерации объекта
        public User build() {
            return new User(this);
        }

        public User builder() {
            return this;
        }
    }
    private User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        isWorker = builder.isWorker;
    }
}