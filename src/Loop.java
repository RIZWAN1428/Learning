public class Loop {
    public static void  main(String[] args){
        for(int i=1; i<=5; i++)
            System.out.println("hello" +i);

        int j =1;
        while(j <= 5){
            System.out.println("hi"+j);
            j++;
            break;
        }

       int i =1;
        do{
            System.out.println("hey "+i);
            i++;
            if(i == 3) {
                i++;
                continue;
            }
        }while(i<=5);
    }
}
