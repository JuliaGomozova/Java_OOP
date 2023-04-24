package Interfaces;

import Classes.Actor;

/**
* интерфейс возврата товара
*/
public interface iReturnOrder {
    //прототипы метода
    void setBringOrderBack(boolean backOrder);      //установить статус покупателя "принес заказ на возврат"
    void setReturnOrder(boolean returnOrder);       //установить статус покупателя "возврат принят"
    boolean isBringOrderBack();                     //статус покупателя "принес возврат"
    boolean isReturnOrder();                        //статус покупателя "возврат принят"
    Actor getActor();                               // метод вернет тип Actor (ссылка на самого себя)
    
}
