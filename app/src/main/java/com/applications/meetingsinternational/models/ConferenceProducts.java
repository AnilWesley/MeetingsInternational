package com.applications.meetingsinternational.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConferenceProducts {


    /**
     * status : true
     * registration_products : [{"productid":"44664","type":"academic","productname":"Registration","price1":"299","price2":"349","price3":"399","price4":"290","price5":"330","price6":"380","price7":"0","price8":"0","price9":"0","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44665","type":"academic","productname":"Poster Presentation","price1":"649","price2":"849","price3":"1049","price4":"610","price5":"790","price6":"970","price7":"540","price8":"700","price9":"860","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44666","type":"academic","productname":"Package A","price1":"849","price2":"949","price3":"1049","price4":"790","price5":"880","price6":"970","price7":"700","price8":"780","price9":"860","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44667","type":"academic","productname":"Package B","price1":"999","price2":"1099","price3":"1199","price4":"920","price5":"1020","price6":"1110","price7":"820","price8":"910","price9":"990","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44668","type":"academic","productname":"Delegate","price1":"349","price2":"399","price3":"449","price4":"330","price5":"380","price6":"420","price7":"0","price8":"0","price9":"0","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44669","type":"academic","productname":"Video Presentation","price1":"299","price2":"349","price3":"399","price4":"290","price5":"330","price6":"380","price7":"260","price8":"300","price9":"340","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44679","type":"academic","productname":"e Poster","price1":"199","price2":"249","price3":"299","price4":"200","price5":"240","price6":"290","price7":"180","price8":"220","price9":"260","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44670","type":"business","productname":"Registration","price1":"349","price2":"399","price3":"449","price4":"330","price5":"380","price6":"420","price7":"0","price8":"0","price9":"0","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44671","type":"business","productname":"Poster Presentation","price1":"699","price2":"799","price3":"899","price4":"650","price5":"740","price6":"830","price7":"580","price8":"660","price9":"740","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44672","type":"business","productname":"Package A","price1":"899","price2":"999","price3":"1099","price4":"830","price5":"920","price6":"1020","price7":"740","price8":"820","price9":"910","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44673","type":"business","productname":"Package B","price1":"1049","price2":"1149","price3":"1249","price4":"970","price5":"1060","price6":"1150","price7":"860","price8":"950","price9":"1030","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44674","type":"business","productname":"Delegate","price1":"399","price2":"449","price3":"499","price4":"380","price5":"420","price6":"470","price7":"0","price8":"0","price9":"0","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44675","type":"business","productname":"Exhibitor","price1":"1399","price2":"1599","price3":"1799","price4":"1290","price5":"1470","price6":"1650","price7":"1150","price8":"1310","price9":"1470","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"45829","type":"business","productname":"Video Presentation","price1":"349","price2":"399","price3":"449","price4":"330","price5":"380","price6":"420","price7":"300","price8":"340","price9":"380","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"45836","type":"business","productname":"E-poster","price1":"249","price2":"299","price3":"349","price4":"240","price5":"290","price6":"330","price7":"220","price8":"260","price9":"300","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44676","type":"student","productname":"Only Registration","price1":"149","price2":"199","price3":"249","price4":"150","price5":"200","price6":"240","price7":"220","price8":"300","price9":"340","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44677","type":"student","productname":"Delegate","price1":"199","price2":"249","price3":"299","price4":"200","price5":"240","price6":"290","price7":"0","price8":"0","price9":"0","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"},{"productid":"44678","type":"student","productname":"Poster Presentation","price1":"299","price2":"349","price3":"399","price4":"290","price5":"330","price6":"380","price7":"260","price8":"300","price9":"340","early":"August 15, 2020","normal":"August 30, 2020","final":"September 9, 2020"}]
     */

    private boolean status;
    private List<RegistrationProductsBean> registration_products;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<RegistrationProductsBean> getRegistration_products() {
        return registration_products;
    }

    public void setRegistration_products(List<RegistrationProductsBean> registration_products) {
        this.registration_products = registration_products;
    }

    public static class RegistrationProductsBean {
        /**
         * productid : 44664
         * type : academic
         * productname : Registration
         * price1 : 299
         * price2 : 349
         * price3 : 399
         * price4 : 290
         * price5 : 330
         * price6 : 380
         * price7 : 0
         * price8 : 0
         * price9 : 0
         * early : August 15, 2020
         * normal : August 30, 2020
         * final : September 9, 2020
         */

        private String productid;
        private String type;
        private String productname;
        private String price1;
        private String price2;
        private String price3;
        private String price4;
        private String price5;
        private String price6;
        private String price7;
        private String price8;
        private String price9;
        private String early;
        private String normal;
        @SerializedName("final")
        private String finalX;

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public String getPrice1() {
            return price1;
        }

        public void setPrice1(String price1) {
            this.price1 = price1;
        }

        public String getPrice2() {
            return price2;
        }

        public void setPrice2(String price2) {
            this.price2 = price2;
        }

        public String getPrice3() {
            return price3;
        }

        public void setPrice3(String price3) {
            this.price3 = price3;
        }

        public String getPrice4() {
            return price4;
        }

        public void setPrice4(String price4) {
            this.price4 = price4;
        }

        public String getPrice5() {
            return price5;
        }

        public void setPrice5(String price5) {
            this.price5 = price5;
        }

        public String getPrice6() {
            return price6;
        }

        public void setPrice6(String price6) {
            this.price6 = price6;
        }

        public String getPrice7() {
            return price7;
        }

        public void setPrice7(String price7) {
            this.price7 = price7;
        }

        public String getPrice8() {
            return price8;
        }

        public void setPrice8(String price8) {
            this.price8 = price8;
        }

        public String getPrice9() {
            return price9;
        }

        public void setPrice9(String price9) {
            this.price9 = price9;
        }

        public String getEarly() {
            return early;
        }

        public void setEarly(String early) {
            this.early = early;
        }

        public String getNormal() {
            return normal;
        }

        public void setNormal(String normal) {
            this.normal = normal;
        }

        public String getFinalX() {
            return finalX;
        }

        public void setFinalX(String finalX) {
            this.finalX = finalX;
        }
    }
}
