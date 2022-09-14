package JavaOOP;

// Create a class called Programming
// This class should have constructor, that accepts language argument
// This class should have a method called learningStatus()
// Also, class should have another boolean variable, learningComplete. The default value should be false
// Second method of the class, that is called completeLearning()
// This method should just change the value of learningComplete variable from false to true
// learningStatus() method should print "Learning ..."  and the name of the language, if you are still learning it
// And, if you finish learning, then the message should be "Mastered ..." and the language name

// Here in the main method, create an object of a class.
// Call learningStatus() method to print the status
// Then change the status using completeLearning() method
// And call learningStatus() method to print the status again

public class Programming {

    private String language;
    private boolean learningComplete = false;

    public Programming(String language) {
        this.language = language;
    }

    public void learningStatus() {
        if (learningComplete) {
            System.out.println("Mastered " + language + ".");
        } else {
            System.out.println("Learning " + language + ".");
        }
    }

    public void completeLearning() {
        learningComplete = true;
    }
}


