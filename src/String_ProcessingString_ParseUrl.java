import java.util.Scanner;
import java.util.Arrays;

public class String_ProcessingString_ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getUrl = "https://target.com/index.html?port=8080&cookie=&host=localhost";
        String[] split1 = getUrl.split("https://target.com/index.html");
        String[] split2 = split1[1].split("\\?");
        String[] split3 = split2[1].split("&");

        String section0;
        String section1;
        String section2;

        System.out.println(Arrays.toString(split1));
        // [, ?port=8080&cookie=&host=localhost]
        System.out.println(Arrays.toString(split2));
        // [, port=8080&cookie=&host=localhost]
        System.out.println(Arrays.toString(split3));
        // [port=8080, cookie=, host=localhost]

        for (String part : split3) {
            if (part.contains("pass") && part.length() > 5){
                section0 = part.replaceAll("=", " : ");
            }
        }

//        split3[i].replaceAll("=", " : ");
//        for (int i = 0; i < split3.length; i++) {
//            if (split3[i].contains("pass") && (split3[i].length > 5)) {
//                split3[i].replaceAll("=", " : ");
//            }
//        }

//package stackoverflow.q_24933319;
//
//        public class FindLength {
//            public static void main(String[] args) {
//                String[] arr = {"abc","bgfgh","gtddsffg"};
//                System.out.println("Array size is: " + arr.length);
//                for(String s : arr) {
//                    System.out.println("Value is " + s + ", length is " + s.length());
//                }
//            }
//        }
//
////Output:
////Array size is: 3
////Value is abc, length is 3
////Value is bgfgh, length is 5
////Value is gtddsffg, length is 8

//        String section1 = split3[0].repalceAll("=", " : ");


//        String[] split4 = section0.split("=");
//        String[] split5 = section1.split("=");
//        String[] split6 = section2.split("=");

//        String section3 = String.join("", split3[3]);
        String sectionPass = "-";

        System.out.println();

        if (!sectionPass.equals("-")) {
            System.out.println("pass :" + sectionPass);

        }

    }
}
 /*
You want to hack a website now. First, get all the available parameters that you can find in the URL. Then print them in the "key : value" format. If a parameter doesn't have value, print "not found".

If you find the password (parameter pass), you should print its value after all parameters once again, but with a key password. If a URL does not contain parameter pass, do not print anything after the listed parameters. However, if pass parameter is present, its value cannot be empty.

Note: the order of parameters should be the same as in the URL.
Advice: Check examples for better understanding and carefully learn the structure of the URL.

Sample Input 1:

https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost

Sample Output 1:

pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345


Sample Input 2:

https://target.com/index.html?port=8080&cookie=&host=localhost

Sample Output 2:

port : 8080
cookie : not found
host : localhost

*/