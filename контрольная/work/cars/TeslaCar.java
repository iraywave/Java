package work.cars;

public class TeslaCar extends Car{
    /***
     * @param color цвет автомобиля
     */
    public TeslaCar(String color) {
        super(color, "AUTO", 300, 640000);
    }

    /***
     * Новое изобретение компании Tesla - позволяет телепортироваться в свой гараж и закончить поездку
     */
    public void teleportHome(){
        stop();
        System.out.println("Ура! Вы телепортировались в свой гараж!\nВо Илон Макс дает...");
    }
}
