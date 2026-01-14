public class AnonymsClass {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    int a = 0;

    AnonymsClass(int a) {
        this.a = a;
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                IO.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                IO.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            static int a = 0;

            interface MyType {
                void printValue(int a);
            }

            static {
                a = 1;
            }
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                IO.println("Hola, " + name + AnonymsClass.this.a);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        AnonymsClass myApp =
                new AnonymsClass(10);
        myApp.sayHello();
    }
}
