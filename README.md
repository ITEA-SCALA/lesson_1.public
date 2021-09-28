# "Числа Фибоначчи" это элементы числовой последовательности, в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел

* https://blog.genuine.com/2019/05/fibonacci-in-scala-tailrec-memoized

```java
public int fibonacci(int i) {
    if (i < 0) 
        return 0;
    switch(i) {
        case 0:
            return 1;
        case 1:
            return 1;
        default:
            return fibonacci(i-1) + fibonacci(i - 2);
    }
} 
```


# FizzBuzz

Задача для чисел от 1 до 100 нужно выводить на экран:
- 'Fizz' если число делится на 3
- 'Buzz' если число делится на 5
- 'FizzBuzz' если число делится и на 3 и на 5
- в противном случае само число

* https://codereview.stackexchange.com/questions/40656/first-scala-fizzbuzz-implementation
* `Test cases in Scala`: https://www.scala-algorithms.com/FizzBuzz
* https://habr.com/ru/post/506570
