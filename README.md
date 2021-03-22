<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px" />

![image info](./img/1.png)

![image info](./img/2.png)
# Converting EO code to Java

## EO entity mapping table with Java

| EO | Java |
|:---|:-----|
| Description of the object | Class |
| Object copy | Instance of class |
| Free attribute | Class field |
| Object dataization | Calling the _getData () method |

### Comments (1)
 * The values of free attributes are set through the class constructor

## Comparison of the work of the code of the current compiler with the proposed

### Compiler code
30th Fibonacci number is 832040

real    1m8,963s<br>
user    1m9,882s<br>
sys     0m1,391s<br>

### Suggested Code
50th Fibonacci number is 12586269025


real    0m0,109s<br>
user    0m0,115s<br>
sys     0m0,034s<br>
