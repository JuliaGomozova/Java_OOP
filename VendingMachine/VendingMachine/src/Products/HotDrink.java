package Products;

public class HotDrink extends Product {

    
    /** объем напитка */
    private int volume;
    /** температура напитка */
    private int temper;

    /**
     * конструктор горячего напитка 4 параметра
     * @param name название напитка 
     * @param price цена напитка    
     * @param volume объем напитка
     * @param temper температура напитка 
     */

    
    public HotDrink(String name, double price, int volume, int temper)
    {
        super(name, price);
        this.volume = volume;
        this.temper = temper;
    }

    /**получаем объем напитка */
    public int getVolume() {
        return volume;
    }
    /**устанавливаем объем напитка */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**получаем температуру напитка */
    public int getTemper() {
        return temper;
    }
    /**устанавливаем температуру напитка */
    public void setTemper(int temper) {
        this.temper = temper;
    }

    /**
     * переопределение вывода горячего напитка
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        ", temper=" + temper +
        '}';
    }
    
    
}
