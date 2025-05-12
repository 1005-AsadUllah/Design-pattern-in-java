public class Eager{

    /*
     * Eagerly initialized singleton instance.
     * 
     * This object is created when the class is loaded into memory,
     * regardless of whether it's actually used in the program or not.
     * 
     * ✅ Advantage:
     * - Thread-safe without using synchronization.
     * 
     * ⚠️ Disadvantage:
     * - If the instance is never used, it still consumes memory.
     *   This could be a waste of resources in memory-critical applications.
     */
    private static final Eager eager = new Eager();

    public static Eager getEger()
    {
        return eager;
    }
}