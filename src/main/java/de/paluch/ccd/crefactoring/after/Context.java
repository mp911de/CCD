package de.paluch.ccd.crefactoring.after;

/**
 * <br> <br>Project: CCD <br>Autor: mark <br>Created: 11.07.2012 <br> <br>
 */
public class Context {

    /**
     * 
     */
    public int price;
    /**
     * 
     */
    public int customerType;
    /**
     * 
     */
    public int value;
    /**
     * 
     */
    public String name;
    /**
     * 
     */
    public String articleId;
    /**
     * 
     */
    public long accountId;

    /**
     * 
     */
    public Context(int price, int customerType, int value, String name, String articleId, long accountId) {
        this.price = price;
        this.customerType = customerType;
        this.value = value;
        this.name = name;
        this.articleId = articleId;
        this.accountId = accountId;
    }
}