package com.example.fumiaki.mydbapp;

import android.provider.BaseColumns;

/**
 * Created by fumiaki on 2015/12/17.
 */
public final class UserContract {

    public UserContract() {}

    public static abstract class Users implements BaseColumns { // _id
        public static final String TABLE_NAME = "users";
        public static final String COL_NAME = "name";
        public static final String COL_SCORE = "score";
    }

}
