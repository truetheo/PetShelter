package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by a on 04-Jul-17.
 */

public final class PetContract {
    //storing an content authority value
    public static final String CONTENT_AUTHORITY = "com.example.adnroid.pets";
    //base content uri
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://"+CONTENT_AUTHORITY);
    //path tableName - this will be appended to the base Uri
    public static final String PATH_PETS = "pets";

    //preventing accidentally instantiating the contract class
    private PetContract(){}

    /* Inner class to define tables contents */
    public static class PetEntry implements BaseColumns {
        /** The content URI to access the pet data in the provider */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_WEIGHT = "weight";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_BREED = "breed";
        /**
         * Setting a static pet gender values
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }


}
