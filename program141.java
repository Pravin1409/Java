import java.util.*;
class Marvellos
{
    public boolean CheckPrime(int iNo)
    {
        int icnt=0;
        boolean bflag=true;

        for(icnt=2;icnt<iNo/2;icnt++)
        {
            if(iNo%icnt==0)
            {
                bflag=false;
                break;
            }
        }
       return bflag;
    }
}
class program141
{
    public static void main(String str[])
    {
        Scanner sobj=new Scanner(System.in);
        int ivalue=0; 
        boolean bRet=false;

        System.out.println("Enteer number:");
        ivalue=sobj.nextInt();

        Marvellos mobj=new Marvellos();

        bRet=mobj.CheckPrime(ivalue);
        if(bRet==true)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}