import java.util.Arrays;

class Solution {
    static int numUniqueEmails(String[] emails) {

    
    int x = emails.length;

    for(int i=0;i<x;i++){
      StringBuilder sb = new StringBuilder(emails[i]);
      int plusindex=0;
      int atindex=0;
    
     // for loop to get rid of ".", and mark locations of first "+" and "@"
      boolean trigger = false;
      for(int j=0;j<emails[i].length();j++){
        String s = String.valueOf(sb.charAt(j));
        if (s.equals(".")){
          sb.deleteCharAt(j);
          j--;
  
        }

        else if(s.equals("@")){
          atindex += j;
          break;
        }

        
        if(!trigger){
        if(s.equals("+")){
        plusindex += j;
        trigger=true;
        }
        }


        }
        

        if(plusindex!=0)sb.delete(plusindex,atindex);
        String c = sb.toString();
        System.out.print(c+"\n");
        emails[i]=c;
       
        }

        int count = x;
        Arrays.sort(emails);
        for(int i=0;i<x-1;i++){
          if(emails[i].equals(emails[i+1])){
            count--;
          }
        }

        
        return count;
    }

}
