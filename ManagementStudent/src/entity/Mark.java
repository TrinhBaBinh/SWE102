/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


public class Mark {
    private int id;
    private String subject;
    private double mark;

    public Mark() {
    }

    public Mark(int id, String subject, double mark) {
        this.id = id;
        this.subject = subject;
        this.mark = mark;
    }
    public Mark(String subject, double mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    
}
