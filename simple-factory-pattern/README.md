##简单工厂设计模式
>现在对该系统进行修改，不再设计一个按钮工厂类来统一负责所有产品的创建，
>而是将具体按钮的创建过程交给专门的工厂子类去完成，我们先定义一个抽象的按钮工厂类，
>再定义具体的工厂类来生成圆形按钮、矩形按钮、菱形按钮等，它们实现在抽象按钮工厂类中定义的方法。
>这种抽象化的结果使这种结构可以在不修改具体工厂类的情况下引进新的产品，如果出现新的按钮类型，
>只需要为这种新类型的按钮创建一个具体的工厂类就可以获得该新按钮的实例，
>这一特点无疑使得工厂方法模式具有超越简单工厂模式的优越性，更加符合“开闭原则”。


>Java中的使用
>```
>jdbc:
>Connection conn=DriverManager.getConnection("jdbc:microsoft:sqlserver://loc
>alhost:1433; DatabaseName=DB;user=sa;password=");
>Statement statement=conn.createStatement();
>ResultSet rs=statement.executeQuery("select * from UserInfo");
>```