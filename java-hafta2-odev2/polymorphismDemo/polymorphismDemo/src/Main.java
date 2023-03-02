public class Main {
    public static void main(String[] args) {

        //Çok Biçimlilik
        EmailLogger emailLogger=new EmailLogger();
        emailLogger.Log("deneme log");
        DatabaseLogger databaseLogger=new DatabaseLogger();
        System.out.println("Hello world!");

        BaseLogger[] logger=new BaseLogger[]{new DatabaseLogger(),new EmailLogger(),new FileLogger()};
        for (BaseLogger logger1:logger)
            logger1.Log("Log mesajı");

    }
}