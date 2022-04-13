# Craps

## Introduction
This repository is an example of the game [craps](https://es.wikipedia.org/wiki/Craps#:~:text=El%20Craps%2C%20tambi%C3%A9n%20llamado%20pase,o%20en%20toda%20una%20ronda.) made in Java 8.

Here I should the process up to build this game. First, it's made on Structural paradigm, and then it's made on Object paradigm.

## Rules
The next rules are taking from various websites. I did a mix with all rules that I like, so maybe rules are not 100 % the originals.

## First stage
**Elementos del juego**
- Se utiliza programación estructurada.
- Habrá solo un jugador.
- Se debe realizar un menú para indicar qué quiere realizar el usuario.
  - Jugar.
    - Tirar dados.
  - Salir.

**Reglas**
- Primera ronda. Un jugador suma 2 dados y se suma la puntuación.
  - Si el resultado es 7 u 11, el jugador gana.
  - Si el resultado es 2, 3 o 12, el jugador pierde.
  - Si el resultado es otro, se pasa a la segunda ronda. Se anota el número que ha salido.
- Segunda ronda. Un jugador lanza 2 dados y suma la puntuación.
  - Si el resultado es 7, el jugador pierde la partida.
  - Si el resultado es igual que el mismo número que salió en la primera ronda, el jugador gana la partida.
  - Si el resultado no es ninguno de los dos anteriores, se vuelve a repetir la segunda ronda hasta que el jugador gane o pierda.

## Second stage
**Elementos del juego**
- Se utiliza programación estructurada.
- Habrá solo un jugador.
- Se debe realizar un menú para indicar qué quiere realizar el usuario.
    - Jugar.
        - Apostar
          - Solo una vez por lanzamiento de dados a partir de la segunda ronda.
        - Tirar dados.
    - Salir.

**Reglas**
- Serán las mismas que en la primera versión (First Stage).
- Al iniciar una partida, el usuario deberá apostar una cantidad mínima a definir.
- Si el jugador pierde, pierde la cantidad apostada.
- Si el jugador gana, obtiene lo apostado más la misma cantidad.
- A partir de la segunda ronda, el usuario podrá aumentar su apuesta entre cada lanzamiento de dados.

## Third stage
- El juego se hará usando el paradigma de programación orientada a objetos.

## Fourth stage
- Al apostar, el jugador podrá apostar a:
- Apuesta de línea de pase.
  - Se sigue las mismas normas que antes.
- Apuesta de línea de no pase.
  - Si sale un 2 o un 3, el jugador gana.
  - Si sale un 7 o un 11, el jugador pierde.
  - Si sale un 12, hay empate. El juego termina y nadie pierde el dinero.
  - Si se saca cualquier otro número, se vuelve a lanzar los dados.
- Segunda ronda. Un jugador lanza 2 dados y suma la puntuación.
    - Si el resultado es 7, el jugador gana la partida.
    - Si el resultado es igual que el mismo número que salió en la primera ronda, el jugador pierde la partida.
    - Si el resultado no es ninguno de los dos anteriores, se vuelve a repetir la segunda ronda hasta que el jugador gane o pierda.

## Authors
Manuel Pérez Soto - Java and Flutter developer.