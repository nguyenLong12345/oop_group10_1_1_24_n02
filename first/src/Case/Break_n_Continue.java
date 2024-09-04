package Case;

public class Break_n_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
          }else if(i == 9){
                break;
          }
          System.out.println(i);
          i++;
        }  
      }
    }
    

