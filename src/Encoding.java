public class Encoding{
   private int akey;
    private String aInputText;

    public void encoding(String InputText,key){
        akey = key;
        aInputText = InputText;
    }
    public String getinputText(){
        return aInputText;
    }
    public int getKey(){
        return akey;
    }
    public boolean isValidInputText(){

        char[] chars= aInputText.toCharArray();

        for(var c: chars){
            if (!(character.isLetter(c) || c == "")){
                return false;
            }
        }
        public boolean isValidKey() {
            return akey >1 && akey< 26;

        }

        Public Stringencode()
        {
            String encoded = "";
            String encodedArray[] =aInputText.split("");
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i<encodedArray.length;i++)
            {
                if (aInputText.charAt(i) == ' ')
                {
                    encoded += " ";
                }
                else
                {
                    int charPosition = alphabet.indexOf(aInputText.charAt(i));
                    int key = (akey + charPosition) % 26;
                    encoded += alphabet.charAt(key);
                }
            }
            return encoded.toUpperCase();
            }
    }
};

//1. created a class
//2.enscapulated it to be private so that it can be accessed within its class
//3.i used the public modifier which is accessible for all classes
//4.i used the  getter method // accessor