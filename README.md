<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px" />

![image info](./img/1.png)

![image info](./img/2.png)
# Преобразование EO кода в Jаva

## Таблица соответствия сущнистей EO с Java

| EO | Java |
|:---|:-----|
| Описание объекта | Класс |
| Копия объекта | Экземпляр класса |
| Свободный аттрибут | Поле скласса |
| Датаризация объекта | Вызов метода _getData() |

### Комментарии
 * Значения свободных аттрибутов устанавливаются через конструктор класса

## Сравнение работы кода текущего компилятора с предлагаемым

### Код компилятора
30th Fibonacci number is 832040

real    1m8,963s<br>
user    1m9,882s<br>
sys     0m1,391s<br>

### Предложенный код
50th Fibonacci number is 12586269025


real    0m0,109s<br>
user    0m0,115s<br>
sys     0m0,034s<br>
