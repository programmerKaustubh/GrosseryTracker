package com.example.owner.grosserytracker.presenter;

public interface PresenterProvider {

    interface dataProvider{
        String getData();
        int getNumber();
    }

    interface dataCreator{
        void setData();
    }
}
