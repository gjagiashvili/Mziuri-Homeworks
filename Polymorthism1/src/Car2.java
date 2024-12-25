public class Car2 implements Starting, Steering {
    @Override
    public void start() {
        System.out.println("მანქანა დაიქოქა");
    }

    @Override
    public void stop() {
        System.out.println("მანქანა გაჩერდა");
    }

    @Override
    public void left() {
        System.out.println("მანქანა მარცხნივ მიდის");
    }

    @Override
    public void right() {
        System.out.println("მანქანა მარჯვნივ მიდის");
    }
}
