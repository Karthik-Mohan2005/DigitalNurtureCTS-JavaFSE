class Logger {
    private static Logger log;
    private Logger(){
        System.out.println("Instance Created");
    }
    public static Logger getInstance(){
        if(log==null){
            log = new Logger();
        }
        return log;
    }
}
public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        Logger log3 = Logger.getInstance();
        System.out.println(log1==log2);
        System.out.println(log2==log3);
    }
}