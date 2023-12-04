public class HelloWorld {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("引数がありません。ja または en を指定してください。");
            return;
        }

        String language = args[0];

        if (language.equals("ja")) {
            System.out.println("ハロー世界");
        } else if (language.equals("en")) {
            System.out.println("Hello World");
        } else if (language.equals("cn")) {
            System.out.println("你好，世界");
        } else {
            System.out.println("不明な言語です。ja、en、またはcnを指定してください。");
        }
    }
}
