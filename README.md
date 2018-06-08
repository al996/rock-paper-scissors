# rock_paper_scissors

Rock Paper Scissors Cheater
- Unless the player score is one less than the win score, run the normal, non cheater code.  This way, the game will progress naturally until the player is about to win.  However, when the player is close to winning, run an alternate code.  First, ask the player to input their choice.  Next, use Math.random() to determine the computer choice.  If the computer choice loses against the player choice, redetermine the computer choice randomly until the computer choice is no longer the losing choice.  This way, there is another chance to tie, prolonging the game, and not just automatically allowing the computer to win right away.
