/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ddaym
 */
public class Summary {
    private String eventName;
    private String eventType;
    private int guestNumb;
    private boolean Catering;
    private boolean Photo;
    private boolean DJ;

    public Summary(String eventName, String eventType, int guestNumb, boolean Catering, boolean Photo, boolean DJ) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.guestNumb = guestNumb;
        this.Catering = Catering;
        this.Photo = Photo;
        this.DJ = DJ;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getGuestNumb() {
        return guestNumb;
    }

    public void setGuestNumb(int guestNumb) {
        this.guestNumb = guestNumb;
    }

    public boolean isCatering() {
        return Catering;
    }

    public void setCatering(boolean Catering) {
        this.Catering = Catering;
    }

    public boolean isPhoto() {
        return Photo;
    }

    public void setPhoto(boolean Photo) {
        this.Photo = Photo;
    }

    public boolean isDJ() {
        return DJ;
    }

    public void setDJ(boolean DJ) {
        this.DJ = DJ;
    }
    
    @Override
    public String toString(){
        return "====Event Summary====\n\n" + getEventName()
                + "\nEvent Type: " + getEventType() + "\nGuests:" + getGuestNumb() + "\nCaterinig: " + isCatering()
                + "\nPhotography: " + isPhoto() + "\nDJ: " + isDJ();
    }
}
