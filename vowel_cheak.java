import java.util.*;
public class vowel_cheak {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of strings");
        int n=in.nextInt();
        List<String> a=new ArrayList<>();
        System.out.println("Enter the Strings ");
        for(int i=0;i<=n;i++)
        {
            a.add(in.nextLine());

        }
        System.out.println("First index ");
        int first=in.nextInt();
        System.out.println("second  index ");
        int second=in.nextInt();

        


    }
    public static int vowelcheakfun(List<String>a,int start,int second)
    {
        int count=0;

        for(int i=start;i<=second;i++)
        {
            if(cheak(a.get(i)))
            {
                count++;
            }
        }

        return count;
    }
    public static boolean cheak(String s)
    {
       for (char xx : s.toCharArray()) {
        
       
        if("AEIOUaeiou".indexOf(xx)!=-1)
        {
            return true;

        }
    }
    return false;

}
}
