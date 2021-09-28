# Небольшое введение в Scalatest

* https://habr.com/ru/post/209578

**Scalatest** — это фреймворк для тестирования приложений, поддерживающий разные стили написания тестов.

Каждый из поддерживаемых стилей тестирования в **Scalatest** создан для использования в определенных целях.

---

Для использования каждого из стилей тестирования, необходимо создать класс, который будет реализовывать trait, в котором определён этот стиль тестирования.

Выбранный стиль определяет только то, как выглядят декларации тестов, все остальные возможности фреймворка будут работать одинаково, вне зависимости от того, какой из стилей тестирования был выбран.

---

### FlatSpec

**FlatSpec** — используют для юнит-тестов и для интеграционного тестирования.

**FlatSpec** это DSL позволяющий писать тесты в виде как можно более приближённом к написанию спецификации поведения тестируемого класса.

- **Assertions** в каждом стиле по умолчанию доступно 3 ассерта:
  - `assert` — для обычных проверок
  - `assertResult` — для проверки совпадения полученного и ожидаемого результата
  - `intercept` — для проверки что метод бросает ожидаемое исключение
- **Matchers**
  - `be` — одно из ключевых слов, которое можно использовать если подключить миксин *Matchers* в класс (который реализует тест)
- **Равенство** размер объекта, длина объекта
- **Проверка строк**
- **Проверка чисел**
- **Проверка булевых свойств**
- **Коллекции**
- **Свойства класса**
- **Соединение проверок логическими функциями**


### FeatureSpec

**FeatureSpec** — используют для приемочного тестирования.

**FeatureSpec** нацелен на создание приемочных тестов, облегчая программистам задачу работающим с не тестировщиками.

---

[GitHub * Personal access tokens](https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox/KtbxLwgswrfxtLZJbFzLlPHzglccGQBXXV)