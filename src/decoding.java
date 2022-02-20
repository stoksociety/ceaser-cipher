public class decoding{
    private int akey;
    private string aInputText;

    public decoding(String inputText,int key){
        akey = key;
        aInputText = inputText;
    }
    public string getinputText{
        return aInputText;// Import the Scanner class
    }
    public int getKey{
        return akey;
    }
    public boolean isValidInputText(){

        char[] chars= aInputText.toCharArray();

        for(char c: chars){
            if (!character.isLetter(c) && c != ''){
                return false;
            }
        }
        public boolean isValidKey()
        {
            return akey >1 && akey < 26;

        }

        public String encode()
        {
            String decoded = " ";
            String decodedArray[] =aInputText.split("");
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i<decodedArray.length;i++)
            {
                if (aInputText.charAt(i) == ' ')
                {
                   decoded += " ";
                }
                else
                {
                    int charPosition = alphabet.indexOf(aInputText.charAt(i));
                    int key = (akey + charPosition) % 26;
                  decoded += alphabet.charAt(key);
                }
            }
            return decoded.toUpperCase();
        }        }
}
