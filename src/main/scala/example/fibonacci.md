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