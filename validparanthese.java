public class validparanthese {
   
    public boolean isValid(String s) {
        int count = 0;

        
            for(int i = 0; i<s.length();i++){
                if(s.charAt(i) == '('){
                    count++;
                }
                else if(s.charAt(i) == ')'){
                    count--;

                }
                if(count<0){
                    return false;
                }
            }
        return count == 0;

    }     
    public static void main(String[] args) {
        validparanthese vp = new validparanthese();
        String s = "((()))";
        boolean valid = vp.isValid(s);
        System.out.println(valid);
    }
    
}
    

