public class Lazy{

    private  static Lazy lazy;

    //Private Constructor
    private Lazy(){

    }

    /**
     * Returns the singleton instance using lazy initialization.
     * 
     * ✅ Lazy Initialization:
     * - The instance is created only when it is first requested.
     * - Saves memory and resources if the instance is never used.
     * 
     * ✅ Thread Safety:
     * - Synchronized block ensures that only one thread can create the instance.
     * 
     * ⚠️ Performance Concern:
     * - Every call to getLazy() will enter the synchronized block,
     *   which may reduce performance in highly concurrent environments.
     * 
     * Alternative:
     * - Use double-checked locking or the Bill Pugh Singleton pattern
     *   for better performance with thread safety.
     */
    
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