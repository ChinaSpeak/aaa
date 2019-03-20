package com.example.wee01.bean;

import java.util.List;

/**
 * @Auther: cx
 * @Date:
 * @Description:
 */
public class JavaBean {
    private DataBean data;

    @Override
    public String toString() {
        return "JavaBean{" +
                "data=" + data +
                '}';
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public class DataBean{
        private List<DataBeans> data;

        public List<DataBeans> getData() {
            return data;
        }

        public void setData(List<DataBeans> data) {
            this.data = data;
        }

        public class DataBeans {
            private String title;
            private String link;

            @Override
            public String toString() {
                return "DataBeans{" +
                        "title='" + title + '\'' +
                        ", link='" + link + '\'' +
                        '}';
            }
//            private List<String> pics;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }
    }
}
