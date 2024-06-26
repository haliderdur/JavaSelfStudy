package Replit.OOP.BookShelfTask;

/**
 * Represents an individual copy of a book
 */

public class Book {

    private String author;
    private String title;
    private int id;
    private int pages;
    //static variable to track number of books with unknown author
    private static int unknownAuthors;

    /**
     * Utility static method: capitalize
     * accepts a String and then returns in capitalized form(first uppercase - rest lowecase)
     * if argument is empty, it returns an empty String ""
     * capitalize("jAVa") => "Java"
     * capitalize("HTML") => "Html"
     * capitalize("") => ""
     * This method will be used in setAuthor(), setTitle() methods
     */

    public static String capitalize(String word) {

        if (word.isEmpty()) {
            return "";
        } else if ((word.contains(" ")) || (!word.isEmpty())) {
            String[] arrayWord = word.split(" ");

            for (String eachWord : arrayWord) {
                eachWord.toLowerCase();
            }
            String firstName = arrayWord[0];
            String lastName = arrayWord[1];

            String firstLetterName = firstName.substring(0, 1).toUpperCase();
            String resultName = firstLetterName + firstName.substring(1);

            String lastLetterName = lastName.substring(0, 1).toUpperCase();
            String resultLastName = lastLetterName + lastName.substring(1);
            return resultName + " " + resultLastName;

        } else {
            return "";
        }
    }

    /**
     * Utility static method: isTitleWord
     * -This method will be used in setTitle() method
     * -Accepts a words to check if it is a part of the title or just an article etc.
     * - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
     * -else method returns true
     * Articles:
     * "a" , "an", "the"
     * Coordinate conjunctions:
     * "and", "but", "for", "nor", "or", "so", "yet"
     * Most common single-word English prepositions:
     * "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"
     * <p>
     * isTitleWord("Apple") => true
     * isTitleWord("a") => false
     * isTitleWord("BUT") => false
     * isTitleWord("THE") => false
     * isTitleWord("neaR") => false
     * isTitleWord("java") => true
     */

    public static boolean isTitleWord(String word) {
        if (word.equalsIgnoreCase("a") || word.equalsIgnoreCase("an") || word.equalsIgnoreCase("the") || word.equalsIgnoreCase("and") ||
                word.equalsIgnoreCase("but") || word.equalsIgnoreCase("for") || word.equalsIgnoreCase("nor") || word.equalsIgnoreCase("or") ||
                word.equalsIgnoreCase("so") || word.equalsIgnoreCase("yet") || word.equalsIgnoreCase("at") || word.equalsIgnoreCase("by") ||
                word.equalsIgnoreCase("in") || word.equalsIgnoreCase("into") || word.equalsIgnoreCase("near") || word.equalsIgnoreCase("of") ||
                word.equalsIgnoreCase("on") || word.equalsIgnoreCase("to") || word.equalsIgnoreCase("than") || word.equalsIgnoreCase("via")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * No args constructor. Stays empty
     */

    public Book() {
    }

    /**
     * 4 args constructor. accepts id, author, title, pages
     * CALLS SETTER methods to assign to instance variables.
     * ex: setId(id);
     * It does NOT directly assign to the instance variable
     * ex: NO => this.id = id;
     */

    public Book(int id, String author, String title, int pages) {
        setId(id);
        setAuthor(author);
        setTitle(title);
        setPages(pages);
    }


    /**
     * setAuthor method will be used to set value to private author of the Book
     *
     * @param author : String
     *               Conditions:
     *               => if parameter author is value is empty, 1) "Unknown" is assigned to instance variable author
     *               2) static unknownAuthors is incremented by one.
     *               => Each word in Book author's name should be capitalized. CALL capitalize method
     *               Example:
     *               Book b = new Book();
     *               b.setAuthor("mArufJon temirov"); => assigns "Marufjon Temirov" to this.author
     *               b.setAuthor("ironMAN"); => assigns "Ironman" to this.author
     *               b.setAuthor("") => assigns "Unknown" to this.author and unknownAuthors++
     */


    public void setAuthor(String author) {
        if (author.isEmpty()) {
            setAuthor("Unknown");
            unknownAuthors++;
        } else {
            this.author = Book.capitalize(author);
        }
    }

    /**
     * setTitle method will be used to set value to private title of the Book
     *
     * @param title : string
     *              Conditions:
     *              => if title is single word, capitalize it and assign to this.title.
     *              => if title is empty, assign "" to this.title (<- we will handle this in Shelf class properly)
     *              => You need to capitalize each word of title except articles, coordinate conjunctions, or prepositions.
     *              See full list in isTitleWord method, they need to be all lowercase.
     *              -> Call isTitleWord() method to check if a word needs to be capitalized or not.
     *              -> Call capitalize method to capitalize title words.
     *              => First word is always capitalized regardless if it is article etc.
     *              Ex:
     *              Book book = new Book();
     *              book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
     *              <p>
     *              book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
     */

    public void setTitle(String title) {
        if (!title.contains(" ")) {
            this.title = Book.capitalize(title);
        }
        if (title.isEmpty()) {
            this.title = "";
        }
        if (!(title.equalsIgnoreCase("a") || title.equalsIgnoreCase("an") || title.equalsIgnoreCase("the") || title.equalsIgnoreCase("and") ||
                title.equalsIgnoreCase("but") || title.equalsIgnoreCase("for") || title.equalsIgnoreCase("nor") || title.equalsIgnoreCase("or") ||
                title.equalsIgnoreCase("so") || title.equalsIgnoreCase("yet") || title.equalsIgnoreCase("at") || title.equalsIgnoreCase("by") ||
                title.equalsIgnoreCase("in") || title.equalsIgnoreCase("into") || title.equalsIgnoreCase("near") || title.equalsIgnoreCase("of") ||
                title.equalsIgnoreCase("on") || title.equalsIgnoreCase("to") || title.equalsIgnoreCase("than") || title.equalsIgnoreCase("via"))) {
            this.title = Book.capitalize(title);
        } else if (title.startsWith("a") || title.startsWith("an") || title.startsWith("the") || title.startsWith("and") ||
                title.startsWith("but") || title.startsWith("for") || title.startsWith("nor") || title.startsWith("or") ||
                title.startsWith("so") || title.startsWith("yet") || title.startsWith("at") || title.startsWith("by") ||
                title.startsWith("in") || title.startsWith("into") || title.startsWith("near") || title.startsWith("of") ||
                title.startsWith("on") || title.startsWith("to") || title.startsWith("than") || title.startsWith("via")) {
            this.title = Book.capitalize(title);
        } else {
            this.title = title.toLowerCase();
        }

    }

    /**
     * toString instance method, String representation of the Book object
     *
     * @return String
     * Format includes author, title, id, pages of the Book object:
     * Book[author=Marufjon T, title=Selenium Cookbook, id=10, pages=300]
     */

    public String toString() {
        // TODO

        return null;
    }

    /**
     * Getter methods for static unknownAuthors
     *
     * @returns unknownAuthors value
     */

    public static int getUnknownAuthors() {
        // TODO

        return 0;
    }

    /**
     * Getter methods for private pages
     *
     * @returns pages value
     */

    public int getPages() {
        // TODO

        return 0;
    }

    /**
     * Setter method for private pages. No conditions
     *
     * @param pages
     */

    public void setPages(int pages) {
        // TODO

    }

    /**
     * public Getter method for private author
     */

    public String getAuthor() {
        // TODO

        return null;
    }


    /**
     * public Getter method for private title
     */

    public String getTitle() {
        // TODO

        return null;
    }

    /**
     * public Getter method for private id
     */
    public int getId() {
        // TODO

        return 0;
    }

    /**
     * public setter method for private id
     */
    public void setId(int id) {
        // TODO

    }

}
