package com.springcore.standalonecollections;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String, Integer> feestructure;

    @Override
    public String toString() {
        return "{" + " friends='" + getFriends() + getFriends().getClass().getName() + "'" + ", feestructure='"
                + getFeestructure() + "'" + getFeestructure().getClass().getName() + "}";

    }

    public List<String> getFriends() {
        return this.friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeestructure() {
        return this.feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

}
