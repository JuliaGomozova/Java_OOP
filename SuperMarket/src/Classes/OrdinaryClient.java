package Classes;

/**
 * класс обычного покупателя наследует абстрактный класс Actor
 */
public class OrdinaryClient extends Actor {

    /**
     * конструктор обчного покупателя 1 параметр
     * @param name намя покупателя
     */
    public OrdinaryClient(String name)
    {
        super(name); //вызов конструктора прородителя
    }   
    /**
    * переопределение метода от абстрактного класса Actor. Получения имени покупателя 
    */
    @Override
    public String getName() {        
        return super.name; 
    }
    // метод возвращает флаг сделал заказ покупатель или нет
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    // метод возвращает статус покупателя получил заказ или нет
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    //устанавлиевает статус покупателя "сделал заказ"
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }
    //устанавлиевает статус покупателя "получил заказ"
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    //возвращает сомого себя
    @Override
    public Actor getActor() {
        return this;
    }
    //устанавлиевает статус покупателя "принес заказ на возврат"
    @Override
    public void setBringOrderBack(boolean backOrder) {
        super.isBringROrderBack = backOrder;
    }
    //устанавлиевает статус покупателя "возврат осуществлен"
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;  
    }
    // метод возвращает флаг принес покупатель возврат заказа или нет
    @Override
    public boolean isBringOrderBack() {
        return super.isBringROrderBack;
    }
    // метод возвращает флаг осуществлен возврат заказа или нет
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    
}