### Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты. Ваша задача - придумать как можно больше различных тестов (Unit-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

>Unit-тесты:

* getPhoneBook - проверка метода класса возвращения единственного экземпляра записной книжки

* addNewContact - проверка метода класса добавления нового контакта в записную книжку

* deleteContact - проверка метода класса удаления контакта из записной книжки

* getContactByID - проверка метода класса получения контакта по его ID

* getAllContacts - проверка метода класса получения списка всех контактов

* editContact - проверка метода класса редактирования контакта

>Интеграционные тесты:

* getRecord - проверка получения записи из базы данных методом класса записной книги

* removeRecord - проверка удаления записи из базы данных после удаления контакта из записной книги

* createRecord - проверка создания записи в базе данных после создания нового контакта в записной книге

* editRecord - проверка верности редактирования атрибутов в базе данных, после сохранения изменений в объекте класса

* showAllContacts - проверка отображения всего списка контактов в интерфейсе приложения

* showContactListAfterDel - проверка отображения списка контактов в интерфейсе после удаления контакта

* showContactListAfterCreate - проверка отображения списка контактов в интерфейсе после добавления контакта

>Сквозные тесты:

* createNewContactInUIToDataBase - проверка функционала по добавлению нового контакта из интерфейса приложения и его сохранению в базу