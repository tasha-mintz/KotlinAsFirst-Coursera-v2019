@file:Suppress("UNUSED_PARAMETER", "DEPRECATION")

package lesson1.task1

import kotlin.math.sqrt
import kotlin.math.*


fun main(args: Array<String>) {
    val answer1 = quadraticEquationRoot(1.0, -6.0, 5.0)
    val answer2 = angleInRadian(36, 14, 35)
    val answer3 = thirdDigit1(3901)
    val answer4 = thirdDigit2(3861)
    val answer5 = seconds(8, 20, 35)
    val answer6 = lengthInMeters(8, 2, 11)
    val answer7 = trackLength(3.0, 0.0, 0.0, 4.0)
    val answer8 = travelMinutes(9, 25, 13, 1)
    val answer9 = accountInThreeYears(100, 10)
    val answer10 = numberRevert(874)

    println("Корень квадратного уравнения = $answer1")
    println("Угол в радианах = $answer2")
    println("Вторая цифра = $answer3")
    println("Третья цифра = $answer4")
    println("Время в секундах = $answer5")
    println("Длина в метрах = $answer6")
    println("Длина отрезка = $answer7")
    println("Минуты в пути = $answer8")
    println("Доходность = $answer9")
    println("Обратное число = $answer10")
}

/**
 * Вычисление квадрата целого числа
 */
fun sqr(x: Int)
        = x * x

/**
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double)
        = x * x

/**
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double): Double
        = sqr(b) - 4 * a * c

/**
 * Поиск одного из корней квадратного уравнения
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double): Double
        = (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 }

/**
 * Пример главной функции
 */
fun main() {val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
    println("Root product: $x1x2") }


/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double =
        (((deg) * (PI / 180) ) + ((min) * (PI / (180 * 60))) + ((sec) * (PI / (180 * 3600))))


/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
fun thirdDigit1(number: Int): Int =
        ((number%1000 - number%100) / 100)


/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3861).
 * Определить вторую цифру справа в этом числе (в данном случае 6).
 */
fun thirdDigit2(number: Int): Int =
        ((number%100 - number%10) / 10)


/**
 * Тривиальная
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int =
        (( hours * 3600) + (minutes * 60) + seconds)

/**
 * Тривиальная
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double =
        ((sagenes * 48) + (arshins * 16) + vershoks) * 0.04445


/**
 * Тривиальная
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double =
        sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)))


/**
 * Простая
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int =
        ((hoursArrive * 60) + minutesArrive) - ((hoursDepart * 60) + minutesDepart)

/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int):
        Double = ((initial + (initial * (percent / 100.0))) + ((initial + (initial * (percent / 100.0)))*(percent / 100.0)) + (initial + (initial * (percent / 100.0))) + ((initial + (initial * (percent / 100.0)))*(percent / 100.0))*(percent / 100.0))

// (100+(100*10/100))+((100+(100*(10/100)))*10/100)

//110+
/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int = (number%10)*100 + ((number%100) - (number%10)) + (number%1000 / 100)

