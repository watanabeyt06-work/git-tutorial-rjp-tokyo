public class HelloWorld {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("引数がありません。ja または en または es を指定してください。");
            return;
        }

        String language = args[0];

        if (language.equals("ja")) {
            System.out.println("ハロー世界!");
        } else if (language.equals("en")) {
            System.out.println("Hello World!");
        } else if (language.equals("es")) {
            System.out.println("¡Hola mundo!");
        } else {
            System.out.println("不明な言語です。ja または en または es を指定してください。");
        }
    }
}
