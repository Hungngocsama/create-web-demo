package com.example.createweb.business;

public class Survey {
    private User user;
    private String hearSource;
    private boolean receiveAnnouncements;
    private boolean receiveSpecialOffers;
    private String contactMethod;

    public Survey() {
        hearSource = "";
        receiveAnnouncements = false;
        receiveSpecialOffers = false;
        contactMethod = "";
    }

    public Survey(User user, String hearSource, Boolean receiveAnnouncements, Boolean receiveSpecialOffers, String contactMethod) {
        this.user = user;
        this.hearSource = hearSource;
        this.receiveAnnouncements = receiveAnnouncements;
        this.receiveSpecialOffers = receiveSpecialOffers;
        this.contactMethod = contactMethod;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHearSource() {
        return hearSource;
    }

    public void setHearSource(String hearSource) {
        this.hearSource = hearSource;
    }

    public boolean getReceiveAnnouncements() {
        return receiveAnnouncements;
    }

    public void setReceiveAnnouncements(boolean receiveAnnouncements) {
        this.receiveAnnouncements = receiveAnnouncements;
    }

    public boolean getReceiveSpecialOffers() {
        return receiveSpecialOffers;
    }

    public void setReceiveSpecialOffers(boolean receiveSpecialOffers) {
        this.receiveSpecialOffers = receiveSpecialOffers;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}
