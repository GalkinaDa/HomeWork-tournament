package org.example.HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void shouldWinPlayer1() {
        Player ok = new Player(34565, "Оксана", 374);
        Player fire = new Player(21000, "Федор", 158);
        Game game = new Game();

        game.register(ok);
        game.register(fire);

        int actual = game.round("Оксана", "Федор");
        int expected = 1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldWinPlayer2() {
        Player ok = new Player(34565, "Оксана", 374);
        Player fire = new Player(21000, "Федор", 158);
        Game game = new Game();

        game.register(ok);
        game.register(fire);

        int actual = game.round("Федор", "Оксана");
        int expected = 2;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldGameOfDraw() {
        Player ok = new Player(34565, "Оксана", 158);
        Player fire = new Player(21000, "Федор", 158);
        Game game = new Game();

        game.register(ok);
        game.register(fire);

        int actual = game.round("Оксана", "Федор");
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotRegisteredPlayer1() {
        Player ok = new Player(34565, "Оксана", 374);
        Player fire = new Player(21000, "Федор", 158);
        Game game = new Game();

        game.register(fire);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Оксана", "Федор");
        });
    }

    @Test
    public void shouldNotRegisteredPlayer2() {
        Player ok = new Player(34565, "Оксана", 374);
        Player fire = new Player(21000, "Федор", 158);
        Game game = new Game();

        game.register(ok);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Оксана", "Федор");
        });
    }




}
