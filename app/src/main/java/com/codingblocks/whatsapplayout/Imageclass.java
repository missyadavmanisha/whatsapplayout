package com.codingblocks.whatsapplayout;

public class Imageclass {
     String image,name,lastmessege;

    public Imageclass(String image, String name, String lastmessege) {
        this.image = image;
        this.name = name;
        this.lastmessege = lastmessege;
    }

    public String getLastmessege() {
        return lastmessege;
    }

    public void setLastmessege(String lastmessege) {
        this.lastmessege = lastmessege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

