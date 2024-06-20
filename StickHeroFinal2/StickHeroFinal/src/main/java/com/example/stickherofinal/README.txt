gameController Class:

Handles the game logic and user input.
Manages the pillars, the character, and the stick in the game.
Uses JavaFX to create the game interface.

MenuController Class:

Handles switching between different scenes in the game (e.g., PlayScene, PauseMenu).
Uses JavaFX to manage the user interface.

Character Class:

Represents the game character (possibly the player's avatar).
Uses JavaFX's ImageView to display the character's image.
Provides methods to move the character, make it fall, and retrieve its X-coordinate.

Stick Class:

Represents the stick used in the game.
Uses JavaFX's Line to draw the stick.
Provides methods to extend and rotate the stick, as well as retrieve its length and X-coordinate.
FXML Files (PlayScene.fxml, PauseMenu.fxml, MainMenu.fxml):

Define the structure of the graphical user interface using FXML.
FXML Annotations (@FXML):

Indicate the injection points for elements defined in FXML files.

Timeline and KeyFrame:

Used for animations and time-based events in JavaFX.

Random Class:

Generates random numbers for creating random pillar sizes and positions.
the code creates a simple game where the player controls a character that moves and jumps over pillars by extending and rotating a stick. The game has different scenes like the main menu, play scene, and pause menu, each managed by corresponding controllers. The character's movement and stick actions are triggered by user input events.
D Key (extendStick and stopStickExtension methods):
Usage: Pressing and releasing the "D" key.
Actions:
Pressing "D": Initiates the extension of the stick. This is handled by the extendStick method.
Releasing "D": Stops the extension of the stick and triggers the rotation of the stick. This is handled by the stopStickExtension method.
Additionally, it initiates the movement of the game character. If the character is over a gap between two pillars, the fall method is called to make the character fall.
These keyboard events are defined in the initialize method, where the event handlers (extendStick and stopStickExtension) are associated with the corresponding actions when the "D" key is pressed or released.