package changerequestsstatuses;

import edbosync.EdboRequest;

/**
 * Приложения для изменения статусов заявок в ЕДБО
 *
 * @author Сергей Чопоров
 */
public class ChangeRequestsStatuses {

    /**
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
//'0', 'Видалена', 'Те саме, що й ID 10', 'removed'
//'1', 'Нова заява', 'Статус встановлюється автоматично, при створенні нової заяви', 'created'
//'2', 'Відмова', 'Статус, який визначає заяви, які були відмовлені ВНЗ, але які ще можуть бути повернені у зв\'язку з діями вступника', 'denied'
//'3', 'Скасована', 'Статус видалених заяв', 'canceled'
//'4', 'Допущена', 'Заява, яка бере участь у конкурсі', 'confirmed'
//'5', 'Рекомендовано', 'Заяви, які пройшли конкурс', 'committed'
//'6', 'Відхилено', 'Заяви, які не пройшли конкурс', 'rejected'
//'7', 'До наказу', 'Заява для внесення в наказ на зарахування', 'submitted'
//'8', 'Заяви, які прийшли з сайту', 'Заяви, статус яких потрібно підтвердити', 'sitereg'
//'9', 'Затримано', 'Заяву призупинено на час роботи конфліктної коміссії', 'delayed'
//'10', 'Видалена', 'Видалена з бази \"абітурієнт\"', 'removed'

        EdboRequest edboRequest = new EdboRequest();
//        System.out.println(new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format("04.07.2014"));
        String changeStatuses = edboRequest.changeStatuses(1, 4, "2014-07-04", "12", "04.07.2014 17:40:00");
        System.out.println(changeStatuses);
    }

}
