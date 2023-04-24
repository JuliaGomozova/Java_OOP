package Interfaces;

/**
* интерфейс, позволяющий управлять очередью покупателей в магазине
*/
public interface iQueueBehaviour {
    // прототипы методов
    void takeInQueue(iActorBehaviour actor);  //добавление покупателя в очередь в магазине
    void releaseFromQueue();                  //удаление покупателя из очереди в магазине
    void takeOrder();                         //сделать заказ
    void giveOrder();                         //забрать заказ
    void bringOderBack(iReturnOrder actor);                     //принес заказ на возврат
    void comeOrderBack(iReturnOrder actor);                     //вернул заказ
}