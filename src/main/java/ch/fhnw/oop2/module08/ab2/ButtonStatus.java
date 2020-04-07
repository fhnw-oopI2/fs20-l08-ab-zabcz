package ch.fhnw.oop2.module08.ab2;

import java.util.Arrays;
import java.util.List;

public enum ButtonStatus {

    On, Off;

    private ButtonStatus(){

    }

    public static List<ButtonStatus> getAllStati(){
        return Arrays.asList(ButtonStatus.values());
    }
}
