package Slecfirst;

public class thexample extends Thread {

        void func()
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
            }
        }

        public void run()
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);

                try{
                    sleep(500);
                    if(i==5)
                    {
                        stop();
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }

            }
        }

        public static void main(String[]a)
        {
            thexample obj = new thexample();
            obj.start();
        }
    }
