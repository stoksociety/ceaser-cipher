import java.util.scanner;// Import the Scanner class

public class app{
    public static void main(String[],args){
        system.out.println("what do you want?/1.Encode /2.Decode /3.Quit");

        if (choice ==1){
            system.out.println("Enter text ");
            string inputText = scanner.nextLine().ToUppercase();
            system.out.println("Enter key");
            int key = scanner.nextInt();
            Encoding encoding= new Encoding(inputText,key);
            system.out.println(String.format("Your encrypted text is: %s",decoding.decode()));
        }

        else if (choice ==3) system.exit(0);

        else {
            system.out.println("what's your input");
        }
    }
}