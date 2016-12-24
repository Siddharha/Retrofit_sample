package com.example.chandan.retrofit.model;


/**
 * Created by CHANDAN on 12/23/2016.
 */

public class UserResponse {


    /**
     * data : {"name":"Chandan Dey","phone_no":8670211650,"age":26}
     * errNode : {"errCode":0,"errMsg":"No Error"}
     */

    private DataBean data;
    private ErrNodeBean errNode;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public ErrNodeBean getErrNode() {
        return errNode;
    }

    public void setErrNode(ErrNodeBean errNode) {
        this.errNode = errNode;
    }

    public static class DataBean {
        /**
         * name : Chandan Dey
         * phone_no : 8670211650
         * age : 26
         */

        private String name;
        private long phone_no;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getPhone_no() {
            return phone_no;
        }

        public void setPhone_no(long phone_no) {
            this.phone_no = phone_no;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class ErrNodeBean {
        /**
         * errCode : 0
         * errMsg : No Error
         */

        private int errCode;
        private String errMsg;

        public int getErrCode() {
            return errCode;
        }

        public void setErrCode(int errCode) {
            this.errCode = errCode;
        }

        public String getErrMsg() {
            return errMsg;
        }

        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }
    }
}
