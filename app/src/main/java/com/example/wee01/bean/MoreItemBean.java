package com.example.wee01.bean;

import java.util.List;

/**
 * author:AbnerMing
 * date:2019/3/16
 */
public class MoreItemBean {

    private List<ItemsBean> items;

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * type : 0
         * title : 这三家美国律所为什么要调查京东？
         * desc : Rosen、Schall、Pomerantz三家美国律师事务所分别在官网宣布，将调查京东是否失实披露刘强东案情
         * image : https://img.huxiucdn.com/article/cover/201809/05/214458200889.jpg?imageView2/1/w/710/h/400/|imageMogr2/strip/interlace/1/quality/85/format/jpg
         * images : []
         */

        private int type;
        private String title;
        private String desc;
        private String image;
        private List<ImagesBean> images;

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public class ImagesBean{
            private String pic;

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }
}
