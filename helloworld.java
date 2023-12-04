public class HelloWorld {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("引数がありません。文字コードのen または cn を指定してください。");
            return;
        }

        String language = args[0];

        if (language.equals("en")) {
            System.out.println("Hello World");
        } else if (language.equals("cn")) {
            System.out.println("你好，世界");
        } else {
            System.out.println("不明な言語です。en、またはcnを指定してください。");
        }
    }
}
