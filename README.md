# Домашнее задание к занятию «Строки и массивы»

##  Инструкция к выполнению домашнего задания

Перед тем как отправить своё решение на проверку преподавателю, сверьтесь с чеклистом.

<details>
  <summary> 1. В решении выполнены все требования задания</summary>
  
  Убедитесь, что все требования задания выполнены. Для этого перед отправкой внимательно прочтите весь текст условия задания и соотнесите сказанное в нём с вашим решением. Навык самопроверки работы перед ревью пригодится вам как при обучении, так и на работе.

  ---
  
</details>
<details>
   <summary>2. Правильно настроен Maven-проект, тесты проходят</summary>
  
  Репозиторий должен быть папкой вашего Мавен-проекта. Обратите внимание, что репозиторием не должна быть папка, в которой лежит папка Мавен-проекта, он сам должен быть папкой проекта. В нём должны быть соответствующие файлы и папки — `pom.xml`, `src` и другие.
  
  Не забудьте создать .gitignore-файл в корне проекта и добавить туда в игнорирование автогенерируемую папку `target`.
  
  Общая схема вашего `pom.xml`-файла:
  
  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>ru.netology</groupId>
    <artifactId>НАЗВАНИЕ-ВАШЕГО-ПРОЕКТА-БЕЗ-ПРОБЕЛОВ</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>


    <dependencies>
        <dependency>
            ...
        </dependency>
        ...
    </dependencies>


    <build>
        <plugins>
            <plugin>
              ...
            </plugin>

            <plugin>
              ...
              <executions>
                <execution>
                  ...
                </execution>
                ...
              </executions>
            </plugin>
            ...
        </plugins>
    </build>

</project>
  ```
  
  #### JUnit
  Обратите внимание, что у артефакта нет `-api` на конце. Если у вас автоматически добавилась зависимость вида `<artifactId>junit-jupiter-api</artifactId>`, то лучше поменять артефакт на тот, что ниже, иначе будут сюрпризы в работе.

  ```xml
          <dependency>
              <groupId>org.junit.jupiter</groupId>
              <artifactId>junit-jupiter</artifactId>
              <version>5.7.0</version>
              <scope>test</scope>
          </dependency>
  ```

  #### Surefire
  Без этого плагина тесты могут Мавеном не запускаться, хоть в идее через кнопки они и будут проходить. Чтобы лишний раз убедиться, что всё работает, нажмите `Ctrl+Ctrl` и затем `mvn clean test`.
  
  ```xml
              <plugin>
                  <groupId>org.apache.maven.plugins</groupId>
                  <artifactId>maven-surefire-plugin</artifactId>
                  <version>2.22.2</version>
                  <configuration>
                      <failIfNoTests>true</failIfNoTests>
                  </configuration>
              </plugin>
  ```
  
  ---
  
</details>

<details>
  <summary> 3. Что делать, если возникли сложности </summary>
  
Это здорово. Если их преодолевать правильно, то можно получить большую образовательную пользу для себя. Периодическое возникновение вопросов, недопонимание пройденного материала — нормальная и неотъемлемая часть обучения. А мы здесь, чтобы помочь вам пройти этот путь.
  
  ### Что делать, если непонятна теория
  1. Если подобный вопрос разбирался на лекции, посмотрите ещё раз раздел с этой темой в видеозаписи.
  1. Если вопрос не решился, попробуйте поискать ответ самостоятельно в интернете, этот навык пригодится вам в работе.
  1. Если самостоятельно разобраться не удалось, задайте вопрос в общем чате, мы обязательно поможем.

  ### Что делать, если непонятно условие задания
  1. Прежде чем задать вопрос по условию задачи, перечитайте его ещё раз и убедитесь, что в тексте условия нет прямого ответа на этот вопрос. Умение работать с текстом — важный навык работы с информацией.
  1. Если ответа на свой вопрос в тексте условия не увидели, задайте его в общем чате, мы раскроем детали условия.

  ### Что делать, если не получается задача
Если ваша проблема — это **ошибка компиляции** — подчёркивает красным, не даёт запустить программу, сборки проекта, CI и прочие подобные ошибки, то:
  1. Найдите и прочитайте текст ошибки, который вам подсвечивает идея или логи. «Подчёркивает красным» — это не описание ошибки.
  1. Попробуйте понять текст ошибки, при необходимости воспользуйтесь переводчиком. Не страшно, если вы переведёте неточно, тут главное — сам процесс: со временем и с нашей помощью вы будете это делать лучше и лучше, но, пропуская этот этап, вы не сможете научиться это делать.
  1. Если не получилось понять ошибку по её тексту, попробуйте её загуглить и изучить подобную ошибку у других людей. Попробуйте примерить решения их проблем на свой код. Соотнесите найденные описания ошибки с пройденной теорией.
  1. Если всё равно ваши трудности не разрешились, напишите в общий чат, обязательно указав:
      1. название задачи и ссылку на условие;
      1. ссылку на вашу работу;
      1. текст и скриншот, не фотографию, ошибки;
      1. ваши размышления и описание шагов, которые вы совершили для решения.

Если ваша проблема — это **ошибка исполнения**, программа умирает уже после запуска, или она **отрабатывает неправильно**, из-за чего ваши тесты не проходят, то:
  1. Воспользуйтесь отладчиком для пошагового анализа работы вашей программы. Так вы или убедитесь в неправильности придуманного вами алгоритма, или найдёте конкретное место, где ожидаемое поведение программы разошлось с фактическим.
  1. Если проблему найти не получилось, напишите в общий чат, обязательно указав:
      1. название задачи и ссылку на условие;
      1. ссылку на вашу работу;
      1. конкретное и подробное описание проблемы или затруднения при решении задачи. «Помогите, что-то не так» — это не описание;
      1. подробное описание вашего анализа программы с помощью отладчика вместе со скринами;
      1. ваши размышления и описание шагов, которые вы совершили для решения.
  ---
  
</details>
  

<details open>
  <summary>4. Отформатирован код</summary>
  
Кроме правил, нарушение которых приводит к ошибкам компиляции, есть ещё и [правила форматирования кода](https://google.github.io/styleguide/javaguide.html), соблюдение которых обязательно при написании программ.
  
С большинством проблем может справиться автоформатирование в идее. Для этого выберите `Code -> Reformat code` в меню или используйте горячие сочетания клавиш. В меню будет показано актуальное сочетание для вашей операционной системы. Так, идея поправит неправильные отступы, пробелы и некоторые другие ошибки. Следите, чтобы у `if-else`, `for`, `while` всегда были `{}`.
  
  Проблемы с именованием сущностей нужно решать самим. Так, все ячейки, кроме `final`-констант, и методы должны писаться [камелкейсом](https://ru.wikipedia.org/wiki/CamelCase) с **маленькой** буквы, а классы и интерфейсы — камелкейсом с **большой** буквы.
  
  Мы вам настоятельно советуем всегда держать код в отформатированном виде во время разработки, со временем глаз привыкнет, и вы почувствуете, насколько это облегчает поиск ошибок в коде и его анализ. В любом случае перед отправкой кода на проверку его обязательно нужно отформатировать, иначе он может быть отправлен на доработку без более глубокой проверки на этой итерации.
</details>

# Задание 1. Статистика (обязательное к выполнению)

Статистика — очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: `[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]`.

Программисты все заняты, и вам поручили написать небольшой сервис, который умеет по предоставленному ему массиву месячных продаж рассчитывать:
1. Сумму всех продаж.
2. Среднюю сумму продаж в месяц.
3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
5. Количество месяцев, в которых продажи были ниже среднего (см. п.2).
6. Количество месяцев, в которых продажи были выше среднего (см. п.2).

Примечание:* в вашем задании нужно найти последний месяц, соответствующий условиям.

Сервис должен представлять собой один класс с шестью методами — по методу на пункт. Входные данные для расчёта сервис должен принимать в параметрах своих методов. Обратите внимание, что написанный класс должен уметь работать с любыми значениями в массиве продаж, а приведённый выше набор — это лишь пример данных для ваших тестов на методы создаваемого класса.

Метод ниже считает номер месяца минимальных продаж. Логика его такова: заводим переменную `minMonth` для хранения номера ячейки в массиве того месяца, в котором были минимальные продажи среди всех уже просмотренных. Изначально мы никакие ещё не просмотрели, потому запишем туда номер 0. Будем циклом поочерёдно смотреть месяцы продаж: на каждой итерации у нас в `sale` будет количество продаж в рассматриваемом месяце, в `month` — номер этого рассматриваемого месяца. Если мы смотрим на месяц, в котором продажи меньше, чем в минимальном из просмотренных ранее, чей номер запомнен в `minMonth`, то считаем теперь этот рассматриваемый месяц минимальным и присваиваем в `minMonth` значение `month`. И так до конца массива продаж, тогда после цикла в `minMonth` у нас будет лежать номер месяца минимальных продаж. Останется только один момент: мы нумеровали месяцы с нуля, так как в массивах ячейки нумеруются с нуля, потому, отдавая ответ, нам надо прибавить 1.

```java
public int minSales(long[] sales) {
  int minMonth = 0;
  int month = 0; // переменная для индекса рассматриваемого месяца в массиве
  for (long sale : sales) {
    // sales[minMonth] - продажи в месяце minMonth
    // sale - продажи в рассматриваемом месяце
    if (sale <= sales[minMonth]) {
      minMonth = month;
    }
    month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
  }
  return minMonth + 1;
}
```

Вам необходимо
1. Создать Maven-проект, в котором в package `ru.netology.stats` будет класс `StatsService` с необходимыми методами, сами придумайте им говорящие названия.
1. Написать на каждый метод по одному автотесту, который проверяет правильность работы на тестовых данных.
1. Убедиться, что ваши автотесты работают и проходят. Для этого пробуйте ронять каждый свой тест и удостоверяйтесь, что он действительно падает.

Итого: отправьте на проверку ссылку на репозиторий GitHub с вашим проектом.
