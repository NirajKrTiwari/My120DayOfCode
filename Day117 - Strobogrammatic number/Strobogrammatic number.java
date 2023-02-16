public class Main {
    static char rotate(char c)
    {
        switch (c) {
            case '6':return'9';
            case '9': return '6';
            default: return c;
            
        }
    }
    public static void main(String[] args) {
        int a=1091;
        String str=(String.valueOf(a));
        int l=str.length();
        if(l>0)
        {
            int r=0;
            int g=a;
            int rev=0;
            for(int i=0;i<l;i++)
            {
                r=g%10;
                g=g/10;
                rev=rev*10+r;
            }
            String st=String.valueOf(rev);
            String s="";
            for(int i=0;i<l;i++)
            {
                char c=st.charAt(i);
                s=s+rotate(c);
            }
   		if(s.equals(str))
            {
                 System.out.println("Yes");
            }
            else{
                 System.out.println("No");
            }
        }
        else{
            System.out.println("1 digit");
        }
    }
}