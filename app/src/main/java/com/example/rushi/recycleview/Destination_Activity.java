package com.example.rushi.recycleview;

/**
 * Created by rushi on 12/16/2017.
 */

public class Destination_Activity {
    private String name;
    private int rupee;
    private int image_id;

    public Destination_Activity(String name, int rupee, int image_id) {
        this.name = name;
        this.rupee = rupee;
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public int getRupee() {
        return rupee;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRupee(int rupee) {
        this.rupee = rupee;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
