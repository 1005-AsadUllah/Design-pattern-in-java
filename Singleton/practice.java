
public class practice {
    
    public static void main(String[] args) {
        
       Lazy lazy1 = Lazy.getLazy();
       Lazy lazy2 = Lazy.getLazy();
       System.out.println(lazy1.hashCode());
       System.out.println(lazy2.hashCode());

       Eager eager1 = Eager.getEger();
       Eager eager2 = Eager.getEger();

       System.out.println(eager1.hashCode());
       System.out.println(eager2.hashCode());
    }
}
