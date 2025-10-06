package uj.wmii.pwj.introduction;

public class HelloWorld {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("No input parameters provided");
        }
        else{
            for (String arg : args)
            {
                System.out.print(arg + '\n');
                // Tests fail when I try to use println, because line separator is CRLF (\r\n) in Windows and LF (\n) in Unix
            }
        }
    }
}
