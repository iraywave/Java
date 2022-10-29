package work.cars;

public abstract class Car {
    /***
     * @param color цвет автомобиля
     * @param type тип коробки передач
     * @param maxSpeed максимальная скорость
     * @param price цена
     */
    public Car(String color, String type, int maxSpeed, int price){
        this.color = color;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;

        this.curSpeed = 0;
        this.isStarted = false;
    }

    private String color;
    private String type;
    private int maxSpeed;
    private int curSpeed;
    private int price;
    private boolean isStarted;

    public int getPrice() {
        return price;
    }

    public int getCurSpeed() {
        return curSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public boolean isStarted() {
        return isStarted;
    }

    /***
     * Starts the car
     */
    public void start(){
        if(isStarted){
            System.out.println("The car already has bean started!");
        }
        else{
            isStarted = true;
            System.out.println("The car was successfully started.");
        }
    }

    /***
     * Change the speed of started car
     * @param speed
     */
    public void accelerate(int speed){
        if(isStarted){
            this.curSpeed = speed;
            System.out.println("The car has been accelerated, current speed = " + curSpeed);
            System.out.println("Vroom vroom....");
        }
       else{
            System.out.println("The car is not started!\n Firstly you need to start it!");
        }
    }

    /***
     * Stops the car
     */
    public void stop(){
        if(!isStarted){
            System.out.println("The car is not riding now!");
        }
        else{
            this.curSpeed = 0;
            isStarted = false;
            System.out.println("The car was successfully stopped");
        }
    }
}
