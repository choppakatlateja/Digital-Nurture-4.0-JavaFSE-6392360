class Logger{

    //Instances created using different Singleton Patterns
    private static Logger objLog;
    private static Logger objSync;
    private volatile static Logger objDouble;

    //Private Constructor
    private Logger(){}

    //Lazy Instantiation
    public static Logger getInstance(){
        if(objLog==null){
            objLog = new Logger();
        }
        return objLog;
    }

    //Synchronized Instantiation
    public static synchronized Logger getInstanceSync(){
        if(objSync==null){
            objSync = new Logger();
            System.out.println("This the Synchronous Logger");
        }
        return objSync;
    }

    //Double Checked Locking Pattern
    public static Logger getInstanceDouble(){
        if(objDouble==null){
            synchronized(Logger.class){
                if(objDouble==null)
                objDouble = new Logger();
            }
        }
        return objDouble;
    }
}