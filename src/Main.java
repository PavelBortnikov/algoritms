import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        try{
            String line=buffer.readLine();
            int src = Integer.parseInt(line);
            while (src != 1){
                for(int i =2; i<src+1; i++){
                    if (src % i == 0){
                        System.out.print(i + " ");
                        src = src / i;
                        break;
                    }
                }
            }

        }catch(Throwable e){
            e.printStackTrace();
        }

    }
}