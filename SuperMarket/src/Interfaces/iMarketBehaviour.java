package Interfaces;

import java.util.List;

import Classes.Actor;
/**
* интерфейс "поведение покупателей в маркете"
*/
public interface iMarketBehaviour {
    //прототипы методов
    void acceptToMarket(iActorBehaviour actor); //требования к метоту "пришел в магазин"
    void releaseFromMarket(List<Actor> actors); //требования к метоту "покинулв в магазин"
    void update();                              //метот обновления статуса
}