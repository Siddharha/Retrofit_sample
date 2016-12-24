package com.example.chandan.retrofit.model;

/**
 * Created by CHANDAN on 12/24/2016.
 */

public class UserInput {

    /**
     * data : {"id":1234}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1234
         */

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
