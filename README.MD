# Calculator Service

## Описание
`Calculator Service` - это Spring Boot приложение, предоставляющее API для выполнения базовых математических операций, 
таких как сложение, вычитание, умножение и деление. Сервис логирует каждый вызов операций и возвращает результат.

## Функциональность
Сервис предоставляет следующие операции:

1. **Сложение (`sum`)**: складывает два числа.
2. **Вычитание (`subtract`)**: вычитает второе число из первого.
3. **Умножение (`multiply`)**: умножает два числа.
4. **Деление (`divide`)**: делит первое число на второе. Деление на ноль вызывает исключение.

## Использование
Сервис доступен по REST API с базовым URL `/api/calculator`.

### Примеры запросов:
- **Сложение:**
  ```http
  POST /api/calculator/sum
  Content-Type: application/json

  {
      "a": 10,
      "b": 5
  }

- **Вычитание:**
  ```http
  POST /api/calculator/subtract
  Content-Type: application/json

  {
      "a": 10,
      "b": 5
  }

- **Умножение:**
  ```http
  POST /api/calculator/multiply
  Content-Type: application/json

  {
      "a": 10,
      "b": 5
  }

- **Деление:**
  ```http
  POST /api/calculator/divide
  Content-Type: application/json

  {
      "a": 10,
      "b": 5
  }