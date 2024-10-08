package lesson_7;

import lesson_7.model.Car;
import lesson_7.model.SportCar;
import lesson_7.model.TruckCar;

public class Test {
    public static void main(String[] args) {
        /**
         * * ООП - объектно-ориентированное программирование. Основные принципы:
         * 1. Инкапсуляция - область видимости, реализована через модификаторы доступа:
         * public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случаев использует
         * protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других ＿
         *  --------- будет доступен только внутри текущего пакета (текущей папки);
         * private - только внутри текущего класса (файла);
         * 2. Наследование - extends - это механизм, который позволяет создавать классы на основе
         * других классов наследую их метады в дочерних (подчиненных) классах.
         * 3. Абстракция - означает выделение главных, наиболее значимых характеристик предмета и
         * нооборот - отбрасывание второстепенных, незначительных.
         * 4. Полиморфизм - это способность программы идентично использовать объекты с одинаковым интерфейсом
         *  без информации о конкретном типе этого объекта.
         *  Мы можем работать со многими типами, как с одним (при условии, что эти типы являются производными (дочерними)
         *  от базового (разового) типа).
         *
         *
         * Для проверки можно ли наследоваться слово extends нужно заменить на "ЯВЛЯЕТСя ли",
         *  при однозначном ДА можно наследоват Если создать массив Человек[] люди = Человек[5];
         *  Тогда в нем можно хранить объекты подчиненных классов Ученик и Работник, а также ниже по иерархии,
         *  например ученик может делиться на первоклассников
         * и старшеклассников.
         * */

        Car car = new Car();

        SportCar sportCar = new SportCar();

        TruckCar truckCar = new TruckCar();

        int a = 5;

        // Слева какой тип объекта будет создан
        // Справа какая реализация наследования будет храниться в это объекте
        Car testCar = new SportCar();

        car.printVoiceOfCar();

        truckCar.printVoiceOfCar();

        sportCar.printVoiceOfCar();

        testCar.printVoiceOfCar();

        testCar = new TruckCar();

        testCar.printVoiceOfCar();

    }
}
