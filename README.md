MiniGolf
============

Mini Golf design/unit testing project for Prof. Wayne Pollock's
COP 2805-51052 Spring 2014 Java II class.

Project Roadmap:
------------

* Main.class
  Skeleton class containing newRound and getRound methods.
  
  - *newRound*(Player, Course)
    Creates a new round object containing the roundID, playerID,
    selectedCourse and score array, and passes a reference to
    the newly created Round object.

  - 
    

* *Player.class*
  Skeleton class containing a constructor method for new Player
  objects. 

  - *Player*(int playerID, String playerName, int[] playerStrokes,
           int HolesPlayed)

    Basic constructor method for the Player class. Holds values
    to track the player's name, ID number, the number of holes
    they have currently attempted, and their current number of
    strokes.

  - int *getPlayerStrokes*(int hole)
    Returns the number of strokes for a given hole number from
    the player's playerStrokes[] array.

  - int *getHolesPlayed*()
    Returns the number of holes the player has currently played.


* *Course.class*
  Skeleton class containing a constructor method for new Course
  objects, and get methods for the courseName, courseID,
  coursePar, and courseNumberOfHoles values.

  - *Course*(int courseID, String courseName,
           int NumberOfHoles, int[] coursePar)
    Basic constructor method for the Course class. Holds values
    to track the course name and ID, the number of holes in the
    course, and the par strokes for each hole.
  
  - int *getCourseID*()
    Simple get method which returns the ID number of the current
    Course object.

  - String *getCourseName*()
    Simple get method which returns the name of the current
    Course object.

  - String *getNumberOfHoles*()
    Simple get method which returns the number of holes for the
    current Course object.

  - String *getCoursePar*(int holeNumber)
    Simple get method which, given a hole number, returns the
    par number of strokes for the current Course object.


* *Round.class*
  Skeleton class containing a constructor method for new Round
  objects, and get methods for the Players and selectedCourse.
  
  - *Round*(List<Player> Players, Course selectedCourse)
    Basic constructor method for the Round class. Holds a list
    of registered Player objects and a single Course object.
  
  - List<Player> *getPlayers*()
    Returns a list of the Player objects associated with the
    current Round.

  - Course *getCourse*()
    Returns the Course object associated with the current Round.

* *CardStation.class*
  Skeleton class containing a basic constructor method for new
  CardStation objects, get methods for the associated
  stationID and stationPosition values, and utility methods to
  interface with the KeyPad class provided by the vendor.

  - *CardStation*(int stationID, int stationPosition)
    Basic constructor method for new CardStation objects,
    containing the station's ID number and the hole number
    it's registered to.

  - int *getKeyPress*()
    Gets the user's input from the Card Swipe Station keypad
    terminal and returns the integer value of input.

  - *printRound*(int playerID)
    Prints the scores for the current round for a given
    playerID value.

  - *printCoupon*(List<Player>)
    Prints the final score for all players in the list.
