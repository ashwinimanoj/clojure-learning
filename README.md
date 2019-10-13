I attended a meet up by clojure-bridge and here is my attempt at solving the assignments they had for us.

### Quidditch

* Write a clojure program to play the game of Quidditch (almost).

The game is played between two teams. For the purpose of this program, we are gonna simplify (and modify) the rules a little.

These are the moves allowed in our version of Quidditch:
1. Score (send the quaffle through the goalpost to get 10 points)
2. Beat (hit the other team player to make them lose 10 points)
3. Catch the snitch (get 150 points and end the game)

At the end of the game, whichever team has the most points wins.

How would you model the game? Let's start the game, shall we?

Additionally, try adding these constraints:
1. Once a game has ended, no team should be allowed to make a move. How will you handle that?
2. Introduce a new move. How about a foul? If a team fouls, the other team gets a free hit with a random chance of getting a score!

This is how the final game will look like:
#+BEGIN_SRC clojure
(-> (start-game :gryffindor :slytherin)
    (score :gryffindor)
    (beat :slytherin)
    (score :slytherin)
    (score :gryffindor)
    (beat :gryffindor)
    (score :slytherin)
    (catch-snitch :gryffindor)
    (result))
;=> Gryffindor won by 150 points!
#+END_SRC