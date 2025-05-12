public class Lazy{

    private  static Lazy lazy;

    //Private Constructor
    private Lazy(){

    }

    public static  Lazy getLazy()
    {
        synchronized(Lazy.class)
        {
            if(lazy == null)
            {
                lazy = new Lazy();
            }
        }
        

        return lazy;
    }


}