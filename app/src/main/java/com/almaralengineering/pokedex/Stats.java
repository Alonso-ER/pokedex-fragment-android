package com.almaralengineering.pokedex;

import android.os.Parcel;
import android.os.Parcelable;

public class Stats implements Parcelable{
    private final String hp;
    private final String atk;
    private final String def;
    private final String sp;

    public Stats(String hp, String atk, String def, String sp) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;

        this.sp = sp;
    }
    public String getHp() {
        return hp;
    }
    public String getAtk() {
        return atk;
    }
    public String getDef() {
        return def;
    }
    public String getSp() {
        return sp;
    }
    protected Stats(Parcel in) {
        hp = in.readString();
        atk = in.readString();
        def = in.readString();
        sp = in.readString();
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(hp);
        dest.writeString(atk);
        dest.writeString(def);
        dest.writeString(sp);
    }
    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Stats> CREATOR = new Parcelable.Creator<Stats>() {
        @Override
        public Stats createFromParcel(Parcel in) {
            return new Stats(in);
        }
        @Override
        public Stats[] newArray(int size) {
            return new Stats[size];
        }
    };
}







