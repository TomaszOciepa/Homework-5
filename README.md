# Homework 5

1. Stwórz aplikację JEE (wykorzystaj Apache Maven), którą można zainstalować na serwerze.

2. Aplikacja powinna zawierać tylko jeden servlet, który będzie dostępny pod adresem ```/infoShareAcademy```.

3. Servlet powinien obsługiwać zapytania GET i POST.

4. Po wywołaniu w/w adresu metodą GET, powinien pojawić się w odpowiedzi tekst, w którym będzie imię, nazwisko i nazwa zespołu oraz aktualna data i godzina na serwerze, np.:

```
Jan Kowalski
jjdd5-zespół
2018-12-08T12:13:34.321
```

5. Po wywołaniu w/w adresu metodą POST, powinien pojawić się w odpowiedzi dokument HTML, zawierający listę wszystkich przesłanych w zapytaniu parametrów oraz ich wartości. UWAGA! Protokół HTTP pozwala na przesłanie wielu wartości w ramach jednego parametru (listy).

```
param1=abc
param2=def
param3=wartosc1
param3=wartosc2
```
