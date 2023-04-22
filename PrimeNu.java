class PrimeNumber{
 public static boolean Prime(int a){
   for(int i=2; i<a/2;i++)
   {
      if(a%i==0)
      {
        return false;
      }
     return true;
   }
}

public static void main(String[] args)
{
  int x=25;
  for(int i=1;i<=x;i++)
  {
     boolean b=Prime(i);
     if(b)
      {
        Sytsem.out.println(i+"is a prime number");
      }
   }
}
