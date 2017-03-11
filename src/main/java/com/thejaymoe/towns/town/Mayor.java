package com.thejaymoe.towns.town;

import java.util.UUID;

/**
 * Created by Johnny on 2017-03-11.
 */
public class Mayor {

    private UUID uuid;
    private String mayorName;

    public Mayor(UUID uuid, String mayorName){
        this.uuid = uuid;
        this.mayorName = mayorName;
    }

    public UUID getUniqueID(){
        return uuid;
    }

    public String getMayorName(){
        return mayorName;
    }

}
