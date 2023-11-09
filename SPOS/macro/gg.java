import java.util.*
import java.io.*
public class macro2
{
    public static void main(String args[])
    {
        BufferedReader br,br1,br2;
        OutputStream oo;
        String input=null,input1=null;
        String tt=null,arg=null,macroTokens=null;
        int macroindex[]=new int[10];
        String mnt[]=new String[10];
        int mcount=0,arg_count=0;
        int index=1;
        int middlecount=0;
        int main_enc=0;

        try{
            br=new BufferedReader(new FileReader("input.txt"));
            br1=new BufferedReader(new FileReader("mnt.txt"));
            br2=new BufferedReader(new FileReader("mdt.txt"));
            File f=new File("finput.txt");
            PrintWriter p=new PrintWriter(f);
            int i=0;

            while((input=br1.readLine())!=null){
                StringTokenizer st=new StringTokkenizer(input,'\t');
                tt=st.nextToken();
                mnt[i]=t;
                system.out.println(mnt[i]);
                i++;
            }
        }
    }
}