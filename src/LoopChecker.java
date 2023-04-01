public class LoopChecker implements Checker{
    private static final String ALLOWED_CHARACTERS ="abcdefhijgklmnoprstuvwxyzABCDEFHIJKLMNOPRSTUVWXYZ0123456789_";
    //@Override
    @Override
    public boolean isValid(String s) {
    char[]chars = s.toCharArray();
        for (char symbol : chars) {
         if(ALLOWED_CHARACTERS.contains(Character.toString(chars[symbol]))){
             return false;
         }
        }
            return true;
    }



}
