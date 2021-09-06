package Day5;
class CommandLineInput
{
    public static void main(String args[])
    {
        int invalid=0,number,count=0;

        for(int i=0;i<args.length;i++)
        {
            try
            {													//NUMBERFORMATEXCEPTION IN JAVA
                number=Integer.parseInt(args[i]);
            }
 
            catch(NumberFormatException e)
            {
                invalid=invalid + 1;
                System.out.println(" Invalid Number= " +args[i]);
                continue;
            }
 
            count=count +1;
        }
 
        System.out.println(" Valid Number= " +count);
        System.out.println(" Invalid Number= " +invalid);
    }
}